// Create a program to find the youngest friends among 3 Amar, Akbar, and Anthony based on their ages and the tallest among the friends based on their heights

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int amarAge = sc.nextInt();

        int akbarAge = sc.nextInt();

        int anthonyAge = sc.nextInt();

        float amarHeight = sc.nextFloat();

        float akbarHeight = sc.nextFloat();

        float anthonyHeight = sc.nextFloat();

        // Find youngest friend
        if (amarAge < akbarAge && amarAge < anthonyAge) {
            System.out.println("Youngest friend is Amar");
        } else if (akbarAge < amarAge && akbarAge < anthonyAge) {
            System.out.println("Youngest friend is Akbar");
        } else {
            System.out.println("Youngest friend is Anthony");
        }

        // Find tallest friend
        if (amarHeight > akbarHeight && amarHeight > anthonyHeight) {
            System.out.println("Tallest friend is Amar");
        } else if (akbarHeight > amarHeight && akbarHeight > anthonyHeight) {
            System.out.println("Tallest friend is Akbar");
        } else {
            System.out.println("Tallest friend is Anthony");
        }

        sc.close();
    }
}
