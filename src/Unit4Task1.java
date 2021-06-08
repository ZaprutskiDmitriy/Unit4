import java.util.Random;
import java.util.Scanner;

public class Unit4Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размерность массива");
        int n = sc.nextInt();
        int arr[][] = new int[n][n];
        int sumOdd = 0;
        Random rand = new Random();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = rand.nextInt(50);
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        for (int i = 0; i < n - 1; i++) {
            if (arr[i + 1][i] % 2 == 1) {
                sumOdd += arr[i + 1][i];
            }
        }
        System.out.println("Сумма нечетных элементов под главной диагональю: " + sumOdd);
    }
}
