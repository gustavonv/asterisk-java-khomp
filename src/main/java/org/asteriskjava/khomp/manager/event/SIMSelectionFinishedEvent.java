package org.asteriskjava.khomp.manager.event;

import org.asteriskjava.manager.event.ManagerEvent;

/**
 * <p>Reports the successful or fail of a {@link org.asteriskjava.khomp.manager.action.KSelectSIMCardAction} or calling the same application by the dialplan extension.</p>
 *
 * @author kennedy
 * @since Driver 4.0
 */
public class SIMSelectionFinishedEvent extends ManagerEvent {

    private String channel;
    private String registry;

    public SIMSelectionFinishedEvent(Object source) {
        super(source);
    }

    /**
     * @return The channel name in the format {@code Khomp/BxCy} where {@code x} is the Device ID and {@code y} is the Channel Number.
     */
    public String getChannel() {
        return channel;
    }

    /**
     * @param channel The channel name in the format {@code Khomp/BxCy} where {@code x} is the Device ID and {@code y} is the Channel Number.
     */
    public void setChannel(String channel) {
        this.channel = channel;
    }

    /**
     * @return "success" if was succefully executed and "fail" otherwise.
     */
    public String getRegistry() {
        return registry;
    }

    /**
     * @param registry The operation status.
     */
    public void setRegistry(String registry) {
        this.registry = registry;
    }

    /**
     * Helper method that checkes {@link #getRegistry()} for success.
     *
     * @return True if succefully, false otherwise.
     */
    public boolean isSuccessfully() {
        return "success".equalsIgnoreCase(registry);
    }
}
