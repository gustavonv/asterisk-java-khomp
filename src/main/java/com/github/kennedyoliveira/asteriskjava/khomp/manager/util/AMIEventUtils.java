package com.github.kennedyoliveira.asteriskjava.khomp.manager.util;

import com.github.kennedyoliveira.asteriskjava.khomp.manager.event.*;
import org.asteriskjava.manager.ManagerConnection;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Date;
import java.util.Objects;

import static com.github.kennedyoliveira.asteriskjava.khomp.Constants.ISSUE_LINK;

/**
 * Utility method to help managing AMI events.
 *
 * @author kennedy
 */
public class AMIEventUtils {

    private final static Logger log = LoggerFactory.getLogger(AMIEventUtils.class);

    /**
     * Date time formatter, this one is ThreadSafe.
     */
    private final static DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yy/MM/dd kk:mm:ss");

    /**
     * @deprecated UtilityClass
     */
    private AMIEventUtils() { }

    /**
     * Register the Khomp Events in a Manager Connection, some events replaces built in events from asteriskjava lib, because this events does not work with Khomp events.
     *
     * @param managerConnection {@link ManagerConnection} to register the events.
     * @throws NullPointerException if the {@code managerConnection} is null.
     */
    public static void registerKhompEvents(ManagerConnection managerConnection) {
        Objects.requireNonNull(managerConnection, "The manager connection must not be null!");

        managerConnection.registerUserEventClass(AlarmClearEvent.class);
        managerConnection.registerUserEventClass(AlarmEvent.class);
        managerConnection.registerUserEventClass(AnswerInfoEvent.class);
        managerConnection.registerUserEventClass(AntennaLevelEvent.class);
        managerConnection.registerUserEventClass(BranchOffHookEvent.class);
        managerConnection.registerUserEventClass(BranchOnHookEvent.class);
        managerConnection.registerUserEventClass(CollectCallEvent.class);
        managerConnection.registerUserEventClass(KDisconnectionCauseEvent.class);
        managerConnection.registerUserEventClass(KSendSMSResponseEvent.class);
        managerConnection.registerUserEventClass(NewSMSBroadcastEvent.class);
        managerConnection.registerUserEventClass(NewSMSConfirmationEvent.class);
        managerConnection.registerUserEventClass(NewSMSEvent.class);
        managerConnection.registerUserEventClass(NewUSSDEvent.class);
        managerConnection.registerUserEventClass(OperatorRegistryEvent.class);
        managerConnection.registerUserEventClass(SIMSelectionFinishedEvent.class);
        managerConnection.registerUserEventClass(TransferedEvent.class);
    }

    /**
     * <p>Parse the date that comes from Carrier.</p>
     * <p>The date can be any format and pattern, at moment just 1 is recognized.</p>
     *
     * @param date Date to format
     * @return Null if the date is null or can't be parse, and the Date otherwise.
     */
    public static Date parseSMSDate(String date) {
        if (date == null)
            return null;

        // Format that i saw in Brazil using a TIM, CLARO and VIVO chip
        if (date.matches("\\d\\d/\\d\\d/\\d\\d,\\d\\d:\\d\\d:\\d\\d[\\-].*")) {
            final String[] dateSplit = date.split("[,-]");

            try {
                return Date.from(LocalDateTime.parse(dateSplit[0] + " " + dateSplit[1], dateTimeFormatter).atZone(ZoneId.systemDefault()).toInstant());
            } catch (DateTimeParseException e) {
                log.error("Error parsing date {}. Please report at {}", date, ISSUE_LINK);
                return null;
            }
        } else {
            log.error("Format no recognized for date: {}. Please report at {}", date, ISSUE_LINK);
        }

        return null;
    }
}
