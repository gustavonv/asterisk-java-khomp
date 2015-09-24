package org.asteriskjava.khomp.manager.action;

import org.asteriskjava.manager.action.AbstractManagerAction;

/**
 * <p>Sends message through a ISND channel in the {@code Q.931} standard <a href="https://en.wikipedia.org/wiki/Q.931">https://en.wikipedia.org/wiki/Q.931</a>.</p>
 *
 * @author kennedy
 */
public class KSendUUIAction extends AbstractManagerAction {

    private String device;
    private String protocol;
    private Integer length;
    private String data;

    /**
     * @return The channel name in the format {@code Khomp/BxCy} where {@code x} is the Device ID and {@code y} is the Channel Number.
     */
    public String getDevice() {
        return device;
    }

    /**
     * @param device The channel name in the format {@code Khomp/BxCy} where {@code x} is the Device ID and {@code y} is the Channel Number.
     */
    public void setDevice(String device) {
        this.device = device;
    }

    /**
     * @return Protocol number acording to the "{@code Message Type}" from {@code Q.931} standard.
     */
    public String getProtocol() {
        return protocol;
    }

    /**
     * @param protocol Protocol number acording to the "{@code Message Type}" from {@code Q.931} standard.
     */
    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    /**
     * @return Message size in bytes, the maximum value is 32 bytes.
     */
    public Integer getLength() {
        return length;
    }

    /**
     * @param length Message size in bytes, the maximum value is 32 bytes.
     */
    public void setLength(Integer length) {
        this.length = length;
    }

    /**
     * @return The message to be transmited.
     */
    public String getData() {
        return data;
    }

    /**
     * @param data The message to be transmited.
     */
    public void setData(String data) {
        this.data = data;
    }

    @Override
    public String getAction() {
        return "KSendUUI";
    }
}
