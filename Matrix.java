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

        int[][] rotatedColors90 = new int[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                rotatedColors90[i][j] = colors[SIZE - 1 - j][i];
                System.out.format("%4d", rotatedColors90[i][j]);
            }
            System.out.println();
        }
        System.out.println();

        int[][] rotatedColors180 = new int[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                rotatedColors180[i][j] = colors[SIZE - 1 - i][j];
                System.out.format("%4d", rotatedColors180[i][j]);
            }
            System.out.println();
        }
        System.out.println();

        int[][] rotatedColors270 = new int[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                rotatedColors270[i][j] = colors[j][SIZE - 1 - i];
                System.out.format("%4d", rotatedColors270[i][j]);
            }
            System.out.println();
        }
        /*System.out.println("1. Для поворота на 90 градусов в право, нажмите 1");
        System.out.println("2. Для поворота на 180 градусов в право, нажмите 2");
        System.out.println("3. Для поворота 90 градусов в право, нажмите 3");
        System.out.println(" ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int operation = Integer.parseInt(input);
        switch (operation) {
            case 1:
                System.out.println("На 90 градусов в право");
                System.out.println(" ");
                //int[][] rotatedColors90 = new int[SIZE][SIZE];
                for (int i = 0; i < SIZE; i++) {
                    for (int j = 0; j < SIZE; j++) {
                        rotatedColors90[i][j] = colors[SIZE - 1 - j][i];
                        System.out.format("%4d", rotatedColors90[i][j]);
                        break;
                        case 2:
                            System.out.println("На 180 градусов в право");
                            System.out.println(" ");

                            System.out.format("%4d", rotatedColors180[i][j]);
                            break;
                        case 3:
                            System.out.println("На 270 градусов в право");
                            System.out.println(" ");
                            System.out.format("%4d", rotatedColors270[i][j]);
                            break;
                        default:
                            System.out.println("Такого номера нет");*/
    }
}














