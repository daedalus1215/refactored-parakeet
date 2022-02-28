package com.example.demo;

import com.example.demo.category_service_project.TrezorHackArticlePublisher;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TrezorHackArticleListenerTest {

  @Autowired
  TrezorHackArticlePublisher publisher;

  @Test
  public void publishSoftwareArticle_2UsersShouldReceiveTheArticle() {
    publisher.send();
    //@TODO: need to make assertions here

    //    com.example.demo.current_project.listeners.TechListener Sending notification to User: Hamilton
    //    User's phone numbers: 1234
    //    User's categories: [Tech]
    //    Title of article: Trezor 2 mill hack
    //    Url to article: https://cointelegraph.com/news/engineer-hacks-trezor-wallet-recovers-2m-in-lost-crypto
    //
    //    com.example.demo.current_project.listeners.HackerListener Sending notification to User: Madison
    //    User's phone numbers: 12345
    //    User's categories: [Hacker]
    //    Title of article: Trezor 2 mill hack
    //    Url to article: https://cointelegraph.com/news/engineer-hacks-trezor-wallet-recovers-2m-in-lost-crypto
  }
}