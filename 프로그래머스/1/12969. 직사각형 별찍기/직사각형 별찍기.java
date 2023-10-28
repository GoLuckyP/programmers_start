import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt(); //
        int m = sc.nextInt();
        
        int mCount = 0;

        while(mCount < m){
            int nCount = 0;
            while(nCount < n){
                System.out.print("*");
                nCount++;
            }
            System.out.println("");
            mCount++;
        }


    }
}