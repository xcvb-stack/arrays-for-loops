import java.util.Scanner;

public class Main { // на джаве это сложно
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = scan.nextInt();
        }
        int bestValue = a[0];
        int bestCount = 0;
        int bestFirstIndex = n;
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (a[j] == a[i]) {
                    count++;
                }
            }

            int firstIndex = i;
            for (int j = 0; j < i; j++) {
                if (a[j] == a[i]) {
                    firstIndex = j;
                    break;
                }
            }
            if (count > bestCount || (count == bestCount && firstIndex < bestFirstIndex)) {
                bestCount = count;
                bestFirstIndex = firstIndex;
                bestValue = a[i];
            }
        }

        System.out.println(bestValue);

        
    }
}
