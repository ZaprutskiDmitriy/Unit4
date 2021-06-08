import java.util.Random;
import java.util.Scanner;

public class CW1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размерность массива");
        int n = sc.nextInt();
        int arr[] = new int[n];
        Random rand = new Random();
        for (int i = 0; i < n; i++) {
            arr[i] = rand.nextInt(9);
            System.out.print(arr[i] + " ");
        }
        int countr[] = new int[n];

        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            countr[i] = count;
            System.out.println();
            System.out.print(countr[i] + " ");
        }

    }
}
