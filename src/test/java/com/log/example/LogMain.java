package com.log.example;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LogMain {


    public static final Logger logger = LogManager.getLogger(LogMain.class.getName());

    public static void main(String[] args) {
        int numOne =10;
        int numTwo = 20;

        int total = numOne + numTwo;
        logger.debug("This main method was run successfully.");

        try {
            int num = numOne/numTwo;
            logger.info("Value of num" + num);

        }catch (ArithmeticException e ){
            logger.debug(e.getMessage());
        }

    }
}
