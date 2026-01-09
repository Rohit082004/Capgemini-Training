// replace spaces with hyphens in string

import java.util.Scanner;

public class Problem12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        String s = str.replace(' ', '-');
        System.out.println(s);
    }
}
