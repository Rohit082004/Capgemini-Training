// capitalize first letter of each word

import java.util.Scanner;

public class Problem28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        String[] arr = str.split(" ");

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length() > 0) {
                arr[i] = Character.toUpperCase(arr[i].charAt(0)) 
                         + arr[i].substring(1);
            }
        }
        for (String s : arr) {
            System.out.print(s + " ");
        }
    }
}
