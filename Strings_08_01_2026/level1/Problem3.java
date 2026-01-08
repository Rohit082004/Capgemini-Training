// Write a program to return all the characters in a string using the user-defined method,  compare the result with the String built-in toCharArray() method

import java.util.Scanner;

public class Problem3 {
    public static boolean compareArrays(char[] arr1, char[] arr2) {
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i])
                return false;
        }
        return true;
    }
    public static char[] charactersOfString(String str) {
        char[] arr = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            arr[i] = str.charAt(i);
        }
        return arr;
    }
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        char[] arr1 = str.toCharArray();
        char[] arr2 = charactersOfString(str);

        System.out.println(compareArrays(arr1, arr2));
        sc.close();
    }
}
