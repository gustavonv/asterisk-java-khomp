package org.asteriskjava.khomp.manager.action;

import org.asteriskjava.khomp.enums.KGSMPresentation;
import org.asteriskjava.manager.action.AbstractManagerAction;

/**
 * <p>When allowed by the Carrier, this action sets the channels to show or not the number.</p>
 * <p>It's possible to retrieve the current Presentation status of a channel if {@link #setPresentation(KGSMPresentation)} to null,
 * see {@link KGSMPresentationAction#KGSMPresentationAction(String)}</p>
 *
 * @author kennedy
 * @since Driver 4.0
 */
public class KGSMPresentationAction extends AbstractManagerAction {

    private String channel;
    private KGSMPresentation presentation;

    @Override
    public String getAction() {
        return "KGSMPresentation";
    }

    /**
     * Creates a new {@link KGSMPresentationAction} that can retrieve the current presentation status of the channel.
     *
     * @param channel Channel in the format B<b>X</b>C<b>Y</b> where {@code X} is the device ID and {@code Y} is the Channel Number.
     */
    public KGSMPresentationAction(String channel) {
        this.channel = channel;
    }

    /**
     * Creates a new {@link KGSMPresentationAction} that can retrieve the current presentation status of the channel if the param {@code presentation} is null or sets it
     * to informed one.
     *
     * @param channel      Channel in the format B<b>X</b>C<b>Y</b> where {@code X} is the device ID and {@code Y} is the Channel Number.
     * @param presentation {@link KGSMPresentation} or null to get the current presentation of the channel.
     */
    public KGSMPresentationAction(String channel, KGSMPresentation presentation) {
        this.channel = channel;
        this.presentation = presentation;
    }

    /**
     * @return Channel in the format B<b>X</b>C<b>Y</b> where {@code X} is the device ID and {@code Y} is the Channel Number.
     */
    public String getChannel() {
        return channel;
    }

    /**
     * @param channel Channel in the format B<b>X</b>C<b>Y</b> where {@code X} is the device ID and {@code Y} is the Channel Number
     */
    public void setChannel(String channel) {
        this.channel = channel;
    }

    /**
     * @return The presentation method.
     */
    public KGSMPresentation getPresentation() {
        return presentation;
    }

    /**
     * @param presentation The presentation method.
     */
    public void setPresentation(KGSMPresentation presentation) {
        this.presentation = presentation;
    }
}
