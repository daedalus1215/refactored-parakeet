package com.example.demo;

import com.example.demo.category_service_project.DaoAttackArticlePublisher;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DaoAttackArticleListenerTest {

  @Autowired
  DaoAttackArticlePublisher publisher;

  @Test
  public void publishTrezorHackArticle_toTechAndHackerTopics_with1UserPerTopicSubscription_shouldNotify2Users() {
    publisher.send();
    //@TODO: need to make assertions here

    //    com.example.demo.current_project.listeners.HackerListener Sending notification to User: Madison
    //    User's phone numbers: 12345
    //    User's categories: [Hacker]
    //    Title of article: Dao Hack
    //    Url to article: https://www.gemini.com/cryptopedia/the-dao-hack-makerdao
    //
    //    com.example.demo.current_project.listeners.SoftwareListener Sending notification to User: Jefferson
    //    User's phone numbers: 123
    //    User's categories: [Software]
    //    Title of article: Dao Hack
    //    Url to article: https://www.gemini.com/cryptopedia/the-dao-hack-makerdao
  }
}