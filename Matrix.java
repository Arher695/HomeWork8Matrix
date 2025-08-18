import java.util.Random;

public class Matrix {
    public static final int SIZE = 8;

    public static void main(String[] args) {
        int[][] colors = new int[SIZE][SIZE];
        Random random = new Random();
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                colors[i][j] = random.nextInt(256);
            }
        }
        System.out.println("Оригинал\n");
        printArray(colors, SIZE);
        System.out.println();
        System.out.println("На 90 градусов в право\n");
        int[][] rotationArray90 = rotationArray90(colors, SIZE);
        printArray(rotationArray90, SIZE);
    }

    public static void printArray(int[][] array, int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.format("%4d", array[i][j]);
            }
            System.out.println();
        }
    }

    public static int[][] rotationArray90(int[][] arrayInput, int size) {
        int[][] rotationArray90 = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                rotationArray90[i][j] = arrayInput[size - 1 - j][i];
            }
        }
        return rotationArray90;
    }
}

