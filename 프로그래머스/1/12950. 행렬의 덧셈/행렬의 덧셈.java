/*행렬의 덧셈*/

class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] sumResult = new int[arr1.length][arr1[0].length];
         
        for(int column = 0; column < arr1[0].length; column++){
            for(int row = 0; row < arr1.length; row++){
              sumResult[row][column] = arr1[row][column] + arr2[row][column];          
            }
        }
    
        return sumResult;
    }
}