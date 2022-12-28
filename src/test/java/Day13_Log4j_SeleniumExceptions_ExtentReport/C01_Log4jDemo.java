package Day13_Log4j_SeleniumExceptions_ExtentReport;

import org.apache.log4j.PropertyConfigurator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class C01_Log4jDemo {
    public static void main(String[] args) {

        Logger logger= LogManager.getLogger(C01_Log4jDemo.class.getName());

        PropertyConfigurator.configure("log4j.properties");
        logger.trace("Trace");
        logger.debug("Debug");
        logger.info("Info");
        logger.warn("Warn");
        logger.error("Error");
        logger.fatal("Fatal");

    }
}