import java.util.Random;
import java.util.Scanner;

public class CW4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размерность массива");
        int n = sc.nextInt();
        int arr[] = new int[n];
        int arr1[] = new int[n];
        Random rand = new Random();
        for (int i = 0; i < n; i++) {
            arr[i] = rand.nextInt(10);
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("Введите шаг сдвига");
        int step = sc.nextInt();
        for (int i = step, k=0; i<n+step-1; i++) {
            arr1[i] = arr[k];
            k++;
        }
        System.out.println();
        System.out.println("Преобразованный массив:");
        for (int j = 0; j<n; j++){
            System.out.print(arr1[j] + " ");
        }
    }
}
