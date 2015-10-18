package org.asteriskjava.khomp.manager.event.listeners;

import org.asteriskjava.khomp.manager.event.NewSMSConfirmationEvent;
import org.asteriskjava.manager.ManagerEventListener;
import org.asteriskjava.manager.event.ManagerEvent;

/**
 * @author kennedy
 */
@FunctionalInterface
public interface SMSConfirmationListener extends ManagerEventListener {

    /**
     * Triggered when there is a {@link NewSMSConfirmationEvent}.
     *
     * @param event The event fired by manager.
     */
    void handleSMSConfirmation(NewSMSConfirmationEvent event);

    @Override
    default void onManagerEvent(ManagerEvent event) {
        if (event instanceof NewSMSConfirmationEvent) {
            handleSMSConfirmation((NewSMSConfirmationEvent) event);
        }
    }
}
