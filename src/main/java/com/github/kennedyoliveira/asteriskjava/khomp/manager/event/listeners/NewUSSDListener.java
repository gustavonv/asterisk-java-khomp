package com.github.kennedyoliveira.asteriskjava.khomp.manager.event.listeners;

import com.github.kennedyoliveira.asteriskjava.khomp.manager.event.NewUSSDEvent;
import org.asteriskjava.manager.ManagerEventListener;
import org.asteriskjava.manager.event.ManagerEvent;

/**
 * @author kennedy
 */
@FunctionalInterface
public interface NewUSSDListener extends ManagerEventListener {

  /**
   * Triggers when there is a {@link NewUSSDEvent}.
   *
   * @param event the event.
   */
  void handleNewUSSDEvent(NewUSSDEvent event);

  @Override
  default void onManagerEvent(ManagerEvent event) {
    if (event instanceof NewUSSDEvent) {
      handleNewUSSDEvent((NewUSSDEvent) event);
    }
  }
}
