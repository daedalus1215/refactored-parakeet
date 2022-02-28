package com.example.demo.current_project.listeners;


import com.example.demo.current_project.services.NotifyUsersOfArticle;
import com.example.demo.dependency_library.Categories;
import com.example.demo.dependency_library.entities.ArticleEntity;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class SoftwareListener {

  private final String NAME = SoftwareListener.class.getName();

  private final NotifyUsersOfArticle service = new NotifyUsersOfArticle(Categories.SOFTWARE);

  @JmsListener(destination = "${springjms.softwareQueue}")
  public void receive(ArticleEntity article) {
    service.accept(article, NAME);
  }
}
