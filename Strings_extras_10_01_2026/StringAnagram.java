import java.util.HashMap;
import java.util.Scanner;

public class StringAnagram {
    public static boolean checkAnagram(String str1, String str2) {
        if (str1.length() != str2.length())
            return false;
        HashMap<Character, Integer> hm = new HashMap<>();
        for (int i = 0; i < str1.length(); i++) {
            hm.put(str1.charAt(i), hm.getOrDefault(str1.charAt(i), 0) + 1);
        }
        for (int i = 0; i < str2.length(); i++) {
            if (!hm.containsKey(str2.charAt(i))) {
                return false;
            }
            hm.put(str2.charAt(i), hm.get(str2.charAt(i)) - 1);
            if (hm.get(str2.charAt(i)) == 0)
                hm.remove(str2.charAt(i));
        }
        
        return hm.isEmpty();
    }
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();

        if (checkAnagram(str1, str2)) {
            System.out.println("Strings are anagram");
        }
        else {
            System.out.println("Strings are not anagram");
        }
        sc.close();
    }
}
