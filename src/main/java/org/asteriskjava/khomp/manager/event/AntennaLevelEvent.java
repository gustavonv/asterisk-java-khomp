package org.asteriskjava.khomp.manager.event;

import org.asteriskjava.manager.event.ManagerEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.asteriskjava.khomp.Constants.ISSUE_LINK;

/**
 * Reports signel level alteration on GSM Antennas, works only in GSM Devices!
 *
 * @author kennedy
 */
public class AntennaLevelEvent extends ManagerEvent {
    private Logger log = LoggerFactory.getLogger(AntennaLevelEvent.class);

    private String channel;
    private String signal;

    public AntennaLevelEvent(Object source) {
        super(source);
    }

    /**
     * @return The channel name in the format {@code Khomp/BxCy} where {@code x} is the Device ID and {@code y} is the Channel Number.
     */
    public String getChannel() {
        return channel;
    }

    /**
     * Used internally.
     *
     * @param channel The channel name in the format {@code Khomp/BxCy} where {@code x} is the Device ID and {@code y} is the Channel Number.
     */
    public void setChannel(String channel) {
        this.channel = channel;
    }

    /**
     * @return The signal strength as String in percentage Ex: <b>22%</b>
     */
    public String getSignal() {
        return signal;
    }

    /**
     * Used internally.
     *
     * @param signal Signal strength
     */
    public void setSignal(String signal) {
        this.signal = signal;
    }

    /**
     * Utility method to convert the String from {@link AntennaLevelEvent#getSignal()} into float.
     *
     * @return The signal level as float if there is something in {@link AntennaLevelEvent#getSignal()} or -1 if there is nothing or if an error happens.
     */
    public float getSignalLevel() {
        if (this.signal != null && !this.signal.isEmpty()) {
            try {
                return Float.parseFloat(signal.substring(0, signal.indexOf("%")));
            } catch (NumberFormatException e) {
                log.error("Parsing the antenna signal level: {}. Please report at {}", this.signal, ISSUE_LINK);
            }
        }

        return -1;
    }
}
