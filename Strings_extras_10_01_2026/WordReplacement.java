import java.util.Scanner;

public class WordReplacement {
    public static String stringReplacement(String str, String toReplace, String replaceWith) {
        String[] arr = str.split(" ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(toReplace)) {
                arr[i] = replaceWith;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (String i: arr) {
            sb.append(i).append(" ");
        }
        return sb.toString().trim();
    }
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String toReplace = sc.next();
        String replaceWith = sc.next();

        System.out.println(stringReplacement(str, toReplace, replaceWith));
        sc.close();
    }
}
