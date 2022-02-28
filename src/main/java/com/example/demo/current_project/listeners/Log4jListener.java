package com.example.demo.current_project.listeners;


import com.example.demo.current_project.services.NotifyUsersOfArticle;
import com.example.demo.dependency_library.Categories;
import com.example.demo.dependency_library.entities.ArticleEntity;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class Log4jListener {

  private final String NAME = Log4jListener.class.getName();
  private final NotifyUsersOfArticle service = new NotifyUsersOfArticle(Categories.LOG4J);

  @JmsListener(destination = "${springjms.log4jQueue}")
  public void receive(ArticleEntity article) {
    service.accept(article, NAME);
  }
}
