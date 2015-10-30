package com.github.kennedyoliveira.asteriskjava.khomp.manager.event.listeners;

import com.github.kennedyoliveira.asteriskjava.khomp.manager.event.AnswerInfoEvent;
import org.asteriskjava.manager.ManagerEventListener;
import org.asteriskjava.manager.event.ManagerEvent;

/**
 * @author kennedy
 */
@FunctionalInterface
public interface AnswerInfoListener extends ManagerEventListener {

    /**
     * Triggers when there is a {@link AnswerInfoEvent}
     *
     * @param event the event.
     */
    void handleAnswerInfo(AnswerInfoEvent event);

    @Override
    default void onManagerEvent(ManagerEvent event) {
        if (event instanceof AnswerInfoEvent) {
            handleAnswerInfo((AnswerInfoEvent) event);
        }
    }
}
