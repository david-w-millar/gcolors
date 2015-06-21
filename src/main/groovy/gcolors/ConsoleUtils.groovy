package gcolors

import groovy.transform.Memoized

/**
 * Probe terminal capabilities for colors
 * Optionally force color with environment variable 'FORCE_COLOR'
 */
class ConsoleUtils {
  // Non-Instantiable
  private ConsoleUtils() { }

  public static final String FORCE_COLOR_ENV_VAR_NAME = 'FORCE_COLOR'

  @Memoized
  static Boolean isInteractive() {
    System.getEnv(FORCE_COLOR_ENV_VAR_NAME) || System.console()?.tty
  }
}

