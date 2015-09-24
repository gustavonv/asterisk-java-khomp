package org.asteriskjava.khomp.manager.event;

import org.asteriskjava.manager.event.ManagerEvent;

/**
 * Reports the detection of a {@code Collect Call}.
 *
 * @author kennedy
 */
public class CollectCallEvent extends ManagerEvent {

    private String channel;

    public CollectCallEvent(Object source) {
        super(source);
    }

    /**
     * @return The channel name in the format {@code Khomp/BxCy} where {@code x} is the Device ID and {@code y} is the Channel Number.
     */
    public String getChannel() {
        return channel;
    }

    /**
     * Internal use.
     *
     * @param channel The channel name in the format {@code Khomp/BxCy} where {@code x} is the Device ID and {@code y} is the Channel Number.
     */
    public void setChannel(String channel) {
        this.channel = channel;
    }
}
