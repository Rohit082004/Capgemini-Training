package Searching_30_01_2026;

import java.util.Scanner;

public class Search2DMatrix {
    public static int[] matrixSearch(int[][] arr, int n, int m, int target){
        int r = 0, c = m-1;

        while(r < n && c >= 0){
            if(arr[r][c] == target) return new int[]{r, c};

            else if(target > arr[r][c]) r++;

            else c--;
        }
        return new int[]{-1, -1};
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        int[][] arr = new int[n][m];

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j] = sc.nextInt();
            }
        }

        int[] ans = matrixSearch(arr, n ,m ,k);

        System.out.println(ans[0] + " " + ans[1]);
    }
}
