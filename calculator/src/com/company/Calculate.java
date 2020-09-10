package com.company;

public class Calculate {
    private int value1;
    private int value2;
    private int result;
    private char operation;

    public int IOData(int value1, int value2, char operation) {
        this.value1 = value1;
        this.value2 = value2;
        this.operation = operation;
        this.Calculation();
        return result;
    }

    public void Calculation() {
        switch(operation) {
            case '+':
                result = value1 + value2;
                break;
            case '-':
                result = value1 - value2;
                break;
            case '*':
                result = value1 * value2;
                break;
            case '/':
                if(value1 == 0 || value2 == 0)
                    result=0;
                else
                result = value1 /  value2;
                break;
        }
    }
}

