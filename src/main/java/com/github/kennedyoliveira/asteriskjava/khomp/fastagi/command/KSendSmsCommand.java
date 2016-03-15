package com.github.kennedyoliveira.asteriskjava.khomp.fastagi.command;

import org.asteriskjava.fastagi.command.AbstractAgiCommand;

/**
 * AGI Command to send SMS through Fast AGI Protocol.
 *
 * @author kennedy
 */
// TODO Documentar os retornos
public class KSendSmsCommand extends AbstractAgiCommand {

  private String channel;
  private String destination;
  private String message;

  /**
   * Sends a SMS through agi channel.
   *
   * @param channel     The channel name in the format {@code Khomp/BxCy} where {@code x} is the Device ID and {@code y} is the Channel Number.
   * @param destination Number that the message will be sent to.
   * @param message     The message itself.
   */
  public KSendSmsCommand(String channel, String destination, String message) {
    this.channel = channel;
    this.destination = destination;
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

  @Override
  public String buildCommand() {
    return String.format("KSENDSMS %s %s %s", escapeAndQuote(channel), escapeAndQuote(destination), escapeAndQuote(message));
  }
}
