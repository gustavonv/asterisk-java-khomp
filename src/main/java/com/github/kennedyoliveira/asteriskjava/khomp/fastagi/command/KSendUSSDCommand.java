package com.github.kennedyoliveira.asteriskjava.khomp.fastagi.command;

import org.asteriskjava.fastagi.command.AbstractAgiCommand;

/**
 * Sends USSD messages through Fast AGI Protocol.
 *
 * @author kennedy
 */
// TODO Documentar o retorno
public class KSendUSSDCommand extends AbstractAgiCommand {

  private String channel;
  private String message;

  /**
   * Creates a {@link KSendUSSDCommand} to send a USSD code in Fast AGI protocol.
   *
   * @param channel The channel name in the format {@code Khomp/BxCy} where {@code x} is the Device ID and {@code y} is the Channel Number.
   * @param message The message itself.
   */
  public KSendUSSDCommand(String channel, String message) {
    this.channel = channel;
    this.message = message;
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

  @Override
  public String buildCommand() {
    return String.format("KSENDUSSD %s %s", escapeAndQuote(channel), escapeAndQuote(message));
  }
}
