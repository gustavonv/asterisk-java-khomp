package org.asteriskjava.khomp.manager.event;

import org.asteriskjava.manager.event.ManagerEvent;

/**
 * Reports the Disconnection Cause for a Khomp Channel.
 *
 * @author kennedy
 */
public class KDisconnectionCauseEvent extends ManagerEvent {

    private String channel;
    private String origAddr;
    private String destAddr;
    private String cause;
    private String causeTxt;

    public KDisconnectionCauseEvent(Object source) {
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

    /**
     * @return The numeric cod for disconnection cause.
     */
    public String getCause() {
        return cause;
    }

    /**
     * @param cause The numeric cod for disconnection cause.
     */
    public void setCause(String cause) {
        this.cause = cause;
    }

    /**
     * @return Connection cause text.
     */
    public String getCauseTxt() {
        return causeTxt;
    }

    /**
     * @param causeTxt Connection cause text.
     */
    public void setCauseTxt(String causeTxt) {
        this.causeTxt = causeTxt;
    }

    /**
     * @return Destination channel number.
     */
    public String getDestAddr() {
        return destAddr;
    }

    /**
     * @param destAddr Destination channel number.
     */
    public void setDestAddr(String destAddr) {
        this.destAddr = destAddr;
    }

    /**
     * @return Channel source number.
     */
    public String getOrigAddr() {
        return origAddr;
    }

    /**
     * @param origAddr Channel source number.
     */
    public void setOrigAddr(String origAddr) {
        this.origAddr = origAddr;
    }
}
