package com.github.kennedyoliveira.asteriskjava.khomp.manager.action;

import org.asteriskjava.manager.action.AbstractManagerAction;

/**
 * Sends DTMF digits through FXS channels in "Off Hook".
 *
 * @author kennedy
 * @since Driver 4.2.4
 */
public class KDialOffHookAction extends AbstractManagerAction {

    private String channel;
    private String number;

    /**
     * Creates a new {@link KDialOffHookAction}.
     *
     * @param channel Channel in the format B<b>X</b>C<b>Y</b> where {@code X} is the device ID and {@code Y} is the Channel Number.
     * @param number  Numbers to be sent to channel.
     */
    public KDialOffHookAction(String channel, String number) {
        this.channel = channel;
        this.number = number;
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
     * @return Numbers to be sent to channel.
     */
    public String getNumber() {
        return number;
    }

    /**
     * @param number Numbers to be sent to channel.
     */
    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public String getAction() {
        return "KDialOffHook";
    }
}
