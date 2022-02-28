package com.example.demo.current_project.daos;

import static java.util.Collections.singletonList;

import com.example.demo.dependency_library.Categories;
import com.example.demo.dependency_library.entities.UserEntity;
import java.util.ArrayList;
import java.util.List;

/**
 * Mocking in the UserDAO to return UserEntity stubs for demonstrative purposes
 */
public class UserDAO implements UserDAOInterface {

  private final List<UserEntity> userEntities = new ArrayList() {{
    add(new UserEntity("123", "Jefferson", singletonList(Categories.SOFTWARE)));
    add(new UserEntity("1234", "Hamilton", singletonList(Categories.TECH)));
    add(new UserEntity("12345", "Madison", singletonList(Categories.HACKER)));
    add(new UserEntity("123456", "Adams", singletonList(Categories.LOG4J)));
  }};

  public List<UserEntity> getUsers() {
    return userEntities;
  }
}
