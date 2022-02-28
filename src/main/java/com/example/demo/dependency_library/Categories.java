package com.example.demo.dependency_library;

/**
 * Presumably in a library that projects like the Notification Service can consume and depend on as a
 * sort of shared set of entities. This can cause bottlenecks across projects and may not be desire-able for
 * larger systems of orchestration.
 */

public class Categories {

  static public String SOFTWARE = "Software";
  static public String TECH = "Tech";
  static public String HACKER = "Hacker";
  static public String LOG4J = "Log4j";
}
