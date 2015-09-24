package org.asteriskjava.khomp.manager.event;

import org.asteriskjava.manager.event.ManagerEvent;

/**
 * <p>Reports that exists a new SMS Broadcast Message in a GSM Device.</p>
 * <p>This event only works in <b>GSM</b> Devices.</p>
 * <p><b>IMPORTANT NOTE:</b> This event is just fired if there is a context for receiving SMS message in the Dial Plan, otherwise it keep the messages in the
 * SIMCard so the messages does not get lost.
 * </p>
 *
 * @author kennedy
 */
public class NewSMSBroadcastEvent extends ManagerEvent {

    private String channel;
    private String serial;
    private String id;
    private Integer page;
    private Integer pageCount;
    private Integer size;
    private String mode;
    private String message;

    public NewSMSBroadcastEvent(Object source) {
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
     * @return The size in bytes of this message.
     */
    public Integer getSize() {
        return size;
    }

    /**
     * Internal use.
     *
     * @param size The size in bytes of this message.
     */
    public void setSize(Integer size) {
        this.size = size;
    }

    /**
     * @return The message itself.
     */
    public String getMessage() {
        return message;
    }

    /**
     * Interal use.
     *
     * @param message The message itself.
     */
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * @return Codification used by the message.
     */
    public String getMode() {
        return mode;
    }

    /**
     * Internal use.
     *
     * @param mode The Codification used by the message.
     */
    public void setMode(String mode) {
        this.mode = mode;
    }

    /**
     * @return Message ID.
     */
    public String getId() {
        return id;
    }

    /**
     * @param id Message ID.
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return Message page number.
     */
    public Integer getPage() {
        return page;
    }

    /**
     * @param page Message page number.
     */
    public void setPage(Integer page) {
        this.page = page;
    }

    /**
     * @return Total pages of message.
     */
    public Integer getPageCount() {
        return pageCount;
    }

    /**
     * @param pageCount Total pages of message.
     */
    public void setPageCount(Integer pageCount) {
        this.pageCount = pageCount;
    }

    /**
     * @return Message's serial.
     */
    public String getSerial() {
        return serial;
    }

    /**
     * @param serial Message's serial.
     */
    public void setSerial(String serial) {
        this.serial = serial;
    }
}
