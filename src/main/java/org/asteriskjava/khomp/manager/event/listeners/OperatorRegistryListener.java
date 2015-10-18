package org.asteriskjava.khomp.manager.event.listeners;

import org.asteriskjava.khomp.manager.event.OperatorRegistryEvent;
import org.asteriskjava.manager.ManagerEventListener;
import org.asteriskjava.manager.event.ManagerEvent;

/**
 * @author kennedy
 */
@FunctionalInterface
public interface OperatorRegistryListener extends ManagerEventListener {

    /**
     * Triggers when there is a {@link OperatorRegistryEvent}.
     *
     * @param event the event.
     */
    void handleOperatorRegistryEvent(OperatorRegistryEvent event);

    @Override
    default void onManagerEvent(ManagerEvent event) {
        if (event instanceof OperatorRegistryEvent) {
            handleOperatorRegistryEvent((OperatorRegistryEvent) event);
        }
    }
}
