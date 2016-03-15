package com.github.kennedyoliveira.asteriskjava.khomp.manager.event.listeners;

import com.github.kennedyoliveira.asteriskjava.khomp.manager.event.AlarmEvent;
import org.asteriskjava.manager.ManagerEventListener;
import org.asteriskjava.manager.event.ManagerEvent;

/**
 * @author kennedy
 */
@FunctionalInterface
public interface AlarmEventListener extends ManagerEventListener {

  /**
   * Triggers when there is a {@link AlarmEvent}
   *
   * @param event the event.
   */
  void handleAlarmEvent(AlarmEvent event);

  @Override
  default void onManagerEvent(ManagerEvent event) {
    if (event instanceof AlarmEvent) {
      handleAlarmEvent((AlarmEvent) event);
    }
  }
}
