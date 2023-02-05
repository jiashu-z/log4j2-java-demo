package org.example.computer;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Dell {


  private final Logger logger = LoggerFactory.getLogger(this.getClass());

  public Dell() {
  }

  public void printLog() {
    logger.trace("trace");
    logger.debug("debug");
    logger.info("info");
    logger.warn("warn");
  }

}
