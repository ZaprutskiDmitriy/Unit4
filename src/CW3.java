import java.util.Random;
import java.util.Scanner;

public class CW3 {
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
        System.out.println();
        System.out.println("Неповторяющиеся числа");
        for (int i = 0; i < n; i++) {
            int tempCount = 0;
            for (int j = 0; j < n; j++) {
                if (arr[i] == arr[j]) {
                    tempCount++;
                }
                if (tempCount > 1) {
                    break;
                }
            }
            if (tempCount == 1) {
                System.out.println(arr[i] + " ");
            }
        }
    }
}
