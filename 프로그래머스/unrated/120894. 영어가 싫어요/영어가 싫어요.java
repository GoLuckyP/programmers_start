// 영어가 싫어요
class Solution {
    public long solution(String numbers) {

        long result = 0;
        int length = numbers.length();

        // 문자열 numbers를 순회
        for (int i = 0; i < length; i++) {
            // 첫문자만 char타입으로 변환
            char c = numbers.charAt(i);
            
            // result * 10 + c를 정수형으로 바꾼 숫자
            // * 10을 해주는 이유는 자리수를 만들어주기 위함
            switch (c) {
                case 'z':
                    result = result * 10 + 0;
                    i += 3; // "zero" 다음으로 이동
                    break;
                case 'o':
                    result = result * 10 + 1; 
                    i += 2; // "one" 다음으로 이동
                    break;
                case 't':
                    if (numbers.charAt(i + 1) == 'h') {
                        result = result * 10 + 3;
                        i += 4; // "three" 다음으로 이동
                    } else {
                        result = result * 10 + 2;
                        i += 2; // "two" 다음으로 이동
                    }
                    break;
                case 'f':
                    if (numbers.charAt(i + 1) == 'i') {
                        result = result * 10 + 5;
                        i += 3; // "five" 다음으로 이동
                    } else {
                        result = result * 10 + 4;
                        i += 3; // "four" 다음으로 이동
                    }
                    break;
                case 's':
                    if (numbers.charAt(i + 1) == 'e') {
                        result = result * 10 + 7;
                        i += 4; // "seven" 다음으로 이동
                    } else {
                        result = result * 10 + 6;
                        i += 2; // "six" 다음으로 이동
                    }
                    break;
                case 'e':
                    result = result * 10 + 8;
                    i += 4; // "eight" 다음으로 이동
                    break;
                case 'n':
                    result = result * 10 + 9;
                    i += 3;  // "nine" 다음으로 이동
                    break;

            }
        }

        return result;
    }
}