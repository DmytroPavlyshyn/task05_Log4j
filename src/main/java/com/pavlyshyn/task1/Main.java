package com.pavlyshyn.task1;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {
    static final Logger logger = LogManager.getLogger(Main.class);

    public static void main(String[] args) {
        logger.info("test_1");
        logger.warn("test_1");
        logger.debug("test_1");
        logger.error("test_1");
        logger.fatal("test_1");
        logger.trace("test_1");

    }
}
