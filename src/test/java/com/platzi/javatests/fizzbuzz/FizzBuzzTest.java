package com.platzi.javatests.fizzbuzz;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class FizzBuzzTest {
    @Test
    public void fizzBuzz_when_number_is_3() {
        int number = 3;
        assertThat(FizzBuzz.fizzBuzz(number), is("Fizz"));
    }

    @Test
    public void fizzBuzz_when_number_is_6() {
        int number = 6;
        assertThat(FizzBuzz.fizzBuzz(number), is("Fizz"));
    }

    @Test
    public void fizzBuzz_when_number_is_5() {
        int number = 5;
        assertThat(FizzBuzz.fizzBuzz(number), is("Buzz"));
    }

    @Test
    public void fizzBuzz_when_number_is_10() {
        int number = 10;
        assertThat(FizzBuzz.fizzBuzz(number), is("Buzz"));
    }

    @Test
    public void fizzBuzz_when_number_is_2() {
        int number = 2;
        assertThat(FizzBuzz.fizzBuzz(number), is("2"));
    }

    @Test
    public void fizzBuzz_when_number_is_16() {
        int number = 16;
        assertThat(FizzBuzz.fizzBuzz(number), is("16"));
    }
}