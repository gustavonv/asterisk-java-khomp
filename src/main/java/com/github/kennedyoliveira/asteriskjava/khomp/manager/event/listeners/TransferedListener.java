package com.github.kennedyoliveira.asteriskjava.khomp.manager.event.listeners;

import com.github.kennedyoliveira.asteriskjava.khomp.manager.event.TransferedEvent;
import org.asteriskjava.manager.ManagerEventListener;
import org.asteriskjava.manager.event.ManagerEvent;

/**
 * @author kennedy
 */
@FunctionalInterface
public interface TransferedListener extends ManagerEventListener {

  /**
   * Trigger when there is a {@link TransferedEvent}.
   *
   * @param event The event.
   */
  void handleTransferedEvent(TransferedEvent event);

  @Override
  default void onManagerEvent(ManagerEvent event) {
    if (event instanceof TransferedEvent) {
      handleTransferedEvent((TransferedEvent) event);
    }
  }
}
