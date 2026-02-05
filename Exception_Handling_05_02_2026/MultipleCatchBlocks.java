package Exception_Handling_05_02_2026;

import java.util.Scanner;

public class MultipleCatchBlocks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = null;
        try{
            int n = sc.nextInt();
            arr = new int[n];
            for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();
            }

            int id = sc.nextInt();

            System.out.println("Value at index " + id + " = " + arr[id]);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("index out of bound");
        }
        catch(NullPointerException e){
            System.out.println("Array is null");
        }
    }
}
