/*가장 가까운 같은 글자*/

class Solution {
    public int[] solution(String s) {
        int[] result = new int[s.length()];
        // 문자열 s를 순회할 때 s[i]의 앞에 있는 문자들 중에서 s[i]와 같은 글자가 있는지 확인
        // 없을 경우 -1로 표현
        // 있을 경우 s[i]에서부터 몇 칸 앞에 있는지 표현 후 반환(예시: 2칸 앞일 경우 2)

        char[] chrArr = s.toCharArray();
        String accumulatedString = "";// 문자열 s를 순회하며 순회된 문자를 누적하는 변수

        for (int i = 0; i < s.length(); i++) {
            // 누적된 문자를 담은 문자열에 순회하고 있는 문자가 없을 떄
            if (accumulatedString.indexOf(chrArr[i]) == -1) {//chrArr[i]와 같은 문자가 앞에 없으면 -1 반환)
                result[i] = -1;

            }// 누적된 문자를 담은 문자열에 순회하고 있는 문자가 있을 떄
            else {
                char[] accmulatedChr = accumulatedString.toCharArray();
                for (int lastIdx = accmulatedChr.length - 1; lastIdx >= 0; lastIdx--) {
                    if (accmulatedChr[lastIdx] == chrArr[i]) {
                        result[i] = accmulatedChr.length - lastIdx;
                        break;
                    }
                }
            }
            accumulatedString += chrArr[i]; // 순회하는 문자열의 문자 누적
        }

        return result;
    }

}