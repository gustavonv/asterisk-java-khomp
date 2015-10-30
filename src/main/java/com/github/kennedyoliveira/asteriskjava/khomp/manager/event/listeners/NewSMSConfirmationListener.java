package com.github.kennedyoliveira.asteriskjava.khomp.manager.event.listeners;

import com.github.kennedyoliveira.asteriskjava.khomp.manager.event.NewSMSConfirmationEvent;
import org.asteriskjava.manager.ManagerEventListener;
import org.asteriskjava.manager.event.ManagerEvent;

/**
 * @author kennedy
 */
@FunctionalInterface
public interface NewSMSConfirmationListener extends ManagerEventListener {

    /**
     * Trigger when there is a {@link NewSMSConfirmationEvent}.
     *
     * @param event the event.
     */
    void handleNewSMSConfirmationEvent(NewSMSConfirmationEvent event);

    @Override
    default void onManagerEvent(ManagerEvent event) {
        if (event instanceof NewSMSConfirmationEvent) {
            handleNewSMSConfirmationEvent((NewSMSConfirmationEvent) event);
        }
    }
}
