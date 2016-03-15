package com.github.kennedyoliveira.asteriskjava.khomp.manager.event;

import org.asteriskjava.manager.event.ManagerEvent;

/**
 * <p>Reports a new USSD message in the GSM Device.</p>
 * <p>This event only works in <b>GSM</b> Devices.</p>
 *
 * @author kennedy
 */
public class NewUSSDEvent extends ManagerEvent {

  private String channel;
  private String message;

  public NewUSSDEvent(Object source) {
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
}
