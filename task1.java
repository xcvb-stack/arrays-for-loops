import java.util.Scanner;

public class Main { //достаточно сложная задача
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scan.nextInt();
        }
        int x = scan.nextInt();
        int index = -1;
        for (int i = 0; i < n; i++) {
            if (a[i] == x) {
                index = i + 1;
                break;
            }
        }
        if (index == -1) {
            System.out.println("NO");
        } else {
            System.out.println(index);
        }

        
    }
}
