package com.github.kennedyoliveira.asteriskjava.khomp.manager.event;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author kennedy
 */
public class AntennaLevelEventTest {

    @Test
    public void testGetSignalLevel() throws Exception {
        final AntennaLevelEvent antennaLevelEvent = new AntennaLevelEvent(new Object());

        assertThat(antennaLevelEvent.getSignalLevel(), is(-1.0f));

        antennaLevelEvent.setSignal("22%");

        assertThat(antennaLevelEvent.getSignalLevel(), is(22.0f));
    }
}