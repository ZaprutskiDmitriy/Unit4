import java.util.Random;
import java.util.Scanner;

public class CW2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размерность массива");
        int n = sc.nextInt();
        int arr[] = new int[n];
        Random rand = new Random();

        for (int i = 0; i < n; i++) {
            arr[i] = rand.nextInt(10);
            System.out.print(arr[i] + " ");
        }
        int min = arr[0];
        int max = arr[0];
        int minind = 0;
        int maxind = 0;
        for (int j = 0; j < n; j++) {
            if (arr[j] < min) {
                min = arr[j];
                minind = j;
            }
        }
        for (int k = 0; k < n; k++) {
            if (arr[k] > max) {
                max = arr[k];
                maxind = k;
            }
        }
        System.out.println();
        System.out.println("Минимальное значение: " + min);
        System.out.println("Максимальноее значение: " + max);
        int value = arr[minind];
        arr[minind] = arr[maxind];
        arr[maxind] = value;
        for (int l = 0; l < n; l++) {
            System.out.print(arr[l] + " ");
        }
    }
}
