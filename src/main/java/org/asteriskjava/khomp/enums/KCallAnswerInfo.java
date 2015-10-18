package org.asteriskjava.khomp.enums;

import java.util.HashMap;
import java.util.Map;

/**
 * Represents the possible status for the variable {@code KCallAnswerInfo}.
 *
 * @author kennedy
 */
public enum KCallAnswerInfo {

    /**
     * <p>Detected the Postal Box from a Cel Phone.</p>
     * <p>This type of answering is detected by signals in some frequencys sent before call entering the Postal Box, and vary based on Carrier.</p>
     * <p>The algorithm captures most of the signals, but still can fail if the signal isn't clear or not in a recognized pattern.</p>
     */
    MESSAGE_BOX("MessageBox"),
    /**
     * Message from the Carrier before answering.
     */
    CARRIER_MESSAGE("CarrierMessage"),
    /**
     * Answered by some Machine.
     */
    ANSWERING_MACHINE("AnsweringMachine"),
    /**
     * <p>Answered by Human.</p>
     * <p>The diferrence from this and {@link #ANSWERING_MACHINE} depends on the configuration in {@code k3lanswerinfoconfig}, and the detection is based only in heuristic
     * and is <b>NEVER</b> 100%</p>
     */
    HUMAN_ANSWER("HumanAnswer"),
    /**
     * Can't determine the type of Answering.
     */
    UNKNOW("Unknown"),
    /**
     * Answered by a Fax Machine.
     */
    FAX("Fax");

    private final static Map<String, KCallAnswerInfo> cache;

    static {
        cache = new HashMap<>(8, 0.75f);

        for (KCallAnswerInfo info : KCallAnswerInfo.values()) {
            cache.put(info.callAnswerInfo.toLowerCase(), info);
        }
    }

    private final String callAnswerInfo;

    KCallAnswerInfo(String callAnswerInfo) {
        this.callAnswerInfo = callAnswerInfo;
    }

    /**
     * Gets the {@link KCallAnswerInfo} representing the string.
     *
     * @param info String sent from asterisk.
     * @return The {@link KCallAnswerInfo} representing the string.
     */
    public static KCallAnswerInfo getByInfo(String info) {
        return info == null ? null : cache.get(info.toLowerCase());
    }

    @Override
    public String toString() {
        return callAnswerInfo;
    }
}
