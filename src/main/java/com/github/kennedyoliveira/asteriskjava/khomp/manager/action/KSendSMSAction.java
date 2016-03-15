package com.github.kennedyoliveira.asteriskjava.khomp.manager.action;

import com.github.kennedyoliveira.asteriskjava.khomp.enums.KSMSEncoding;
import com.github.kennedyoliveira.asteriskjava.khomp.manager.response.KSendSMSResponse;
import org.asteriskjava.manager.ExpectedResponse;
import org.asteriskjava.manager.action.AbstractManagerAction;

/**
 * <p>
 * Sends SMS Message through Khomp GSM Devices.
 * </p>
 * Mandatory fields:
 * <ul>
 * <li>device</li>
 * <li>destination</li>
 * <li>message</li>
 * </ul>
 * All other fields are optional.
 * <p>
 * To send messages with line break you need to set {@link #setLineFeed(boolean)} to {@link Boolean#TRUE} and in the text, put the line break as {@code \\n} instead of {@code \n}.
 * </p>
 *
 * @author kennedy
 */
@ExpectedResponse(KSendSMSResponse.class)
public class KSendSMSAction extends AbstractManagerAction {

  private String device;
  private String destination;
  private String message;

  // Optional Fields
  private boolean alert;
  private boolean confirmation;
  private boolean lineFeed;
  private KSMSEncoding encoding;
  private String wap;
  private int port;
  private boolean async;

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
   * @return Number that the message will be sent to.
   */
  public String getDestination() {
    return destination;
  }

  /**
   * @param destination Number that the message will be sent to.
   */
  public void setDestination(String destination) {
    this.destination = destination;
  }

  /**
   * @return The message itself.
   */
  public String getMessage() {
    return message;
  }

  /**
   * @param message The message itself.
   */
  public void setMessage(String message) {
    this.message = message;
  }

  /**
   * @return Flag for requesting confirmation.
   */
  public boolean isConfirmation() {
    return confirmation;
  }

  /**
   * @param confirmation Flag for requesting confirmation.
   */
  public void setConfirmation(boolean confirmation) {
    this.confirmation = confirmation;
  }

  /**
   * @return Flag for sending the message asyncronous.
   */
  public boolean isAsync() {
    return async;
  }

  /**
   * @param async Flag for sending the message asyncronous.
   */
  public void setAsync(boolean async) {
    this.async = async;
  }

  /**
   * @return Flag for sending the message as Alert (Flash SMS or SMS Class 0)
   */
  public boolean isAlert() {
    return alert;
  }

  /**
   * @param alert Flag for sending the message as Alert (Flash SMS or SMS Class 0)
   */
  public void setAlert(boolean alert) {
    this.alert = alert;
  }

  // TODO Documentar esses trens de WAP
  public String getWap() {
    return wap;
  }

  public void setWap(String wap) {
    this.wap = wap;
  }

  public int getPort() {
    return port;
  }

  public void setPort(int port) {
    this.port = port;
  }

  /**
   * @return If the line break function is enable.
   */
  public boolean isLineFeed() {
    return lineFeed;
  }

  /**
   * If this is set to TRUE, means that all "\\n" will be converted in a line break in the message.
   *
   * @param lineFeed Flag for enabling or disabling the line break.
   */
  public void setLineFeed(boolean lineFeed) {
    this.lineFeed = lineFeed;
  }

  /**
   * @return Message encoding.
   */
  public KSMSEncoding getEncoding() {
    return encoding;
  }

  /**
   * @param encoding Message encoding.
   */
  public void setEncoding(KSMSEncoding encoding) {
    this.encoding = encoding;
  }

  @Override
  public String getAction() {
    return "KSendSMS";
  }
}
