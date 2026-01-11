import java.util.Scanner;

public class ToggleCharactersCase {
    public static String toggleCase(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isLowerCase(ch)) {
                sb.append(Character.toUpperCase(ch));
            }
            else {
                sb.append(Character.toLowerCase(ch));
            }
        }
        return sb.toString();
    }
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        System.out.println(toggleCase(str));
        sc.close();
    }
}
