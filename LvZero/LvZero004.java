package LvZero;

import java.util.Scanner;

public class LvZero004 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String ans = "";

        for (char x : a.toCharArray()) {
            if (Character.isUpperCase(x)) {
                ans += Character.toLowerCase(x);
            } else {
                ans += Character.toUpperCase(x);
            }
        }
        System.out.println(ans);
    }
}