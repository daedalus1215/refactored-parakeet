package com.example.demo.dependency_library.entities;

import java.io.Serializable;

/**
 * Presumably in a library that projects like the Notification Service can consume and depend on as a
 * sort of shared set of entities. This can cause bottlenecks across projects and may not be desire-able for
 * larger systems of orchestration.
 */

public class ArticleEntity implements Serializable {

  private String url;
  private String title;

  /**
   * Shared entity across projects
   * @param url
   * @param title
   */
  public ArticleEntity(String url, String title) {
    this.url = url;
    this.title = title;
  }

  public String getUrl() {
    return url;
  }

  public String getTitle() {
    return title;
  }
}
