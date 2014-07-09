package com.seb.calculator;

import org.junit.Test;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.net.URL;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class CalculatorTest {

    @Test
    public void test() throws Exception {
        Service calculatorService = Service.create(
                new URL("http://localhost:8080/WS/Greeting?wsdl"),
                new QName("http://seb.com/wsdl", "CalculatorService"));

        assertNotNull(calculatorService);

        CalculatorWs calculator = calculatorService.getPort(CalculatorWs.class);
        assertEquals(10, calculator.sum(4, 6));
        assertEquals(12, calculator.multiply(3, 4));
        assertEquals(15, calculator.sum(7, 8));
    }
}