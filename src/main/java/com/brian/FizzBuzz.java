package com.brian;

public class FizzBuzz {
    public String check(int numb) {
        String numberAsString = String.valueOf(numb);
        if (numb % 3 == 0 && numb % 5 == 0) {
            return "FizzBuzz";
        } else if (numb % 3 == 0) {
            return "Fizz";
        } else if (numb % 5 == 0) {
            return "Buzz";
        } else {
            return numberAsString;
        }
    }

    public String[] fizzBuzzArray() {
        String[] result = new String[100];
        for (int i = 1; i <= 100; i++) {
            result[i - 1] = check(i);
        }
        return result;
    }
}