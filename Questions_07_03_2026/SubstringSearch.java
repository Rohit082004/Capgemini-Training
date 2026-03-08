package Questions_07_03_2026;

import java.util.Scanner;

public class SubstringSearch {
    public static int util(String s1, String s2){
        int k = s2.length();
        for(int i=0;i<=s1.length()-k;i++){
            String sub = s1.substring(i, i+k);
            if(s2.equals(sub)){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();

        System.out.println(util(s1, s2));
    }
}
