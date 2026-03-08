package Questions_07_03_2026;

import java.util.Scanner;

public class CharacterReplacement {
    public static String util(String str, char ch1, char ch2){
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i) == ch1){
                sb.append(ch2);
            }
            else if(str.charAt(i) == ch2){
                sb.append(ch1);
            }
            else{
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char ch1 = sc.nextLine().charAt(0);
        char ch2 = sc.nextLine().charAt(0);

        System.out.println(util(str, ch1, ch2));
    }
}
