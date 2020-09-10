package com.company;

public class RomanConvert {
    private static String[] letters = { "C", "XC", "L", "XL", "X", "IX", "VIII", "VII", "VI", "V", "IV", "III", "II", "I"};
    private static int[] numbers = { 100, 90, 50, 40, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
    private int iresult = 0;
    private String sresult = "";


    public int RomanToArabic(String str) {
        for (int i = 4; i < letters.length; i++) {
            if (letters[i].equalsIgnoreCase(str)) {
                iresult = numbers[i];
                str = null;
            }
        }
        if (str != null) {
            iresult = 101;
            return iresult;
        }
        else{
            return iresult;
        }
    }

    public String ArabicToRoman(int value) {
        if(value <= 0)
            sresult = "Ответ не поддерживается римской системой исчесления";
        else {
            for (int i = 0; i < numbers.length; i++) {
                if (value / numbers[i] >= 1) {
                    sresult = sresult + letters[i];
                    value -= numbers[i];
                    i--;
                }
            }
        }
        return sresult;
    }
}
