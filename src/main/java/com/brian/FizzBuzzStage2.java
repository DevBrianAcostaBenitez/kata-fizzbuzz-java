package com.brian;

public class FizzBuzzStage2 {

    public String check(int numb) {
        String numberAsString = Integer.toString(numb);
        String result = "";

        result += (numb % 3 == 0 || numberAsString.contains("3")) ? "Fizz" : "";
        result += (numb % 5 == 0 || numberAsString.contains("5")) ? "Buzz" : "";

        return result.isEmpty() ? numberAsString : result;
    }
}