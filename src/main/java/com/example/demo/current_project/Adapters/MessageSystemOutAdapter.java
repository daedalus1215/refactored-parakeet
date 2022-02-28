package com.example.demo.current_project.Adapters;

import com.example.demo.dependency_library.entities.ArticleEntity;
import com.example.demo.dependency_library.entities.UserEntity;

/**
 * A Dummy Adapter that pipes the article link out in the terminal to simulate sending of a SMS message to a specific phone number (target).
 */
public class MessageSystemOutAdapter implements MessageInterface<UserEntity, ArticleEntity, String> {

  /**
   *
   * @param userEntity phone number of the user we want to notify.
   * @param articleEntity article link we are sending to the user.
   */
  public void send(UserEntity userEntity, ArticleEntity articleEntity, String listener) {
    System.out.println(listener
        + " Sending notification to User: " + userEntity.getName() + "\n"
        + " User's phone numbers: " + userEntity.getPhone() + "\n"
        + " User's categories: " + userEntity.getCategories() + "\n"
        + " Title of article: " + articleEntity.getTitle() + "\n"
        + " Url to article: " + articleEntity.getUrl() + "\n"
    );
  }
}
