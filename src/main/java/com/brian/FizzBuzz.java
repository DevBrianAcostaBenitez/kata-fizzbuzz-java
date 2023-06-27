package com.brian;

public class FizzBuzz {
    public String check(int numb) {
        String numberAsString = String.valueOf(numb);
        String result = "";

        result += (numb % 3 == 0) ? "Fizz" : "";
        result += (numb % 5 == 0) ? "Buzz" : "";
        
        return result.isEmpty() ? numberAsString : result;
    }
    public String[] fizzBuzzArray() {
        String[] result = new String[100];
        for (int i = 1; i <= 100; i++) {
            result[i - 1] = check(i);
        }
        return result;
    }
}