package com.example.demo.current_project.Adapters;

/**
 * Not sure how adaptive this needs to be. This seems to be a decent balance for the moment.
 * @param <T> user needs to have some sort of property that the implementor can grab as a target to send the notification (presumably).
 * @param <U> article needs to have some sort of property that the implementor can grab as a link and title (presumably).
 * @param <String> Source: probably a listener
 */
public interface MessageInterface<T, U, String> {

  void send(T user, U article, String source);
}
