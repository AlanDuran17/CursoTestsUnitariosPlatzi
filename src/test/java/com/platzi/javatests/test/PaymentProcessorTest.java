package com.platzi.javatests.test;

import com.platzi.javatests.payments.PaymentGateway;
import com.platzi.javatests.payments.PaymentProcessor;
import com.platzi.javatests.payments.PaymentResponse;
import org.junit.*;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class PaymentProcessorTest {

    PaymentGateway gateway;
    PaymentProcessor processor;

    @Before
    public void setup() {
        gateway = Mockito.mock(PaymentGateway.class);
        processor = new PaymentProcessor(gateway);
    }

    @Test
    public void payment_is_correct() {
        Mockito.when(gateway.requestPayment(Mockito.any()))
                .thenReturn(new PaymentResponse(PaymentResponse.PaymentStatus.OK));

        assertTrue(processor.makePayment(1000));
    }

    @Test
    public void payment_is_wrong() {
        Mockito.when(gateway.requestPayment(Mockito.any()))
                .thenReturn(new PaymentResponse(PaymentResponse.PaymentStatus.ERROR));

        assertFalse(processor.makePayment(1000));
    }
}
