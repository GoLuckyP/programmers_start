/*같은 숫자는 싫어*/

import java.util.*;
import java.util.stream.*;
public class Solution {
    public int[] solution(int []arr) {
        
        return IntStream.range(0, arr.length)
                .filter(idx -> idx == arr.length - 1 || arr[idx] != arr[idx + 1]) 
                .map(idx -> arr[idx])
                .toArray();
    }
}