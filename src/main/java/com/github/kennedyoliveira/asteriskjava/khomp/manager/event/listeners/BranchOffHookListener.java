package com.github.kennedyoliveira.asteriskjava.khomp.manager.event.listeners;

import com.github.kennedyoliveira.asteriskjava.khomp.manager.event.BranchOffHookEvent;
import org.asteriskjava.manager.ManagerEventListener;
import org.asteriskjava.manager.event.ManagerEvent;

/**
 * @author kennedy
 */
@FunctionalInterface
public interface BranchOffHookListener extends ManagerEventListener {

  /**
   * Triggers when there is a {@link BranchOffHookEvent}
   *
   * @param event the event.
   */
  void handleBranchOffHookEvent(BranchOffHookEvent event);

  @Override
  default void onManagerEvent(ManagerEvent event) {
    if (event instanceof BranchOffHookEvent) {
      handleBranchOffHookEvent((BranchOffHookEvent) event);
    }
  }
}
