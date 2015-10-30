package com.github.kennedyoliveira.asteriskjava.khomp.manager.action;

import org.asteriskjava.manager.action.AbstractManagerAction;

/**
 * <p>Force the hangup of a call direct in the Device.</p>
 *
 * @author kennedy
 */
public class KHangupAction extends AbstractManagerAction {

    // TODO Verificar como funciona a questão do DEVICE e INDEX
    private String device;
    private String index;

    public KHangupAction(String device, String index) {
        this.device = device;
        this.index = index;
    }

    public String getDevice() {
        return device;
    }

    public void setDevice(String device) {
        this.device = device;
    }

    public String getIndex() {
        return index;
    }

    public void setIndex(String index) {
        this.index = index;
    }

    @Override
    public String getAction() {
        return "KHangup";
    }
}
