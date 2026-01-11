import java.util.Scanner;

public class CountVowels {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        
        int v=0, c=0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if ("aeiouAEIOU".indexOf(ch) != -1)
                v++;
            else
                c++;
        }

        System.out.println("Vowels: " + v);
        System.out.println("Consonants: " + c);

        sc.close();
    }
}
