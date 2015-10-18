package org.asteriskjava.khomp.manager.event.listeners;

import org.asteriskjava.khomp.manager.event.KSendSMSResponseEvent;
import org.asteriskjava.manager.ManagerEventListener;
import org.asteriskjava.manager.event.ManagerEvent;

/**
 * @author kennedy
 */
@FunctionalInterface
public interface KSendSMSResponseListener extends ManagerEventListener {

    /**
     * Trigger when there is a {@link KSendSMSResponseEvent}
     *
     * @param event the event.
     */
    void handleKSendSMSResponseEvent(KSendSMSResponseEvent event);

    @Override
    default void onManagerEvent(ManagerEvent event) {
        if (event instanceof KSendSMSResponseEvent) {
            handleKSendSMSResponseEvent((KSendSMSResponseEvent) event);
        }
    }
}
