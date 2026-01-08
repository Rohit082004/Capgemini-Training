//Write a program to split the text into words, compare the result with the split() method and display the result

import java.util.Scanner;

public class Problem2 {
    public static boolean compareArrays(String[] arr1, String[] arr2) {
        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i])) {
                return false;
            }
        }
        return true;
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
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        String[] arr1 = countWords(str);
        String[] arr2 = str.split(" ");

        System.out.println(compareArrays(arr1, arr2));
        sc.close();
    }
}