package com.pavlyshyn.task5;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {
    static final Logger logger = LogManager.getLogger();

    public static void main(String[] args) {
        logger.info( "task 5");
        logger.warn( "task 5");
        logger.debug("task 5");
        logger.error("task 5");
        logger.fatal("task 5");
        logger.trace("task 5");
    }
}