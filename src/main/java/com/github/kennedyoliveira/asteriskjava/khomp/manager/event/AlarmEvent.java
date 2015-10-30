package com.github.kennedyoliveira.asteriskjava.khomp.manager.event;

import org.asteriskjava.manager.event.ManagerEvent;

/**
 * Reports alarm notification on a channel.
 *
 * @author kennedy
 */
public class AlarmEvent extends ManagerEvent {

    private String channel;
    private String alarm;

    public AlarmEvent(Object source) {
        super(source);
    }

    /**
     * @return Name of the alarm
     */
    public String getAlarm() {
        return alarm;
    }

    /**
     * Internal use.
     *
     * @param alarm Name of the alarm.
     */
    public void setAlarm(String alarm) {
        this.alarm = alarm;
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
}
