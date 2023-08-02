package LvZero;

public class LvZero010 {
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = "";

        String strA = my_string.substring(0,s);
        String strB = my_string.substring(s + overwrite_string.length());
        answer = strA + overwrite_string + strB;

        return answer;
    }
}
