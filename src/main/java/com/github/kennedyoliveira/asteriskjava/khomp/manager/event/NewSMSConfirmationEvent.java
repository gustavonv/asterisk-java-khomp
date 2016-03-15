package com.github.kennedyoliveira.asteriskjava.khomp.manager.event;

import com.github.kennedyoliveira.asteriskjava.khomp.manager.util.AMIEventUtils;
import org.asteriskjava.manager.event.ManagerEvent;

import java.util.Date;

/**
 * <p>Reports that exists a new SMS Confirmation message in the GSM Device.</p>
 * <p>This event works only in <b>GSM</b> devices.</p>
 * <p><b>IMPORTANT NOTE:</b> This event is just fired if there is a context for receiving SMS message in the Dial Plan, otherwise it keep the messages in the
 * SIMCard so the messages does not get lost.
 * </p>
 *
 * @author kennedy
 */
public class NewSMSConfirmationEvent extends ManagerEvent {

  private String channel;
  private String from;
  private Date date;
  private Date deliveryDate;
  private String status;
  private String messageReference;

  // Especial fields
  private String dateTextInfo;
  private String deliveryDateTextInfo;

  public NewSMSConfirmationEvent(Object source) {
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
    return date != null ? new Date(date.getTime()) : null;
  }

  /**
   * Internal use.
   *
   * @param date Date information sent by the Carrier.
   */
  public void setDate(String date) {
    this.dateTextInfo = date;
    this.date = AMIEventUtils.parseSMSDate(date);
  }

  /**
   * @return The date information as String, because the carrier can send the date and time an extra info as text.
   */
  public String getDateTextInfo() {
    return this.dateTextInfo;
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
   * @return Date and time that the message was delivered by the Carrier.
   */
  public Date getDeliveryDate() {
    return deliveryDate != null ? new Date(deliveryDate.getTime()) : null;
  }

  /**
   * Internal use.
   *
   * @param deliveryDate Date and time that the message was delivered by the Carrier.
   */
  public void setDeliveryDate(String deliveryDate) {
    this.deliveryDateTextInfo = deliveryDate;
    this.deliveryDate = AMIEventUtils.parseSMSDate(deliveryDate);
  }

  /**
   * @return The delivery date as String, because the carrier can send the date and time an extra info as text.
   */
  public String getDeliveryDateTextInfo() {
    return deliveryDateTextInfo;
  }

  /**
   * @return Reference identification from the message being confirmed.
   */
  public String getMessageReference() {
    return messageReference;
  }

  /**
   * Internal use.
   *
   * @param messageReference Reference identification from the message being confirmed.
   */
  public void setMessageReference(String messageReference) {
    this.messageReference = messageReference;
  }

  /**
   * @return Status of the delivery.
   */
  public String getStatus() {
    return status;
  }

  /**
   * Internal use.
   *
   * @param status Status of the delivery.
   */
  public void setStatus(String status) {
    this.status = status;
  }
}
