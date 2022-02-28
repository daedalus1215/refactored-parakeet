package com.example.demo;

import com.example.demo.category_service_project.Log4JPublisher;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Log4JListenerTest {

  @Autowired
  Log4JPublisher publisher;

  @Test
  public void publishLog4jArticle_toAll4Topics_with1UserPerTopicSubscription_shouldNotifyAll4Users() {
    publisher.send();
    //@TODO: need to make assertions here

    //    com.example.demo.current_project.listeners.TechListener Sending notification to User: Hamilton
    //    User's phone numbers: 1234
    //    User's categories: [Tech]
    //    Title of article: Log4J Vulnerability
    //    Url to article: https://www.cisa.gov/uscert/apache-log4j-vulnerability-guidance
    //
    //    com.example.demo.current_project.listeners.SoftwareListener Sending notification to User: Jefferson
    //    User's phone numbers: 123
    //    User's categories: [Software]
    //    Title of article: Log4J Vulnerability
    //    Url to article: https://www.cisa.gov/uscert/apache-log4j-vulnerability-guidance
    //
    //    com.example.demo.current_project.listeners.HackerListener Sending notification to User: Madison
    //    User's phone numbers: 12345
    //    User's categories: [Hacker]
    //    Title of article: Log4J Vulnerability
    //    Url to article: https://www.cisa.gov/uscert/apache-log4j-vulnerability-guidance
    //
    //    com.example.demo.current_project.listeners.Log4jListener Sending notification to User: Adams
    //    User's phone numbers: 123456
    //    User's categories: [Log4j]
    //    Title of article: Log4J Vulnerability
    //    Url to article: https://www.cisa.gov/uscert/apache-log4j-vulnerability-guidance
  }
}