import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int sum = 0;
        int count = 0;

        for (int i = 0; i < n; i++) {
            int a = scan.nextInt();
            if (a % 2 == 0) {
                sum += a;
                count++;
            }
        }

        if (count == 0) {
            System.out.println("NO");
        } else {
            System.out.println(sum);
        }

        
    }
}
