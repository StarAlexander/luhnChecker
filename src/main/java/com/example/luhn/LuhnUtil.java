package com.example.luhn;


public class LuhnUtil {

    public static Boolean compute(String s) {
        int sum = 0;
        boolean isEven = s.length() % 2 == 0;
        for (int i=0; i<s.length();i++) {
            int conv = s.charAt(i) - '0';
            if ((i % 2 == 0 && isEven) || (i%2 != 0 && !isEven)) {
                conv = conv * 2;
                if (conv > 9) {
                    conv -= 9;
                }
            }
            sum += conv;
        }
        return sum % 10 == 0;
    }

}
