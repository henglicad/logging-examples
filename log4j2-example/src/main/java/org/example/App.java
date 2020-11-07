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
        System.out.println( "Hello World!" );

        logger.trace("This is a log message!");
        logger.debug("This is a log message!");
        logger.info("This is a log message!");
        logger.warn("This is a log message!");
        logger.error("This is a log message!");
        logger.fatal("This is a log message!");
    }
}
