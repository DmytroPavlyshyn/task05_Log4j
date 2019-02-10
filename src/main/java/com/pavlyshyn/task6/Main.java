package com.pavlyshyn.task6;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {
    static final Logger logger = LogManager.getLogger();

    public static void main(String[] args) {
        logger.info( "task 6");
        logger.warn( "task 6");
        logger.debug("task 6");
        logger.error("task 6");
        logger.fatal("task 6");
        logger.trace("task 6");
    }
}