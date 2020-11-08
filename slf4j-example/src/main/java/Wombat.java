import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;

public class Wombat {

	final Logger logger = LoggerFactory.getLogger(Wombat.class);
	Integer t;
	Integer oldT;

	public void setTemperature(Integer temperature)
			throws IOException {

		oldT = t;        
		t = temperature;

		if (logger.isDebugEnabled()) {
			logger.debug("Temperature set to {}. Old temperature was {}.", t, oldT);
		}
		
		if(temperature.intValue() > 50) {
			logger.info("Temperature has risen above 50 degrees.");
		}

		try {
			int n = 10 / 0;
		} catch(Exception e) {
			//logger.error("Error during the calculation: ", e);
			throw new IOException("Error during the calculation: ", e);
		}
	}
} 
