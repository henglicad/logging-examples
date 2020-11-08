package org.example;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Hello world!
 *
 */
public class App 
{
    private static final Logger logger = LogManager.getLogger(App.class);

    public static void main( String[] args )
    {
        int val1 = 10, val2 = 20, val3 = 30;

        System.out.println( "Hello World!" );

        logger.trace("val1={}, val2={}, val3={}", val1, val2, val3);
        logger.debug("val1={}, val2={}, val3={}", val1, val2, val3);
        logger.info("val1={}, val2={}, val3={}", val1, val2, val3);
        logger.warn("val1={}, val2={}, val3={}", val1, val2, val3);
        logger.error("val1={}, val2={}, val3={}", val1, val2, val3);
        logger.fatal("val1={}, val2={}, val3={}", val1, val2, val3);
    }
}
