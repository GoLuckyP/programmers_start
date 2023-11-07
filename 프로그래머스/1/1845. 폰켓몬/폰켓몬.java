/*폰켓몬*/

import java.util.*;
class Solution {
    public int solution(int[] nums) {
        // nums = N마리 폰켓몬의 종류 번호가 담긴 배열
        // 선택할 수 있는 폰켓몬의 수 N/2는 nums.length/2
        // 가장 많은 종류의 폰켓몬을 선택하는 방법을 찾고 폰켓몬 종류 번호 갯수를 구한다
        // nums.length/2개를 선택 
        int choice = nums.length / 2;
        // Set을 이용하여 nums 중복 제거 
        Set<Integer> set = new HashSet<>();
        for(int i : nums){
            set.add(i);
        }
        set.forEach(System.out::println);

        if(set.size() >= choice){
            return choice;
        }else{
            return set.size();
        }
    }
}