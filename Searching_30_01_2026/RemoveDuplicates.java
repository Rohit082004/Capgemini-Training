package Searching_30_01_2026;

import java.util.HashSet;
import java.util.Scanner;

public class RemoveDuplicates {
    public static String removal(String str){
        StringBuilder sb = new StringBuilder();
        HashSet<Character> hs = new HashSet<>();
        int n = str.length();

        for(int i=0;i<n;i++){
            char ch = str.charAt(i);
            if(!hs.contains(ch)){
                sb.append(ch);
                hs.add(ch);
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        System.out.println(removal(str));
    }
}
