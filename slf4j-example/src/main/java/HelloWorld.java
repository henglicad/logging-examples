import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;

public class HelloWorld {
  final static Logger logger = LoggerFactory.getLogger(HelloWorld.class);
  public static void main(String[] args) {
    System.out.println("Starting program...");
    logger.info("Hello World - SLF4J");
    Wombat wombat = new Wombat();
    try {
      wombat.setTemperature(60);
    } catch (IOException e) {
      logger.error("Error in setTemperature: ", e);
    }
    logger.info("Set temperature.");
  }
}