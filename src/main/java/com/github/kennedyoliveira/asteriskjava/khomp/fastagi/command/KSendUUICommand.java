package com.github.kennedyoliveira.asteriskjava.khomp.fastagi.command;

import org.asteriskjava.fastagi.command.AbstractAgiCommand;

/**
 * Sends a UUI message through Fast AGI Protocol.
 *
 * @author kennedy
 */
// TODO Documentar o retorno
public class KSendUUICommand extends AbstractAgiCommand {

  private String channel;
  private String protocolNumber;
  private String message;

  /**
   * Creates a new {@link KSendUUICommand} to send a UUI message.
   *
   * @param channel        The channel name in the format {@code Khomp/BxCy} where {@code x} is the Device ID and {@code y} is the Channel Number.
   * @param protocolNumber Protocol number acording to the "{@code Message Type}" from {@code Q.931} standard.
   * @param message        The message itself.
   */
  public KSendUUICommand(String channel, String protocolNumber, String message) {
    this.channel = channel;
    this.message = message;
    this.protocolNumber = protocolNumber;
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

  /**
   * @return Protocol number acording to the "{@code Message Type}" from {@code Q.931} standard.
   */
  public String getProtocolNumber() {
    return protocolNumber;
  }

  /**
   * @param protocolNumber Protocol number acording to the "{@code Message Type}" from {@code Q.931} standard.
   */
  public void setProtocolNumber(String protocolNumber) {
    this.protocolNumber = protocolNumber;
  }

  @Override
  public String buildCommand() {
    return String.format("KUUI %s %s %s", escapeAndQuote(channel), escapeAndQuote(protocolNumber), escapeAndQuote(message));
  }
}
