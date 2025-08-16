package ru.netology;

import java.util.Random;

public class Matrix {
    public static final int SIZE = 8;

    public static void main(String[] args) {
        int[][] colors = new int[SIZE][SIZE];

        System.out.println("Оригинал");
        System.out.println();

        Random random = new Random();
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                colors[i][j] = random.nextInt(256);
            }
        }
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                System.out.format("%4d", colors[i][j]);
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("На 90 градусов в право");
        System.out.println();
        int[][] rotatedColors90 = new int[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                rotatedColors90[i][j] = colors[SIZE - 1 - j][i];
                System.out.format("%4d", rotatedColors90[i][j]);
            }
            System.out.println();
        }
    }
}
