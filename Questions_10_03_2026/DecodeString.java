package Questions_10_03_2026;

import java.util.Scanner;

public class DecodeString {
    public static String util(String str){
        StringBuilder sb = new StringBuilder();
        int c=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i) == '1'){
                c++;
            }
            else {
                char ch = (char) (c+64);
                sb.append(ch);
                c= 0;
            }
        }
        if(c != 0){
            sb.append((char) (c+64));
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str = sc.next();

        System.out.println(util(str));
    }
}
