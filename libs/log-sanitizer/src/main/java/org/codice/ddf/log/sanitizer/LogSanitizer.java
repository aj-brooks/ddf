package org.codice.ddf.log.sanitizer;

import org.apache.commons.lang.StringEscapeUtils;

import java.util.Collection;
import java.util.List;

import static java.util.stream.Collectors.toList;

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

  public static List<String> cleanAndEncode(Collection<String> messages) {
    return messages.stream().map(LogSanitizer::cleanAndEncode).collect(toList());
  }
}
