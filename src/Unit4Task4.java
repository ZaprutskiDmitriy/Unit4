import java.util.Random;
import java.util.Scanner;

public class Unit4Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размерность массива");
        int n = sc.nextInt();
        int arr1[][] = new int[n][n];
        int arr2[][] = new int[n][n];
        Random rand = new Random();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr1[i][j] = rand.nextInt(50);
                System.out.print(arr1[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Преобразованная матрица:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr2[i][j] = arr1[j][i];
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println();
        }
    }
}
