package com.company;

import java.text.ParseException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        String str;
        Scanner in = new Scanner(System.in);
        str = in.nextLine();
        System.out.println(calculator.Calculation(str));
    }
}
