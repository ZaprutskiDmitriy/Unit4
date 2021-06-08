import java.util.Random;
import java.util.Scanner;

public class CW5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размерность массива");
        int n = sc.nextInt();
        int arr[][] = new int[n][n];
        Random rand = new Random();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = rand.nextInt(999);
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        int countTwoZnach = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i][j] >=10 && arr[i][j] < 100 ){
                    countTwoZnach++;
                }
            }
            }
        System.out.println();
        System.out.print("Количество двухзначных чисел:" + countTwoZnach);
    }
}
