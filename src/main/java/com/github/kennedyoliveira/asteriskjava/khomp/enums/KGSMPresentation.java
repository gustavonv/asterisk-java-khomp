package com.github.kennedyoliveira.asteriskjava.khomp.enums;

import com.github.kennedyoliveira.asteriskjava.khomp.manager.action.KGSMPresentationAction;

/**
 * Possible number presentation status.
 *
 * @author kennedy
 * @see KGSMPresentationAction
 */
public enum KGSMPresentation {

  /**
   * The number won't be show in a outgoing call.
   */
  RESTRICTED("restricted"),
  /**
   * The number will be show in a outgoing call.
   */
  NOT_RESTRICTED("notrestricted");

  private final String presentation;

  KGSMPresentation(String presentation) {
    this.presentation = presentation;
  }

  @Override
  public String toString() {
    return presentation;
  }
}
