import java.util.Scanner;

public class Problem5 {
    public static String[][] String2DArray(String[] arr) {
        String[][] mat = new String[arr.length][2];

        for (int i = 0; i < arr.length; i++) {
            mat[i][0] = arr[i];
            int l = arr[i].length();
            mat[i][1] = Integer.toString(l);
        }
        return mat;
    }
    public static String[] countWords(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                count++;
            }
        }
        String[] arr = new String[count+1];
        String temp = "";
        int id = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch != ' ') {
                temp = temp + ch;
            } else {
                arr[id] = temp;
                id++;
                temp = "";
            }
        }
        arr[id] = temp;
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        String[] arr = countWords(str);

        String[][] mat = String2DArray(arr);

        for (String[] a : mat) {
            int len = Integer.parseInt(a[1]);
            
            System.out.println(a[0] + "    " + len);
        }
    }
}
