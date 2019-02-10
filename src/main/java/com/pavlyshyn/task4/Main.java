package com.pavlyshyn.task4;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {
    static final Logger logger = LogManager.getLogger();

    public static void main(String[] args) {
        logger.info( "task 4");
        logger.warn( "task 4");
        logger.debug("task 4");
        logger.error("task 4");
        logger.fatal("task 4");
        logger.trace("task 4");
    }
}