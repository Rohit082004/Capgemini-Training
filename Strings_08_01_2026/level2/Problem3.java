//Write a program to split the text into words and find the shortest and longest strings in a given text

import java.util.Arrays;
import java.util.Scanner;

public class Problem3 {
    public static String[][] String2DArray(String[] arr) {
        String[][] mat = new String[arr.length][2];

        for (int i = 0; i < arr.length; i++) {
            mat[i][0] = arr[i];
            int l = arr[i].length();
            mat[i][1] = Integer.toString(l);
        }
        return mat;
    }
    public static String[] countWords(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                count++;
            }
        }
        String[] arr = new String[count+1];
        String temp = "";
        int id = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch != ' ') {
                temp = temp + ch;
            } else {
                arr[id] = temp;
                id++;
                temp = "";
            }
        }
        arr[id] = temp;
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        String[] arr = countWords(str);

        String[][] mat = String2DArray(arr);

        Arrays.sort(mat, (a, b) ->
            Integer.parseInt(a[1]) - Integer.parseInt(b[1])
            );
        
        System.out.println("Smallest string is " + mat[0][0]);
        System.out.println("Longest string is " + mat[mat.length-1][0]);
    }
}
