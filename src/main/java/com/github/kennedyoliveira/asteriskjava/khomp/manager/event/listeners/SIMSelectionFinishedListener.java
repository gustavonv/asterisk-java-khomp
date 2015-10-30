package com.github.kennedyoliveira.asteriskjava.khomp.manager.event.listeners;

import com.github.kennedyoliveira.asteriskjava.khomp.manager.event.SIMSelectionFinishedEvent;
import org.asteriskjava.manager.ManagerEventListener;
import org.asteriskjava.manager.event.ManagerEvent;

/**
 * @author kennedy
 */
@FunctionalInterface
public interface SIMSelectionFinishedListener extends ManagerEventListener {

    /**
     * Trigger when there is a {@link SIMSelectionFinishedEvent}.
     *
     * @param event The event.
     */
    void handleSIMSelectionFinishedEvent(SIMSelectionFinishedEvent event);

    @Override
    default void onManagerEvent(ManagerEvent event) {
        if (event instanceof SIMSelectionFinishedEvent) {
            handleSIMSelectionFinishedEvent((SIMSelectionFinishedEvent) event);
        }
    }
}
