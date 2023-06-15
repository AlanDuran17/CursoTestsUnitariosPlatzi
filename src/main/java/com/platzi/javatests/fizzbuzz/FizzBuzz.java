package com.platzi.javatests.fizzbuzz;

public class FizzBuzz {
    final static String FIZZ = "Fizz";
    final static String BUZZ = "Buzz";

    public static String fizzBuzz(int number) {
        String textoRetornable = "";

        textoRetornable += number % 3 == 0 ? FIZZ : "";
        textoRetornable += number % 5 == 0 ? BUZZ : "";

        return textoRetornable.isEmpty() ? String.valueOf(number) : textoRetornable;
    }
}
