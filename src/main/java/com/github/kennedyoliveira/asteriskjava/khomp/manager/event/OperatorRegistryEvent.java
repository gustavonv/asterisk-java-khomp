package com.github.kennedyoliveira.asteriskjava.khomp.manager.event;

import org.asteriskjava.manager.event.ManagerEvent;

/**
 * <p>Reports the succefull registry of a carrier SIMCard.</p>
 * <p>Present only in GSM Devices.</p>
 *
 * @author kennedy
 */
public class OperatorRegistryEvent extends ManagerEvent {

  private String channel;
  private String operator;

  public OperatorRegistryEvent(Object source) {
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
   * @return The name of the carrier.
   */
  public String getOperator() {
    return operator;
  }

  /**
   * Internal use.
   *
   * @param operator The name of the carrier.
   */
  public void setOperator(String operator) {
    this.operator = operator;
  }
}
