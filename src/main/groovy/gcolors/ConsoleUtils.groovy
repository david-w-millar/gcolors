package gcolors

import groovy.transform.Memoized

class ConsoleUtils {
  // Non-Instantiable
  private ConsoleUtils() { }

  @Memoized
  static Boolean isInteractive() {
    System.console()?.tty
  }
}
