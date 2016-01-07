package com.github.kennedyoliveira.asteriskjava.khomp.manager.response;

import com.github.kennedyoliveira.asteriskjava.khomp.manager.action.KSendSMSAction;

/**
 * Custom response for the {@link KSendSMSAction}.
 *
 * @author kennedy
 */
public class KSendSMSResponse extends KAbstractSMSResponse {

    private String messageReference;

    /**
     * @return The message reference for a recently sent message. The message reference is a identifier of the sent message.
     */
    public String getMessageReference() {
        return messageReference;
    }

    /**
     * <p>Sets the current message reference.</p>
     * <p>This method shouldn't be used by a client, the api must call it to contruct the event.</p>
     *
     * @param messageReference The new message reference.
     */
    public void setMessageReference(String messageReference) {
        this.messageReference = messageReference;
    }
}
