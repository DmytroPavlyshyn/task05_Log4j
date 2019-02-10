package com.pavlyshyn.task7;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {
    static final Logger logger = LogManager.getLogger();

    public static void main(String[] args) {
        logger.info( "task 7");
        logger.warn( "task 7");
        logger.debug("task 7");
        logger.error("task 7");
        logger.fatal("task 7");
        logger.trace("task 7");
    }
}