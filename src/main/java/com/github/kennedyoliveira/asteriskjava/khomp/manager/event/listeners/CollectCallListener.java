package com.github.kennedyoliveira.asteriskjava.khomp.manager.event.listeners;

import com.github.kennedyoliveira.asteriskjava.khomp.manager.event.CollectCallEvent;
import org.asteriskjava.manager.ManagerEventListener;
import org.asteriskjava.manager.event.ManagerEvent;

/**
 * @author kennedy
 */
@FunctionalInterface
public interface CollectCallListener extends ManagerEventListener {

  /**
   * Triggers where there is a {@link CollectCallEvent}
   *
   * @param event the event.
   */
  void handleCollectCallEvent(CollectCallEvent event);

  @Override
  default void onManagerEvent(ManagerEvent event) {
    if (event instanceof CollectCallEvent) {
      handleCollectCallEvent((CollectCallEvent) event);
    }
  }
}
