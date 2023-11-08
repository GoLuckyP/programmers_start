/*모스부호 */
import java.util.*;
import java.util.stream.*;
class Solution {
    public String solution(String letter) {
                String[] morse = new String[]{
                ".-","-...","-.-.","-..",".","..-."
                ,"--.","....","..",".---","-.-",".-.."
                ,"--","-.","---",".--.","--.-",".-."
                ,"...","-","..-","...-",".--","-..-"
                ,"-.--","--.."," "};

        Map<String,String> morseToStr = new HashMap<>();
        char str = 'a';

        for (int i = 0; i < morse.length; i++) {
            morseToStr.put(morse[i], morse[i].equals(" ") ? morse[i] : String.valueOf(str));
            str++;
        }



        letter = letter.replaceAll("  ","&");
        letter = letter.replace(" ",",");
        letter = letter.replace("&",", ");
        String[] strings = letter.split(",");

        Stream<String> stream = Arrays.stream(strings).map(morseToStr::get);

        return stream.collect(Collectors.joining(""));
    }
}