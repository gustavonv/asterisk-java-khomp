package com.github.kennedyoliveira.asteriskjava.khomp.manager.event.listeners;

import com.github.kennedyoliveira.asteriskjava.khomp.manager.event.KDisconnectionCauseEvent;
import org.asteriskjava.manager.ManagerEventListener;
import org.asteriskjava.manager.event.ManagerEvent;

/**
 * @author kennedy
 */
@FunctionalInterface
public interface KDisconnectionCauseListener extends ManagerEventListener {

  /**
   * Trigger whe there is a {@link KDisconnectionCauseEvent}.
   *
   * @param event the event.
   */
  void handleKDisconnectionCause(KDisconnectionCauseEvent event);

  @Override
  default void onManagerEvent(ManagerEvent event) {
    if (event instanceof KDisconnectionCauseEvent) {
      handleKDisconnectionCause((KDisconnectionCauseEvent) event);
    }
  }
}
