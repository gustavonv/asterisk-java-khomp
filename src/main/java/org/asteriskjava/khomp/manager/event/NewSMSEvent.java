package org.asteriskjava.khomp.manager.event;

import org.asteriskjava.khomp.AMIEventUtils;
import org.asteriskjava.manager.event.ManagerEvent;

import java.util.Date;

/**
 * <p>
 * Reports that exists a new SMS Message in the Device.
 * </p>
 * <p>
 * Works only in <b>GSM</b> devices.
 * </p>
 * <p>
 * <b>IMPORTANT NOTE:</b> This event is just fired if there is a context for receiving SMS message in the Dial Plan, otherwise it keep the messages in the
 * SIMCard so the messages does not get lost.
 * </p>
 * <p>
 * A message that is longer than 160 characters have special parameters set,
 * see {@link #isSmsConcat()} {@link #getSmsConcatPartId()} {@link #getSmsConcatParts()} {@link #getSmsConcatRef()}.
 * </p>
 *
 * @author kennedy
 */
public class NewSMSEvent extends ManagerEvent {

    private String channel;
    private String from;
    private Date date;
    private Integer size;
    private String mode;
    private String message;
    private Boolean smsAlert;

    //
    // Aditional fields, just present if the message is 160 characters longer.
    //
    private Boolean smsConcat;
    private String smsConcatRef;
    private String smsConcatPartId;
    private String smsConcatParts;

    // Especial fields
    private String dateTextInfo;

    public NewSMSEvent(Object source) {
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
     * This information is sent by the Carrier, and can have date and time and even some other text information, this information will be available through the {@link #getDateTextInfo()}
     * method.
     *
     * @return The date and time that the message was sent.
     * @see #getDateTextInfo()
     */
    public Date getDate() {
        return date;
    }

    /**
     * @return The date information as String, because the carrier can send the date and time an extra info as text.
     */
    public String getDateTextInfo() {
        return this.dateTextInfo;
    }

    /**
     * Internal use.
     *
     * @param date Date information sent by the Carrier.
     */
    public void setDate(String date) {
        this.date = AMIEventUtils.parseSMSDate(date);
        this.dateTextInfo = date;
    }

    /**
     * @return The number that sent the message.
     */
    public String getFrom() {
        return from;
    }

    /**
     * Internal use.
     *
     * @param from The number that sent the message.
     */
    public void setFrom(String from) {
        this.from = from;
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
     * Indicates that the message is a {@code ALERT MESSAGE} also know as {@code Flash SMS} or not.
     *
     * @return {@code True} or {@code False}
     */
    public Boolean isSmsAlert() {
        return smsAlert;
    }

    /**
     * Internal use.
     *
     * @param smsAlert The flag.
     */
    public void setSmsAlert(Boolean smsAlert) {
        this.smsAlert = smsAlert;
    }

    /**
     * @return Flag indicating if is a SMS 160 characters long or not.
     */
    public Boolean isSmsConcat() {
        return smsConcat;
    }

    //
    // Special field for handling messages longer than 160 characters.
    //

    /**
     * Internal use only.
     *
     * @param smsConcat if is a SMS 160 characters long or not.
     */
    public void setSmsConcat(Boolean smsConcat) {
        this.smsConcat = smsConcat;
    }

    /**
     * <p>This field is just available if {@link #isSmsConcat()} is {@link Boolean#TRUE}.</p>
     * <p>The part of the message that this message is.</p>
     *
     * @return The reference id that this message corresponds..
     */
    public String getSmsConcatPartId() {
        return smsConcatPartId;
    }

    /**
     * Internal use.
     *
     * @param smsConcatPartId The reference id that this message corresponds..
     */
    public void setSmsConcatPartId(String smsConcatPartId) {
        this.smsConcatPartId = smsConcatPartId;
    }

    /**
     * <p>This field is just available if {@link #isSmsConcat()} is {@link Boolean#TRUE}.</p>
     * <p>A message with more than 160 characters has more than 1 parts, and this field indicate how many there are.</p>
     *
     * @return Total parts of this message.
     */
    public String getSmsConcatParts() {
        return smsConcatParts;
    }

    /**
     * Internal use.
     *
     * @param smsConcatParts The reference id that this message corresponds.
     */
    public void setSmsConcatParts(String smsConcatParts) {
        this.smsConcatParts = smsConcatParts;
    }

    /**
     * This field is just available if {@link #isSmsConcat()} is {@link Boolean#TRUE}.
     *
     * @return Reference number for this message.
     */
    public String getSmsConcatRef() {
        return smsConcatRef;
    }

    /**
     * Iternal use.
     *
     * @param smsConcatRef Reference number for this message
     */
    public void setSmsConcatRef(String smsConcatRef) {
        this.smsConcatRef = smsConcatRef;
    }
}
