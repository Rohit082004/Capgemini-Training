//Find unique characters in a string using the charAt() method and display the result

import java.util.Scanner;

public class Problem2 {
    public static char[] findUniqueCharacters(String str) {
        char[] temp = new char[str.length()];
        int uniqueCount = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            boolean unique = true;
            for (int j = 0; j < i; j++) {
                if (str.charAt(j) == ch) {
                    unique = false;
                    break;
                }
            }
            if (unique) {
                temp[uniqueCount] = ch;
                uniqueCount++;
            }
        }
        char[] result = new char[uniqueCount];
        for (int i = 0; i < uniqueCount; i++) {
            result[i] = temp[i];
        }
        return result;
    }
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        char[] uniqueChars = findUniqueCharacters(str);

        for (char ch : uniqueChars) {
            System.out.print(ch + " ");
        }
        sc.close();
    }
}
