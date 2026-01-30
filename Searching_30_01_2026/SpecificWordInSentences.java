package Searching_30_01_2026;

import java.util.Scanner;

public class SpecificWordInSentences {
    public static String specificWord(String[] arr, int n, String word){
        for(int i=0;i<n;i++){
            String[] words = arr[i].split(" ");
            for(String j: words){
                if(j.equals(word)){
                    return arr[i];
                }
            }
        }
        return "Not Found";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String word = sc.next();
        sc.nextLine();
        String[] arr = new String[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextLine();
        }

        System.out.println(specificWord(arr, n, word));
    }
}
