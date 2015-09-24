package org.asteriskjava.khomp.manager.response;

import org.asteriskjava.khomp.manager.action.KSendSMSAction;

/**
 * Custom response for the {@link KSendSMSAction}.
 *
 * @author kennedy
 */
public class KSendSMSResponse extends KAbstractSMSResponse {

    private String messageReference;

    public String getMessageReference() {
        return messageReference;
    }

    public void setMessageReference(String messageReference) {
        this.messageReference = messageReference;
    }
}
