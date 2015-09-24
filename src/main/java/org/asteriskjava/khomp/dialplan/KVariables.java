package org.asteriskjava.khomp.dialplan;

import org.asteriskjava.khomp.dialplan.applications.KSendSmsApp;
import org.asteriskjava.khomp.fastagi.command.KSendSmsCommand;

/**
 * Variables from Dialplan that are set by Khomp Driver.
 *
 * @author kennedy
 */
public enum KVariables {

    /**
     * <p>This variable is set after using the {@link KSendSmsApp} and in the context for receiving SMS.</p>
     * <p>This variable is set only by the {@link KSendSmsApp}, if you use the {@link KSendSmsCommand} it won't be set.</p>
     * <p>In the context for receiving SMS, this variable will only be set by confirmation messages received.</p>
     * <p>It'll hold a reference number between 0 and 255 for a message that was sent, and {@code None} for a message that was not.</p>
     * <p>When more than 1 message is sent, the reference numbers will come separeted by {@code ';'}</p>
     *
     * @since Driver 4.2
     */
    KSmsReference,

    /**
     * <p>This variable is set after using the {@link KSendSmsApp}.</p>
     * <p>This variable is set only by the {@link KSendSmsApp}, if you use the {@link KSendSmsCommand} it won't be set.</p>
     * <p>It will hold a text representation of the error if any ocurred or {@code None} if the message was sent succefully.</p>
     */
    KSmsErrorName,

    /**
     * <p>This variable is set after using the {@link KSendSmsApp}.</p>
     * <p>This variable is set only by the {@link KSendSmsApp}, if you use the {@link KSendSmsCommand} it won't be set.</p>
     * <p>Before the version <b>2.4.1</b> it'll hold a text representation of the error, after version <b>3.0</b> it'll contain a cod for the error or 0 if none happened.</p>
     */
    KSmsErrorCode,

    /**
     * <p>This variable is set after using the {@link KSendSmsApp}.</p>
     * <p>This variable is set only by the {@link KSendSmsApp}, if you use the {@link KSendSmsCommand} it won't be set.</p>
     * <p>It'll hold the value "<b>yes</b>" if the message was succefully sent or "<b>no</b>" otherwise.</p>
     */
    KSmsDelivered
}
