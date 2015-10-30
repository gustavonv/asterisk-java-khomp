package com.github.kennedyoliveira.asteriskjava.khomp.manager.action;

import com.github.kennedyoliveira.asteriskjava.khomp.manager.event.SIMSelectionFinishedEvent;
import org.asteriskjava.manager.action.AbstractManagerAction;

/**
 * <p>
 * When there are more than 1 SIMCard per channel in the GSM device, this action let you select which one you want to use.
 * </p>
 * <p>
 * After this action is sent, the asterisk will generate an event {@link SIMSelectionFinishedEvent} with operation result, success or fail.
 * Check {@link SIMSelectionFinishedEvent#isSuccessfully()} and {@link SIMSelectionFinishedEvent#getRegistry()}
 * </p>
 * <p>
 * <b>NOTE:</b> If the card is already selected or if the SIMCard or device not exists, the api treat it as a error.
 * </p>
 *
 * @author kennedy
 * @since Driver 4.0
 */
public class KSelectSIMCardAction extends AbstractManagerAction {

    private String channel;
    private String SIMCard;

    /**
     * Constructs a new {@link KSelectSIMCardAction} for changing the current SIMCard of a GSM device.
     *
     * @param channel Channel in the format B<b>X</b>C<b>Y</b> where {@code X} is the device ID and {@code Y} is the Channel Number.
     * @param SIMCard The number of the SIMCard to select.
     * @see KSelectSIMCardAction#setChannel(String)
     * @see KSelectSIMCardAction#setSIMCard(String)
     */
    public KSelectSIMCardAction(String channel, String SIMCard) {
        this.channel = channel;
        this.SIMCard = SIMCard;
    }

    /**
     * @return The channel that will have the SIMCard selected.
     */
    public String getChannel() {
        return channel;
    }

    /**
     * <p>
     * The channel that will have the SIMCard selected. <br><br>
     * <b>This parameter is mandaroty.</b>
     * </p>
     *
     * @param channel Channel in the format B<b>X</b>C<b>Y</b> where {@code X} is the device ID and {@code Y} is the Channel Number
     */
    public void setChannel(String channel) {
        this.channel = channel;
    }

    /**
     * @return The SIMCard that will be selected.
     */
    public String getSIMCard() {
        return SIMCard;
    }

    /**
     * <p>
     * Number for identifying the SIMCard on the channel, the number can be: {@code 0} or {@code 1}. For devices that has 2 chips per channel.<br><br>
     * <b>This parameter is Mandatory.</b>
     * </p>
     *
     * @param SIMCard The number of the SIMCard to select.
     */
    public void setSIMCard(String SIMCard) {
        this.SIMCard = SIMCard;
    }

    @Override
    public String getAction() {
        return "KSelectSIMCard";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        KSelectSIMCardAction that = (KSelectSIMCardAction) o;

        if (channel != null ? !channel.equals(that.channel) : that.channel != null) return false;
        return !(SIMCard != null ? !SIMCard.equals(that.SIMCard) : that.SIMCard != null);
    }

    @Override
    public int hashCode() {
        int result = channel != null ? channel.hashCode() : 0;
        result = 31 * result + (SIMCard != null ? SIMCard.hashCode() : 0);
        return result;
    }
}
