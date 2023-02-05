package org.example.phone;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Apple {


  private final Logger logger = LoggerFactory.getLogger(this.getClass());

  public Apple() {
  }

  public void printLog() {
    logger.trace("trace");
    logger.debug("debug");
    logger.info("info");
    logger.warn("warn");
  }

}
