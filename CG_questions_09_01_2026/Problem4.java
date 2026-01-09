
import java.util.Scanner;

// second largest in array

public class Problem4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int l = Integer.MIN_VALUE, sl = Integer.MIN_VALUE;
        for (int i : arr) {
            if (i > l) {
                sl = l;
                l = i;
            } else if (i > sl && i < l) {
                sl = i;
            }
        }
        System.out.println(sl);
    }
}
