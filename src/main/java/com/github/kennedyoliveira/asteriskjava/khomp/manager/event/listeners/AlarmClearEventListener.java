package com.github.kennedyoliveira.asteriskjava.khomp.manager.event.listeners;

import com.github.kennedyoliveira.asteriskjava.khomp.manager.event.AlarmClearEvent;
import org.asteriskjava.manager.ManagerEventListener;
import org.asteriskjava.manager.event.ManagerEvent;

/**
 * @author kennedy
 */
@FunctionalInterface
public interface AlarmClearEventListener extends ManagerEventListener {

    /**
     * Trigger when there is a {@link AlarmClearEvent}.
     *
     * @param event the event.
     */
    void handleAlarmClearEvent(AlarmClearEvent event);

    @Override
    default void onManagerEvent(ManagerEvent event) {
        if (event instanceof AlarmClearEvent) {
            handleAlarmClearEvent((AlarmClearEvent) event);
        }
    }
}
