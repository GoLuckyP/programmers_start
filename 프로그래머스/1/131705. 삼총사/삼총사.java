/*삼총사 3*/
/*비트마스크*/

import java.util.*;
class Solution {
    public int solution(int[] number) {

//         int answer = 0;
//         int n = number.length;

//         for (int i = 1; i < (1 << n); i++) {
//             int sum = 0;
//             List<Integer> selectedStudents = new ArrayList<>();

//             for (int j = 0; j < n; j++) {
//                 if ((i & (1 << j)) > 0) {
//                     sum += number[j];
//                     selectedStudents.add(j);
//                 }
//             }

//             if (sum == 0 && selectedStudents.size() == 3) {
//                 answer++;
//             }
//         }

//         return answer;
         int answer = 0;
        
        for(int i = 0; i < number.length; i++) {
            for(int j = i + 1; j < number.length; j++) {
                for(int k = j + 1; k < number.length; k++) {
                    if(number[i] + number[j] + number[k] == 0) {
                        answer++;
                    }
                }
            }
        }
        return answer;
    }
}