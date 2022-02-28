package com.example.demo.current_project.services;

import com.example.demo.current_project.Adapters.MessageInterface;
import com.example.demo.current_project.Adapters.MessageSystemOutAdapter;
import com.example.demo.current_project.daos.UserDAO;
import com.example.demo.current_project.daos.UserDAOInterface;
import com.example.demo.dependency_library.entities.ArticleEntity;
import java.util.function.BiConsumer;

public class NotifyUsersOfArticle implements BiConsumer<ArticleEntity, String> {

  final private UserDAOInterface userDao = new UserDAO();
  final private MessageInterface smsMessenger = new MessageSystemOutAdapter();
  final private String categoryName;

  public NotifyUsersOfArticle(String categoryName) {
    this.categoryName = categoryName;
  }

  @Override
  public void accept(ArticleEntity article, String listenerName) {

    this.userDao.getUsers().stream()
        .filter(userEntity -> userEntity.getCategories().contains(categoryName))
        .forEach(userEntity -> smsMessenger.send(userEntity, article, listenerName));
  }
}
