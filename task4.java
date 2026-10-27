import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = 4 + i * 3;
        }

        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }

        
    }
}
