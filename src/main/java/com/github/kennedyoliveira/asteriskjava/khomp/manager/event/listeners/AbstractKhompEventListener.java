package com.github.kennedyoliveira.asteriskjava.khomp.manager.event.listeners;

import com.github.kennedyoliveira.asteriskjava.khomp.manager.event.*;
import org.asteriskjava.manager.ManagerEventListener;
import org.asteriskjava.manager.event.ManagerEvent;

/**
 * Class allowing fast implementation of a listener for khomp events.
 *
 * @author kennedy
 */
public abstract class AbstractKhompEventListener implements ManagerEventListener {

    protected void handleAlarmClearEvent(AlarmClearEvent event) { }

    protected void handleAlarmEvent(AlarmEvent event) { }

    protected void handleAnswerInfoEvent(AnswerInfoEvent event) { }

    protected void handleAntennaLevelEvent(AntennaLevelEvent event) { }

    protected void handleBranchOffHookEvent(BranchOffHookEvent event) { }

    protected void handleBranchOnHookEvent(BranchOnHookEvent event) { }

    protected void handleCollectCallEvent(CollectCallEvent event) { }

    protected void handleKDisconnectionCauseEvent(KDisconnectionCauseEvent event) { }

    protected void handleKSendSMSResponseEvent(KSendSMSResponseEvent event) { }

    protected void handleSMSBroadcastEvent(NewSMSBroadcastEvent event) {}

    protected void handleSMSConfirmationEvent(NewSMSConfirmationEvent event) {}

    protected void handleNewSMSEvent(NewSMSEvent event) {}

    protected void handleNewUSSDEvent(NewUSSDEvent event) {}

    protected void handleOperatorRegistryEvent(OperatorRegistryEvent event) {}

    protected void handleSIMSelectionFinishedEvent(SIMSelectionFinishedEvent event) {}

    protected void handleTransferedEvent(TransferedEvent event) {}

    @Override
    public void onManagerEvent(ManagerEvent event) {
        if (event instanceof AlarmClearEvent) {
            handleAlarmClearEvent((AlarmClearEvent) event);
        } else if (event instanceof AlarmEvent) {
            handleAlarmEvent((AlarmEvent) event);
        } else if (event instanceof AnswerInfoEvent) {
            handleAnswerInfoEvent((AnswerInfoEvent) event);
        } else if (event instanceof AntennaLevelEvent) {
            handleAntennaLevelEvent((AntennaLevelEvent) event);
        } else if (event instanceof BranchOffHookEvent) {
            handleBranchOffHookEvent((BranchOffHookEvent) event);
        } else if (event instanceof BranchOnHookEvent) {
            handleBranchOnHookEvent((BranchOnHookEvent) event);
        } else if (event instanceof CollectCallEvent) {
            handleCollectCallEvent((CollectCallEvent) event);
        } else if (event instanceof KDisconnectionCauseEvent) {
            handleKDisconnectionCauseEvent((KDisconnectionCauseEvent) event);
        } else if (event instanceof KSendSMSResponseEvent) {
            handleKSendSMSResponseEvent((KSendSMSResponseEvent) event);
        } else if (event instanceof NewSMSBroadcastEvent) {
            handleSMSBroadcastEvent((NewSMSBroadcastEvent) event);
        } else if (event instanceof NewSMSConfirmationEvent) {
            handleSMSConfirmationEvent((NewSMSConfirmationEvent) event);
        } else if (event instanceof NewSMSEvent) {
            handleNewSMSEvent((NewSMSEvent) event);
        } else if (event instanceof NewUSSDEvent) {
            handleNewUSSDEvent((NewUSSDEvent) event);
        } else if (event instanceof OperatorRegistryEvent) {
            handleOperatorRegistryEvent((OperatorRegistryEvent) event);
        } else if (event instanceof SIMSelectionFinishedEvent) {
            handleSIMSelectionFinishedEvent((SIMSelectionFinishedEvent) event);
        } else if (event instanceof TransferedEvent) {
            handleTransferedEvent((TransferedEvent) event);
        }
    }
}
