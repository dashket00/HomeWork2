// Домашнее задание "Многомерные массивы"
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

        //Задача с *  прошлое дз

        int[] array = {9, 9, 9};

        // перевести array в число w
         w+1
         w вернуть в массив с индексом +1

        System.out.print(array[i] + " ");




        int k = array.length;
        int index = k - 1;
        // Пока текущий элемент равен 9 и индекс не станет отрицательным,
        // уменьшаем индекс и обнуляем текущий элемент
        while (index >= 0 && array[index] == 9) {
            array[index] = 0;
            index--;
        }
        // Если индекс отрицателен, значит все элементы были равны 9,
        // и нужно увеличить размер массива
        if (index < 0) {
            int[] newArray = new int[k + 1];
            newArray[0] = 1;
            for (int i = 0; i < newArray.length; i++) {
                System.out.print(newArray[i] + " ");
            }
        } else {
            // Иначе просто увеличиваем текущий элемент на 1
            array[index]++;
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i] + " ");
            }
        }

    }

}