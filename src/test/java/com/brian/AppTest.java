package com.brian;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AppTest {
    
    @Test
    public void testDivisibleBy3() {
        int numb = 3;
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.check(numb);
        Assertions.assertEquals("Fizz", result);
    }

    @Test
    public void testDivisibleBy5() {
        int numb = 5;
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.check(numb);
        Assertions.assertEquals("Buzz", result);
    }

    @Test
    public void testDivisibleBy3And5() {
        int numb = 15;
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.check(numb);
        Assertions.assertEquals("FizzBuzz", result);
    }
    

    @Test
   public void testGenerateFizzBuzzArray() {
    String[] expected = {
        "1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz",
        "11", "Fizz", "13", "14", "FizzBuzz", "16", "17", "Fizz", "19", "Buzz"
    };
    FizzBuzz fizzBuzz = new FizzBuzz();
    String[] result = fizzBuzz.fizzBuzzArray();
    for (int i = 0; i < expected.length; i++) {
        Assertions.assertEquals(expected[i], result[i]);
    }
   }
//STAGE2
    @Test
        public void testNumberHas3OrDivisibleBy3() {
            int numb = 13;
            FizzBuzzStage2 fizzBuzz = new FizzBuzzStage2();
            String result = fizzBuzz.check(numb);
            Assertions.assertEquals("Fizz", result);
        }

        @Test
        public void testNumberHas5OrDivisibleBy5() {
            int numb = 25;
            FizzBuzzStage2 fizzBuzz = new FizzBuzzStage2();
            String result = fizzBuzz.check(numb);
            Assertions.assertEquals("Buzz", result);
        }
}
