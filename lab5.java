import java.util.Scanner;

public class lab5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите количество элементов в массиве: ");
        int n = in.nextInt();

        double[] arr = new double[n];
        System.out.print("Введите элементы массива: ");
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextDouble();
        }

        System.out.print("Массив до удаления элементов: ");
        for (double j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();

        double max = Double.MIN_VALUE;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                count += 1;
            }
        }
        double[] result = new double[count];
        count = 0;
        max = Double.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                result[i-count] = arr[i];
            }
            else {
                count += 1;
            }
        }

        System.out.print("Массив после удаления элементов: ");
        for (double elem : result) {
            System.out.print(elem + " ");
        }

        in.close();
    }
}

