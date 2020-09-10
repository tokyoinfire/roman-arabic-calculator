package com.company;


public class Calculator {
    private String input;
    private char type = ' ';
    private String svalue1 = "";
    private String svalue2 = "";
    private int ivalue1 = 0;
    private int ivalue2 = 0;

    public String Calculation(String str) {
        Calculate calculate = new Calculate();
        RomanConvert romanConvert = new RomanConvert();
        input = str;
        input = input.trim();
        input = input.replaceAll("//s", "");
        if (input.isEmpty()) {
            str = "Нет значений и операций";
            return str;
        }
        else {
            if (input.contains("+") || input.contains("-") || input.contains("*") || input.contains("/")) {
                for (int i = 0; i < input.length(); i++) {
                    if (input.charAt(i) == '+' || input.charAt(i) == '-' || input.charAt(i) == '*' || input.charAt(i) == '/') {
                        type = input.charAt(i);
                    }
                    else {
                        if (type == ' ') {
                            svalue1 += input.charAt(i);
                        }
                        else {
                            svalue2 += input.charAt(i);
                        }
                    }
                }
                svalue1=svalue1.trim();
                svalue2=svalue2.trim();
                try {
                    ivalue1 = Integer.parseInt(svalue1);
                    ivalue2 = Integer.parseInt(svalue2);
                    if(ivalue1>10 || ivalue2 > 10)
                    {
                        str = "Значение больше 10";
                    }
                    else {
                        str = Integer.toString(calculate.IOData(ivalue1, ivalue2, type));
                    }
                    return str;
                }
                catch(NumberFormatException e) {
                    ivalue1 = romanConvert.RomanToArabic(svalue1);
                    ivalue2 = romanConvert.RomanToArabic(svalue2);
                    if (ivalue1 == 101 || ivalue2 == 101) {
                        str = "Неверный тип значения или значение больше 10";
                        return str;
                    }
                    str = romanConvert.ArabicToRoman(calculate.IOData(ivalue1, ivalue2, type));
                }
            }
            else {
                str = "Нет операции";
                return str;
            }
            return str;
        }
    }
}
