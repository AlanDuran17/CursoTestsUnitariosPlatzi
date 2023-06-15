package com.platzi.javatests.romannumerals;

public class RomanNumerals {
    public static String arabicToRoman(int n) {
        int[] arabicValues = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] romanSymbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        StringBuilder romanNumeral = new StringBuilder();

        for (int i = 0; i < arabicValues.length; i++) {
            while (n >= arabicValues[i]) {
                romanNumeral.append(romanSymbols[i]);
                n -= arabicValues[i];
            }
        }

        return romanNumeral.toString();
    }
}
