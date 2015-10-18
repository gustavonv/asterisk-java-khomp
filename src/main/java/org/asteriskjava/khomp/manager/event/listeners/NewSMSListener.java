package org.asteriskjava.khomp.manager.event.listeners;

import org.asteriskjava.khomp.manager.event.NewSMSEvent;
import org.asteriskjava.manager.ManagerEventListener;
import org.asteriskjava.manager.event.ManagerEvent;

/**
 * @author kennedy
 */
@FunctionalInterface
public interface NewSMSListener extends ManagerEventListener {

    void handleNewSMSEvent(NewSMSEvent event);

    @Override
    default void onManagerEvent(ManagerEvent event) {
        if (event instanceof NewSMSEvent) {
            handleNewSMSEvent((NewSMSEvent) event);
        }
    }
}
