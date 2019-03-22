package com.main;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public class Other {

    static Logger log = LogManager.getLogger(Other.class);

    public static void helloWorld(){

        log.trace("Hello World");
    }

}
