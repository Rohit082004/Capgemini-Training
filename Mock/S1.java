// selective reverse

package Mock;

import java.util.Scanner;

public class S1 {
    public static String reverse(String str){
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] arr = str.split(" ");
        int n=arr.length;

        for(int i=0;i<n;i++){
            if(i%2 != 0){
                arr[i] = reverse(arr[i]);
            }
        }

        for(int i=0;i<n;i++){
            System.out.print(arr[i]+ " ");
        }
    }
}
