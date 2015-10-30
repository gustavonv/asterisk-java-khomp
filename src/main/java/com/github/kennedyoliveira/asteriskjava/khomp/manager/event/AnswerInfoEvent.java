package com.github.kennedyoliveira.asteriskjava.khomp.manager.event;

import com.github.kennedyoliveira.asteriskjava.khomp.enums.KCallAnswerInfo;
import org.asteriskjava.manager.event.ManagerEvent;

/**
 * Reports detection of channel asnwer.
 *
 * @author kennedy
 */
public class AnswerInfoEvent extends ManagerEvent {

    private String channel;
    private KCallAnswerInfo info;

    public AnswerInfoEvent(Object source) {
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

    /**
     * @return The info {@link KCallAnswerInfo} about the type of answering.
     */
    public KCallAnswerInfo getInfo() {
        return info;
    }

    /**
     * Internal use.
     *
     * @param info The info {@link KCallAnswerInfo} about the type of answering.
     */
    public void setInfo(String info) {
        this.info = KCallAnswerInfo.getByInfo(info);
    }
}
