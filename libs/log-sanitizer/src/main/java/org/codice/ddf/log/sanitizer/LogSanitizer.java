package org.codice.ddf.log.sanitizer;

import org.apache.commons.lang.StringEscapeUtils;

public class LogSanitizer {

  /**
   * Ensure that logs cannot be forged.
   *
   * @param message
   * @return clean message
   */
  public static String cleanAndEncode(String message) {
    return StringEscapeUtils.escapeHtml(message.replace('\n', '_').replace('\r', '_'));
  }
}
