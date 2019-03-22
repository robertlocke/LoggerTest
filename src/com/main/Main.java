package com.main;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;


public class Main {


     static Logger logger = LogManager.getLogger(Main.class);

    public static void main(String[] args) {



        logger.info("Starting Program...");

        while(true) {

            Other.helloWorld();
            logger.trace("trace");
            logger.debug("Debug");
            logger.info("Info");
            logger.error("error");
            logger.warn("Warn");
            logger.fatal("fatal");
        }

    }


}
