package com.github.kennedyoliveira.asteriskjava.khomp.manager.event.listeners;

import com.github.kennedyoliveira.asteriskjava.khomp.manager.event.AntennaLevelEvent;
import org.asteriskjava.manager.ManagerEventListener;
import org.asteriskjava.manager.event.ManagerEvent;

/**
 * @author kennedy
 */
@FunctionalInterface
public interface AntennaLevelListener extends ManagerEventListener {

  /**
   * Triggers when there is a {@link AntennaLevelEvent}.
   *
   * @param event the event.
   */
  void handleAntennaLevelEvent(AntennaLevelEvent event);

  @Override
  default void onManagerEvent(ManagerEvent event) {
    if (event instanceof AntennaLevelEvent) {
      handleAntennaLevelEvent((AntennaLevelEvent) event);
    }
  }
}
