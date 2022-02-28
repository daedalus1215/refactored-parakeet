package com.example.demo.category_service_project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

@Component
public class DaoAttackArticlePublisher {

  @Autowired
  private JmsTemplate jmsTemplate;

  @Value("${springjms.softwareQueue}")
  private String softwareTopic;
  @Value("${springjms.hackerQueue}")
  private String hackerTopic;


  /**
   * Represents the DAO article being published to software and hacker topic
   */
  public void send() {
    jmsTemplate.convertAndSend(softwareTopic, CategoryServiceConstants.DAO_HACK_ARTICLE);
    jmsTemplate.convertAndSend(hackerTopic, CategoryServiceConstants.DAO_HACK_ARTICLE);
    jmsTemplate.setReceiveTimeout(5_000);
  }
}
