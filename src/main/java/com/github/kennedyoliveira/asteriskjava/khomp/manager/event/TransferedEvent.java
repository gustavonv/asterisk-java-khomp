package com.github.kennedyoliveira.asteriskjava.khomp.manager.event;

import org.asteriskjava.manager.event.ManagerEvent;

/**
 * <p>Reports that a call leg was transfered inside PABX.</p>
 * <p>This information is obtained through the QSIG Protocol: <a href="https://en.wikipedia.org/wiki/QSIG">https://en.wikipedia.org/wiki/QSIG</a>
 * </p>
 *
 * @author kennedy
 */
public class TransferedEvent extends ManagerEvent {
  private String channel;
  private String destination;

  public TransferedEvent(Object source) {
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
   * @return Destination identification.
   */
  public String getDestination() {
    return destination;
  }

  /**
   * @param destination Destination identification.
   */
  public void setDestination(String destination) {
    this.destination = destination;
  }
}
