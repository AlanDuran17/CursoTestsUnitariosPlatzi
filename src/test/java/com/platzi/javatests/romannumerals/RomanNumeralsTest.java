package com.platzi.javatests.romannumerals;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class RomanNumeralsTest {
    @Test
    public void arabicToRoman_if_number_is_1() {
        int number = 1;
        assertThat(RomanNumerals.arabicToRoman(number), is("I"));
    }
    @Test
    public void arabicToRoman_if_number_is_2() {
        int number = 2;
        assertThat(RomanNumerals.arabicToRoman(number), is("II"));
    }
    @Test
    public void arabicToRoman_if_number_is_3() {
        int number = 3;
        assertThat(RomanNumerals.arabicToRoman(number), is("III"));
    }
    @Test
    public void arabicToRoman_if_number_is_4() {
        int number = 4;
        assertThat(RomanNumerals.arabicToRoman(number), is("IV"));
    }

    @Test
    public void arabicToRoman_if_number_is_5() {
        int number = 5;
        assertThat(RomanNumerals.arabicToRoman(number), is("V"));
    }

    @Test
    public void arabicToRoman_if_number_is_6() {
        int number = 6;
        assertThat(RomanNumerals.arabicToRoman(number), is("VI"));
    }

    @Test
    public void arabicToRoman_if_number_is_7() {
        int number = 7;
        assertThat(RomanNumerals.arabicToRoman(number), is("VII"));
    }

    @Test
    public void arabicToRoman_if_number_is_8() {
        int number = 8;
        assertThat(RomanNumerals.arabicToRoman(number), is("VIII"));
    }

}