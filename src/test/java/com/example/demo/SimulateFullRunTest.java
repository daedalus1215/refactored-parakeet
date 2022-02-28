package com.example.demo;

import com.example.demo.category_service_project.AggregatingPublisher;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SimulateFullRunTest {

  @Autowired
  AggregatingPublisher target;

  /**
   * This is to simulate an entire publishing of all 3 articles. Each article belongs to 2 or more categories. Each user contains 1 category (to reduce on confusion)
   */
  @Test
  public void testSendAndReceive() {
    target.send();

    //@TODO: Need to assert here

//    com.example.demo.current_project.listeners.TechListener Sending notification to User: Hamilton
//    User's phone numbers: 1234
//    User's categories: [Tech]
//    Title of article: Log4J Vulnerability
//    Url to article: https://www.cisa.gov/uscert/apache-log4j-vulnerability-guidance
//
//    com.example.demo.current_project.listeners.SoftwareListener Sending notification to User: Jefferson
//    User's phone numbers: 123
//    User's categories: [Software]
//    Title of article: Dao Hack
//    Url to article: https://www.gemini.com/cryptopedia/the-dao-hack-makerdao
//
//    com.example.demo.current_project.listeners.HackerListener Sending notification to User: Madison
//    User's phone numbers: 12345
//    User's categories: [Hacker]
//    Title of article: Dao Hack
//    Url to article: https://www.gemini.com/cryptopedia/the-dao-hack-makerdao
//
//    com.example.demo.current_project.listeners.Log4jListener Sending notification to User: Adams
//    User's phone numbers: 123456
//    User's categories: [Log4j]
//    Title of article: Log4J Vulnerability
//    Url to article: https://www.cisa.gov/uscert/apache-log4j-vulnerability-guidance
//
//    com.example.demo.current_project.listeners.SoftwareListener Sending notification to User: Jefferson
//    User's phone numbers: 123
//    User's categories: [Software]
//    Title of article: Log4J Vulnerability
//    Url to article: https://www.cisa.gov/uscert/apache-log4j-vulnerability-guidance
//
//    com.example.demo.current_project.listeners.TechListener Sending notification to User: Hamilton
//    User's phone numbers: 1234
//    User's categories: [Tech]
//    Title of article: Trezor 2 mill hack
//    Url to article: https://cointelegraph.com/news/engineer-hacks-trezor-wallet-recovers-2m-in-lost-crypto
//
//    com.example.demo.current_project.listeners.HackerListener Sending notification to User: Madison
//    User's phone numbers: 12345
//    User's categories: [Hacker]
//    Title of article: Log4J Vulnerability
//    Url to article: https://www.cisa.gov/uscert/apache-log4j-vulnerability-guidance
//
//    com.example.demo.current_project.listeners.HackerListener Sending notification to User: Madison
//    User's phone numbers: 12345
//    User's categories: [Hacker]
//    Title of article: Trezor 2 mill hack
//    Url to article: https://cointelegraph.com/news/engineer-hacks-trezor-wallet-recovers-2m-in-lost-crypto

  }
}
