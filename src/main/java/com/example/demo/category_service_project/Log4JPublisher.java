package com.example.demo.category_service_project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

@Component
public class Log4JPublisher {

  @Autowired
  private JmsTemplate jmsTemplate;

  @Value("${springjms.softwareQueue}")
  private String softwareQueue;
  @Value("${springjms.techQueue}")
  private String techQueue;
  @Value("${springjms.hackerQueue}")
  private String hackerQueue;
  @Value("${springjms.log4jQueue}")
  private String log4jQueue;

  /**
   * Send out the Log4j article to the 4 topics.
   */
  public void send() {
    jmsTemplate.convertAndSend(softwareQueue, CategoryServiceConstants.LOG_4_J_ARTICLE);
    jmsTemplate.convertAndSend(techQueue, CategoryServiceConstants.LOG_4_J_ARTICLE);
    jmsTemplate.convertAndSend(hackerQueue, CategoryServiceConstants.LOG_4_J_ARTICLE);
    jmsTemplate.convertAndSend(log4jQueue, CategoryServiceConstants.LOG_4_J_ARTICLE);
    jmsTemplate.setReceiveTimeout(5_000);
  }
}
