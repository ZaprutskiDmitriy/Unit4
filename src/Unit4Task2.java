import java.util.Random;
import java.util.Scanner;

public class Unit4Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размерность массива");
        int n = sc.nextInt();
        int arr[][] = new int[n][n];
        int proizvGl = 1;
        int proizvPob = 1;
        Random rand = new Random();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = rand.nextInt(50);
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        for (int i=0; i<n; i++){
            proizvGl*=arr[i][i];
            proizvPob*=arr[i][n-1-i];
        }
        System.out.println("Произведение главной диагонали " + proizvGl);
        System.out.println("Произведение побочной диагонали " + proizvPob);
        if(proizvGl > proizvPob){
            System.out.print("Произведение главной диагонали больше");
        }
        else if(proizvGl < proizvPob){
            System.out.print("Произведение побочной диагонали больше");
        }
        else {
            System.out.print("Произведения диагоналей равны");
        }
    }
}
