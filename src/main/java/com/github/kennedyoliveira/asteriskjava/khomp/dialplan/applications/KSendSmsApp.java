package com.github.kennedyoliveira.asteriskjava.khomp.dialplan.applications;

import com.github.kennedyoliveira.asteriskjava.khomp.dialplan.KVariables;
import com.github.kennedyoliveira.asteriskjava.khomp.enums.KSMSEncoding;
import com.github.kennedyoliveira.asteriskjava.khomp.fastagi.command.KSendSmsCommand;
import com.github.kennedyoliveira.asteriskjava.khomp.manager.action.KSendSMSAction;
import org.asteriskjava.fastagi.command.AbstractAgiCommand;

/**
 * <p>Implementation of the <b>KSendSMS</b> dialplan application.</p>
 * <p>The use of this application sets some variables in the channel after the execution,
 * see {@link KVariables#KSmsReference}, {@link KVariables#KSmsErrorCode}, {@link KVariables#KSmsErrorName}, {@link KVariables#KSmsDelivered}.</p>
 * <p>You doens't need to specify the below options as its said, its just for documentation purpose. You'll use methods for setting this options.</p>
 * <p>Syntax:</p>
 * <p>KSendSMS(device|destination|[options]|[message])</p>
 * <p><b>Device:</b> Channel in the format B<b>X</b>C<b>Y</b> where {@code X} is the device ID and {@code Y} is the Channel Number.</p>
 * <p><b>Destinatino:</b> Number that the message will be sent to.</p>
 * <p><b>Message:</b> The message to be sent.</p>
 * <p>The options can be one of the following:</p>
 * <ul>
 * <li><b>a</b>: Sends the messages as <b>Alert</b>, also know as Flash SMS or Class 0 SMS.</li>
 * <li><b>c</b>: Ask for confirmation when the message is delivered.</li>
 * <li><b>e</b>: Encoding fo the message. see {@link KSMSEncoding}.</li>
 * <li><b>w</b>: URL for send WAP messages.</li>
 * <li><b>p</b>: Port for WAP messages.</li>
 * </ul>
 *
 * @author kennedy
 * @see KSendSMSAction
 * @see KSendSmsCommand
 */
// TODO Document better this WAP messages
public class KSendSmsApp extends AbstractAgiCommand {

    private String device;
    private String destination;
    private String message;

    // Optional Fields
    private boolean alert;
    private boolean confirmation;
    private boolean lineFeed;
    private KSMSEncoding encoding;
    private String wap;
    private int port;

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

    /**
     * @return Flag for requesting confirmation.
     */
    public boolean isConfirmation() {
        return confirmation;
    }

    /**
     * @param confirmation Flag for requesting confirmation.
     */
    public void setConfirmation(boolean confirmation) {
        this.confirmation = confirmation;
    }

    /**
     * @return Flag for sending the message as Alert (Flash SMS or SMS Class 0)
     */
    public boolean isAlert() {
        return alert;
    }

    /**
     * @param alert Flag for sending the message as Alert (Flash SMS or SMS Class 0)
     */
    public void setAlert(boolean alert) {
        this.alert = alert;
    }

    // TODO Documentar esses trens de WAP
    public String getWap() {
        return wap;
    }

    public void setWap(String wap) {
        this.wap = wap;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    /**
     * @return If the line break function is enable.
     */
    public boolean isLineFeed() {
        return lineFeed;
    }

    /**
     * If this is set to TRUE, means that all "\\n" will be converted in a line break in the message.
     *
     * @param lineFeed Flag for enabling or disabling the line break.
     */
    public void setLineFeed(boolean lineFeed) {
        this.lineFeed = lineFeed;
    }

    /**
     * @return Message encoding.
     */
    public KSMSEncoding getEncoding() {
        return encoding;
    }

    /**
     * @param encoding Message encoding.
     */
    public void setEncoding(KSMSEncoding encoding) {
        this.encoding = encoding;
    }

    /**
     * @return The options for the command.
     */
    protected String getOptions() {
        StringBuilder sb = new StringBuilder("/");

        if (this.alert)
            sb.append("a");

        if (this.confirmation)
            sb.append("c");

        if (this.encoding != null)
            sb.append("e(").append(this.encoding.toString()).append(")");

        if (this.wap != null && !this.wap.isEmpty())
            sb.append("w(").append(this.wap).append(")");

        if (this.port != 0)
            sb.append("p(").append(this.port).append(")");

        return sb.length() > 1 ? sb.toString() : "";
    }

    @Override
    public String buildCommand() {
        return String.format("EXEC KSendSMS %s", escapeAndQuote(new String[]{this.device, this.destination, getOptions(), this.message}));
    }
}
