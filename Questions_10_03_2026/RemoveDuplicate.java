package Questions_10_03_2026;

import java.util.HashSet;
import java.util.Scanner;

public class RemoveDuplicate {
    public static String util(String str){
        HashSet<Character> hs = new HashSet<>();
        StringBuilder sb =new StringBuilder();

        for(int i=0;i<str.length();i++){
            if(!hs.contains(str.charAt(i))){
                sb.append(str.charAt(i));
            }
            hs.add(str.charAt(i));
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        System.out.println(util(str));
    }
}
