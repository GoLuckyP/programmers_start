/*최소 직사각형*/
class Solution {
    public int solution(int[][] sizes) {


        int row = 0;
        int col = 0;

        // 가로 세로 길이 구하기
        for (int[] i : sizes) {
            row = Math.max(row, Math.max(i[0], i[1]));
            col = Math.max(col, Math.min(i[0], i[1]));
        }

        return  row * col;
    }
}