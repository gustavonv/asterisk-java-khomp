package com.github.kennedyoliveira.asteriskjava.khomp.manager.event;

import org.asteriskjava.manager.event.ManagerEvent;

/**
 * <p>Reports that some branch are <b>OFF</b> hook.</p>
 * <p>Works <b>only</b> in <b>KFXS</b> devices.</p>
 *
 * @author kennedy
 */
public class BranchOffHookEvent extends ManagerEvent {

  private String channel;

  public BranchOffHookEvent(Object source) {
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
}
