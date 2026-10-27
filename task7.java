import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scan.nextInt();
        }
        int[] result = new int[n];
        int k = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] < 0) {
                result[k++] = a[i];
            }
        }
        for (int i = 0; i < n; i++) {
            if (a[i] >= 0) {
                result[k++] = a[i];
            }
        }
        for (int i = 0; i < n; i++) {
            if (i > 0) {
                System.out.print(" ");
            }
            System.out.print(result[i]);
        }
        System.out.println();

        
    }
}
