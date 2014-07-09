package com.seb.calculator;

import javax.jws.WebService;

/**
 * Created by sebastien.vandamme on 6/07/2014.
 */


@WebService(targetNamespace = "http://seb.com/wsdl")
public interface CalculatorWs {
    public int sum(int add1, int add2);

    public int multiply(int mul1, int mul2);
}