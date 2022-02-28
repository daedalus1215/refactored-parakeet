package com.example.demo.category_service_project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * This mocks the Category Service that we do not actually have to implement. It will fire off our
 * topic notification mechanism.
 */
@Component
public class AggregatingPublisher {

  @Autowired
  DaoAttackArticlePublisher daoAttackArticlePublisher;

  @Autowired
  Log4JPublisher log4JPublisher;

  @Autowired
  TrezorHackArticlePublisher trezorHackArticlePublisher;


  public void send() {
    daoAttackArticlePublisher.send();
    log4JPublisher.send();
    trezorHackArticlePublisher.send();
  }
}
