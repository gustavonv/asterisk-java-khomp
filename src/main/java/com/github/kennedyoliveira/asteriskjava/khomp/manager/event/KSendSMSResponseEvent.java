package com.github.kennedyoliveira.asteriskjava.khomp.manager.event;

import com.github.kennedyoliveira.asteriskjava.khomp.manager.action.KSendSMSAction;
import org.asteriskjava.manager.event.ManagerEvent;

/**
 * <p>This event is fired after a sms is sent in async mode through the {@link KSendSMSAction} with the {@link KSendSMSAction#setAsync(boolean)} set to {@link Boolean#TRUE}.</p>
 * <p>This event is fired for success and for fails.</p>
 *
 * @author kennedy
 */
public class KSendSMSResponseEvent extends ManagerEvent {

  private String channel;
  private String messageReference;
  private String response;

  public KSendSMSResponseEvent(Object source) {
    super(source);
  }

  /**
   * Channel used to send the message.
   *
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
   * @return Message identification id.
   */
  public String getMessageReference() {
    return messageReference;
  }

  /**
   * @param messageReference Message identification id.
   */
  public void setMessageReference(String messageReference) {
    this.messageReference = messageReference;
  }

  /**
   * @return Response (Success or Fail)
   */
  public String getResponse() {
    return response;
  }

  /**
   * @param response The response.
   */
  public void setResponse(String response) {
    this.response = response;
  }

  /**
   * Helper method.
   *
   * @return If the message was sent succefully.
   */
  public boolean isSuccefully() {
    return "success".equalsIgnoreCase(this.response);
  }
}
