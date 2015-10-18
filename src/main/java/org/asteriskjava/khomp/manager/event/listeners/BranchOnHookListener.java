package org.asteriskjava.khomp.manager.event.listeners;

import org.asteriskjava.khomp.manager.event.BranchOnHookEvent;
import org.asteriskjava.manager.ManagerEventListener;
import org.asteriskjava.manager.event.ManagerEvent;

/**
 * @author kennedy
 */
@FunctionalInterface
public interface BranchOnHookListener extends ManagerEventListener {

    /**
     * Triggers when there is a {@link BranchOnHookEvent}
     *
     * @param event the event.
     */
    void handleBrancOnHookEvent(BranchOnHookEvent event);

    @Override
    default void onManagerEvent(ManagerEvent event) {
        if (event instanceof BranchOnHookEvent) {
            handleBrancOnHookEvent((BranchOnHookEvent) event);
        }
    }
}
