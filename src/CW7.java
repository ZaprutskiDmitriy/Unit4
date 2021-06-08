import java.util.Random;
import java.util.Scanner;

public class CW7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размерность массива");
        int n = sc.nextInt();
        int arr[][] = new int[n][n];
        int arrnew[] = new int[n * n];
        Random rand = new Random();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = rand.nextInt(999);
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        for (int i = 0; i < n; i++) {
            int min = arr[i][0];
            int minind = 0;
            for (int j = 0; j < n; j++) {
                if (arr[i][j] < min) {
                    min = arr[i][j];
                    minind = j;
                }
            }
            System.out.println("индекс1: " + i + " индекс2: " + minind);
        }
    }
}
