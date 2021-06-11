package com.codewithazam.alpha;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class demo {

    private static Logger log =  LogManager.getLogger(demo.class.getName());
    public static void main(String[] args) {
        log.debug("I have clicked on button.");
            log.info("Button is displayed.");
            log.error("Button is not displayed.");
        log.fatal("Button is missing.");
    }
}
