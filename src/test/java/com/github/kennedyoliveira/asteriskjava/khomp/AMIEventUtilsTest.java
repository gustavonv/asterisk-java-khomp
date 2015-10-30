package com.github.kennedyoliveira.asteriskjava.khomp;

import com.github.kennedyoliveira.asteriskjava.khomp.manager.util.AMIEventUtils;
import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.Date;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author kennedy
 */
public class AMIEventUtilsTest {

    @Test
    public void testParseSMSDateBrazillianCarrierTIM_Format() throws Exception {
        final String carrierDate = "15/09/22,17:19:02-12";

        final Date dateParsed = AMIEventUtils.parseSMSDate(carrierDate);

        final Date expectedResult = new SimpleDateFormat("yy/MM/dd kk:mm:ss").parse("15/09/22 17:19:02");

        assertThat(expectedResult, is(dateParsed));
    }
}