package com.seb.calculator;


import javax.jws.WebService;

/**
 * Created by sebastien.vandamme on 6/07/2014.
 */

@WebService(
        portName = "CalculatorPort",
        serviceName = "CalculatorService",
        targetNamespace = "http://seb.com/wsdl",
        endpointInterface = "com.seb.calculator.CalculatorWs")
public class Calculator implements CalculatorWs {

    public Calculator() {
    }

    public int sum(int add1, int add2) {
        return add1 + add2;
    }

    public int multiply(int mul1, int mul2) {
        return mul1 * mul2;
    }
}