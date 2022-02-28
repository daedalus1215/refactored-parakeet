package com.example.demo.category_service_project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

@Component
public class TrezorHackArticlePublisher {

  @Autowired
  private JmsTemplate jmsTemplate;

  @Value("${springjms.techQueue}")
  private String techTopic;
  @Value("${springjms.hackerQueue}")
  private String hackerTopic;

  public void send() {
    jmsTemplate.convertAndSend(techTopic, CategoryServiceConstants.HACK_TREZOR_ARTICLE);
    jmsTemplate.convertAndSend(hackerTopic, CategoryServiceConstants.HACK_TREZOR_ARTICLE);
    jmsTemplate.setReceiveTimeout(5_000);
  }
}
