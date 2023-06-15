package com.platzi.javatests.discounts;

import org.hamcrest.CoreMatchers;
import org.junit.Test;

import static org.junit.Assert.assertThat;

public class PriceCalculatorShould {
    @Test
    public void total_zero_when_there_are_prices() {
        PriceCalculator calculator = new PriceCalculator();

        assertThat( calculator.getTotal(), CoreMatchers.is(0.0));
    }

    @Test
    public void total_is_the_sum_of_prices() {
        PriceCalculator calculator = new PriceCalculator();

        calculator.addPrice(13.0);
        calculator.addPrice(2.0);

        assertThat( calculator.getTotal(), CoreMatchers.is(15.0));
    }

    @Test
    public void apply_discount_to_prices() {
        PriceCalculator calculator = new PriceCalculator();

        calculator.addPrice(13.0);
        calculator.addPrice(2.0);

        calculator.setDiscount(50);

        assertThat( calculator.getTotal(), CoreMatchers.is(7.5));
    }
}