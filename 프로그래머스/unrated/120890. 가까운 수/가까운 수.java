class Solution {
    public int solution(int[] array, int n) {
        int element = array[0]; // 배열의 첫 번째 원소를 초기 가장 가까운 수로 설정
        int minDiff = Math.abs(array[0]- n); // 초기 최솟값 차이를 설정
        
        for(int i = 1; i < array.length; i++){
            int diff = Math.abs(array[i] - n);
            // diff가 초기 최솟값 차이보다 작거나,
            // diff가 초기 최솟값과 같고
            // 현재 i를 index로 가진 array 원소 값이 초기 가장 작은 수보다 작을 때
            if(diff < minDiff || (diff == minDiff && array[i] < element)){
                minDiff = diff;
                element = array[i];
            }
        }

        return element;
    }
}