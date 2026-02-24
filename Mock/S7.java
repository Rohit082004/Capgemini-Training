// first repeated string

package Mock;

import java.util.Scanner;

public class S7 {
    public static String util(String[] arr, int n){
        String s=arr[0];
        for(int i=1;i<n;i++){
            if(s.contains(arr[i])){
                return arr[i];
            }
            s = s + arr[i];
        }
        return "";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] arr = new String[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.next();
        }
        System.out.println(util(arr, n));
    }
}
