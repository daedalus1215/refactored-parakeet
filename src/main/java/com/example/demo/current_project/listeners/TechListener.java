package com.example.demo.current_project.listeners;


import com.example.demo.current_project.services.NotifyUsersOfArticle;
import com.example.demo.dependency_library.Categories;
import com.example.demo.dependency_library.entities.ArticleEntity;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class TechListener {

  private final String NAME = TechListener.class.getName();
  private final NotifyUsersOfArticle service = new NotifyUsersOfArticle(Categories.TECH);

  @JmsListener(destination = "${springjms.techQueue}")
  public void receive(ArticleEntity article) {
    service.accept(article, NAME);
  }
}
