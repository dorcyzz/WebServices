package com.seb.calculator;


import javax.xml.ws.Endpoint;


/**
 * Created by sebastien.vandamme on 6/07/2014.
 */


public class WSPublisher {
    public static void main(String[] args) {
        Endpoint.publish("http://localhost:8080/WS/Greeting", new Calculator());
    }
}
