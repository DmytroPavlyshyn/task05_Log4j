package com.pavlyshyn.task3;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {
    static final Logger logger = LogManager.getLogger();

    public static void main(String[] args) {
        logger.info("task 3");
        logger.warn("task 3");
        logger.debug("task 3");
        logger.error("task 3");
        logger.fatal("task 3");
        logger.trace("task 3");
    }
}
