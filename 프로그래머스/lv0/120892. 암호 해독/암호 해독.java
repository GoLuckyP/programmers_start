import java.util.stream.IntStream;

class Solution {
    public String solution(String cipher, int code) {
          StringBuilder decrypted = new StringBuilder();

        IntStream.range(0, cipher.length())
            .filter(i -> (i + 1) % code == 0)
            .forEach(i -> decrypted.append(cipher.charAt(i)));

        return decrypted.toString();
    }
}