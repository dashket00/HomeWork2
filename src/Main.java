
import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        System.out.println("Введите значение: ");
        Scanner scanner = new Scanner(System.in);
        int s = scanner.nextInt();
        int sum = 0;
        int[][] arr = new int[5][7];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = random.nextInt(100);
                System.out.printf("%3d", arr[i][j]);
            }
            System.out.println();
        }

        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] += s;
                System.out.printf("%3d", arr[i][j]);
                sum += arr[i][j];
            }
            System.out.println();
        }
        System.out.println("Сумма " + sum);


        char[][] a = new char[8][8];

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if ((i + j) % 2 == 0) {
                    a[i][j] = 'W';
                } else {
                    a[i][j] = 'B';
                }
            }
        }

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.printf(a[i][j] + " ");
            }
            System.out.println();
        }



        // Задание со звездочкой
        System.out.println("Введите количество строк (n):");
        int n = scanner.nextInt();
        System.out.println("Введите количество столбцов (m):");
        int m = scanner.nextInt();

        int[][] matrix = new int[n][m];
        int v = 0;

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < m; j++) {
                    matrix[i][j] = v++;
                }
            } else {
                for (int j = m - 1; j >= 0; j--) {
                    matrix[i][j] = v++;
                }
            }
        }

        System.out.println("Полученный массив:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.printf("%3d", matrix[i][j]);
            }
            System.out.println();
        }
    }

}