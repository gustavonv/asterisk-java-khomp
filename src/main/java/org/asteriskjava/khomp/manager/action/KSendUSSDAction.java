package org.asteriskjava.khomp.manager.action;

import org.asteriskjava.khomp.manager.response.KSendUSSDResponse;
import org.asteriskjava.manager.ExpectedResponse;
import org.asteriskjava.manager.action.AbstractManagerAction;

/**
 * <p>
 * Send USSD messages <a href="https://en.wikipedia.org/wiki/Unstructured_Supplementary_Service_Data">https://en.wikipedia.org/wiki/Unstructured_Supplementary_Service_Data</a>
 * through Khomp GSM Channels.
 * </p>
 *
 * @author kennedy
 */
@ExpectedResponse(KSendUSSDResponse.class)
public class KSendUSSDAction extends AbstractManagerAction {

    private String device;
    private String message;

    /**
     * Creates a new {@link KSendUSSDAction} for sending a USSD code ({@code Message}) using the device channel ({@code device}).
     *
     * @param device  The channel name in the format {@code Khomp/BxCy} where {@code x} is the Device ID and {@code y} is the Channel Number.
     * @param message The message to be sent.
     */
    public KSendUSSDAction(String device, String message) {
        this.device = device;
        this.message = message;
    }

    /**
     * @return The channel name in the format {@code Khomp/BxCy} where {@code x} is the Device ID and {@code y} is the Channel Number.
     */
    public String getDevice() {
        return device;
    }

    /**
     * @param device The channel name in the format {@code Khomp/BxCy} where {@code x} is the Device ID and {@code y} is the Channel Number.
     */
    public void setDevice(String device) {
        this.device = device;
    }

    /**
     * @return The message to be sent.
     */
    public String getMessage() {
        return message;
    }

    /**
     * @param message The message to be sent.
     */
    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String getAction() {
        return "KSendUSSD";
    }
}
