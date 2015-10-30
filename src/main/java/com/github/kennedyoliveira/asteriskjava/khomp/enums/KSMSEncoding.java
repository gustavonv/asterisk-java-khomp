package com.github.kennedyoliveira.asteriskjava.khomp.enums;

/**
 * Possible representations for a SMS encoding in Khomp equipements.
 *
 * @author kennedy
 */
public enum KSMSEncoding {

    /**
     * Default enconding, GSM 7 Bits.
     */
    GSM_7_BITS("7"),
    /**
     * Binary format.
     */
    BINARY("binary"),
    /**
     * GSM 16 Bits, this encoding can only be used for WAP messages.
     */
    GSM_16_BITS("16");

    private final String encoding;

    KSMSEncoding(String encoding) {
        this.encoding = encoding;
    }

    @Override
    public String toString() {
        return encoding;
    }
}
