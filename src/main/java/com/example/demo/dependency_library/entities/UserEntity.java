package com.example.demo.dependency_library.entities;

import java.util.List;

/**
 * Presumably in a library that projects like the Notification Service can consume and depend on as a
 * sort of shared set of entities. This can cause bottlenecks across projects and may not be desire-able for
 * larger systems of orchestration.
 */


public class UserEntity {

  private String phone;
  private String name;
  private List<String> categories;

  /**
   * Shared Entity across projects
   * @param phone
   * @param name
   * @param categories
   */
  public UserEntity(String phone, String name, List<String> categories) {
    this.phone = phone;
    this.name = name;
    this.categories = categories;
  }

  public String getPhone() {
    return phone;
  }

  public String getName() {
    return name;
  }

  public List<String> getCategories() {
    return categories;
  }
}
