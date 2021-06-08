import java.util.Random;
import java.util.Scanner;

public class CW6 {
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
        int k = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arrnew[k] = arr[j][i];
                System.out.print(arrnew[k] + " ");
                k++;
            }
        }
    }
}
