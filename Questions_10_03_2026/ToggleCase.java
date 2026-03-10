package Questions_10_03_2026;

import java.util.Scanner;

public class ToggleCase {
    public static String util(String str){
        int l=0, u=0;
        for(int i=0;i<str.length();i++){
            if(Character.isLowerCase(str.charAt(i))) l++;
            else u++;
        }

        StringBuilder sb = new StringBuilder();
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(l > u){
                ch = Character.toLowerCase(ch);
            }
            else {
                ch = Character.toUpperCase(ch);
            }
            sb.append(ch);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        System.out.println(util(str));
    }
}
