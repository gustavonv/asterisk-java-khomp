package com.github.kennedyoliveira.asteriskjava.khomp.manager.event.listeners;

import com.github.kennedyoliveira.asteriskjava.khomp.manager.event.NewSMSBroadcastEvent;
import org.asteriskjava.manager.ManagerEventListener;
import org.asteriskjava.manager.event.ManagerEvent;

/**
 * @author kennedy
 */
@FunctionalInterface
public interface NewSMSBroadcastListener extends ManagerEventListener {

  /**
   * Trigger when there is a new {@link NewSMSBroadcastEvent}.
   *
   * @param event the event.
   */
  void handleNewSMSBroadcastEvent(NewSMSBroadcastEvent event);

  @Override
  default void onManagerEvent(ManagerEvent event) {
    if (event instanceof NewSMSBroadcastEvent) {
      handleNewSMSBroadcastEvent((NewSMSBroadcastEvent) event);
    }
  }
}
