package com.codewithazam.beta;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class demo1 {

    private static Logger log =  LogManager.getLogger(demo1.class.getName());
    public static void main(String[] args) {
        log.debug("I am debugging");
            log.info("Object is present.");
            log.error("Object isn't present.");
        log.fatal("This is fatal.");
    }
}
