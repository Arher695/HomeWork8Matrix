package ru.netology;

import java.util.Random;

public class Matrix {
    private final static int SIZE = 8;

    public static void main(String[] args) {

//создание матрицы в программе

        int[][] matrix = createMatrix(SIZE, SIZE);

// вывод матрицы до поворота

        System.out.println("Оригинальнеая матрица");
        printMatrix(matrix);

// разворот матрицы

        int[][] result = rotateMatrix(matrix, 271);

        //вывод матрицы после поворота

        System.out.println("Повёрнутая матрица");
        printMatrix(result);
    }

    private static int[][] rotateMatrix(int[][] matrix, int angle) {
        int size = matrix.length;
        int[][] result = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                switch (angle) {
                    case 90:
                        result[i][j] = matrix[size - 1 - j][i];
                        break;
                    case 180:
                        result[i][j] = matrix[size - 1 - i][j];
                        break;
                    case 270:
                        result[i][j] = matrix[j][size - 1 - i];
                        break;
                    default:
                        result[i][j] = matrix[i][j];
                }
            }
        }
        return result;
    }

    private static int[][] rotateMatrix(int[][] matrix) {
        int size = matrix.length;
        int[][] result = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                result[i][j] = matrix[size - 1 - j][i];
            }
        }
        return result;
    }

    private static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) { //[i] добавлять для универсальности,
                // позволяет печатать разные матрицы(не только квадратные).
                // в сложных расчётах его не ставить.
                System.out.printf("%4d", matrix[i][j]);
            }
            System.out.println();
        }
    }

    private static int[][] createMatrix(int rows, int cols) {
        int[][] matrix = new int[rows][cols];
        Random random = new Random();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = random.nextInt(256);
            }
        }
        return matrix;
    }
}










