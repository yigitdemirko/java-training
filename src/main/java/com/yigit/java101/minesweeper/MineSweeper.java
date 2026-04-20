package com.yigit.java101.minesweeper;

import java.util.Random;
import java.util.Scanner;

public class MineSweeper {
    private String[][] mineMap;
    private String[][] displayMap;
    private int rows;
    private int cols;
    private int mineCount;
    private int openedCount;
    private Scanner scanner;

    public MineSweeper(int rows, int cols, Scanner scanner) {
        this.rows = rows;
        this.cols = cols;
        this.mineCount = (rows * cols) / 4;
        this.openedCount = 0;
        this.scanner = scanner;

        mineMap = new String[rows][cols];
        displayMap = new String[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                mineMap[i][j] = "-";
                displayMap[i][j] = "-";
            }
        }

        placeMines();
    }

    private void placeMines() {
        Random rand = new Random();
        int placed = 0;
        while (placed < mineCount) {
            int r = rand.nextInt(rows);
            int c = rand.nextInt(cols);
            if (!mineMap[r][c].equals("*")) {
                mineMap[r][c] = "*";
                placed++;
            }
        }
    }

    private void printMap(String[][] map) {
        for (String[] row : map) {
            for (String cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
    }

    private int countAdjacentMines(int row, int col) {
        int count = 0;
        for (int dr = -1; dr <= 1; dr++) {
            for (int dc = -1; dc <= 1; dc++) {
                if (dr == 0 && dc == 0) continue;
                int r = row + dr;
                int c = col + dc;
                if (r >= 0 && r < rows && c >= 0 && c < cols) {
                    if (mineMap[r][c].equals("*")) count++;
                }
            }
        }
        return count;
    }

    private boolean isWin() {
        return openedCount == rows * cols - mineCount;
    }

    public void play() {
        System.out.println("Mayınların Konumu");
        printMap(mineMap);
        System.out.println("===========================");
        System.out.println("Mayın Tarlası Oyuna Hoşgeldiniz !");
        printMap(displayMap);

        while (true) {
            int row, col;

            while (true) {
                System.out.print("Satır Giriniz : ");
                row = scanner.nextInt();
                System.out.print("Sütun Giriniz : ");
                col = scanner.nextInt();

                if (row < 0 || row >= rows || col < 0 || col >= cols) {
                    System.out.println("Geçersiz koordinat, tekrar giriniz.");
                    continue;
                }

                if (!displayMap[row][col].equals("-")) {
                    System.out.println("Bu koordinat daha önce seçildi, başka bir koordinat girin.");
                    continue;
                }

                break;
            }

            if (mineMap[row][col].equals("*")) {
                System.out.println("Game Over!!");
                System.out.println("===========================");
                break;
            }

            displayMap[row][col] = String.valueOf(countAdjacentMines(row, col));
            openedCount++;

            if (isWin()) {
                System.out.println("Oyunu Kazandınız !");
                printMap(displayMap);
                System.out.println("===========================");
                break;
            }

            System.out.println("===========================");
            printMap(displayMap);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows, cols;

        while (true) {
            System.out.print("Satır sayısını giriniz: ");
            rows = scanner.nextInt();
            System.out.print("Sütun sayısını giriniz: ");
            cols = scanner.nextInt();

            if (rows < 2 || cols < 2) {
                System.out.println("Matris boyutu minimum 2x2 olmalıdır, tekrar giriniz.");
            } else {
                break;
            }
        }

        MineSweeper game = new MineSweeper(rows, cols, scanner);
        game.play();
    }
}
