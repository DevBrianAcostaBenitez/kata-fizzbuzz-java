package com.brian;

public class FizzBuzzStage2 {

    public String check(int numb) {
        String numberAsString = Integer.toString(numb);
        if (numb % 3 == 0 && numb % 5 == 0) {
            return "FizzBuzz";
        } else if (numb % 3 == 0 || numberAsString.contains("3")) {
            return "Fizz";
        } else if (numb % 5 == 0 || numberAsString.contains("5")) {
            return "Buzz";
        } else {
            return Integer.toString(numb);
        }
    }
}