
import java.util.Scanner;

// Write a program to demonstrate StringIndexOutOfBoundsException

public class Problem6 {
    public static void generateException(String str) {
        char ch = str.charAt(str.length());
        System.out.println(ch);
    }

    public static void handleException(String str) {
        try {
            char ch = str.charAt(str.length());
            System.out.println(ch);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Accessing element out of string length");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        // generateException(str);

        handleException(str);
    }
}
