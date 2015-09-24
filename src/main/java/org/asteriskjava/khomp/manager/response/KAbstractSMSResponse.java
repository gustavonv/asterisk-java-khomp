package org.asteriskjava.khomp.manager.response;

import org.asteriskjava.manager.response.ManagerResponse;

/**
 * Base for SMS responses.
 *
 * @author kennedy
 */
public abstract class KAbstractSMSResponse extends ManagerResponse {

    private String channel;

    /**
     * The device used to send the message.
     *
     * @return The channel name in the format {@code Khomp/BxCy} where {@code x} is the Device ID and {@code y} is the Channel Number.
     */
    public String getChannel() {
        return channel;
    }

    /**
     * The device used to send the message.
     *
     * @param channel The channel name in the format {@code Khomp/BxCy} where {@code x} is the Device ID and {@code y} is the Channel Number.
     */
    public void setChannel(String channel) {
        this.channel = channel;
    }
}
