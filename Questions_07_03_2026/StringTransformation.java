package Questions_07_03_2026;

import java.util.Scanner;

public class StringTransformation {
    public static String util(String str){
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i) == 'a'){
                sb.append('b');
            }
            else if(str.charAt(i) == 'b'){
                sb.append('a');
            }
            else {
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        System.out.println(util(str));
    }
}
