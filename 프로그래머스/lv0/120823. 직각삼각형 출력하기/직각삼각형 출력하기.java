import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        //System.out.println(n);

        for(int i = 0; i < n; i++){
            for(int z = 0; z < i + 1; z++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}