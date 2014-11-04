package gcolors

import static gcolors.ConsoleUtils.isInteractive

enum Styles {
  reset(0, 0),

  black(30, 39),
  red(31, 39),
  green(32, 39),
  yellow(33, 39),
  blue(34, 39),
  magenta(35, 39),
  cyan(36, 39),
  white(37, 39),
  gray(90, 39),
  grey(90, 39),

  bgBlack(40, 49),
  bgRed(41, 49),
  bgGreen(42, 49),
  bgYellow(43, 49),
  bgBlue(44, 49),
  bgMagenta(45, 49),
  bgCyan(46, 49),
  bgWhite(47, 49),

  bold(1, 22),
  dim(2, 22),
  italic(3, 23),
  underline(4, 24),
  inverse(7, 27),
  hidden(8, 28),
  strikethrough(9, 29)


  private final String open
  private final String close

  Styles(final Integer o, final Integer c) {
    open  = "\u001b[${o}m"
    close = "\u001b[${c}m"
  }

  String apply(final String target)  {
    return isInteractive() ? "${open}${target}${close}" : target
  }

  String apply(final GString target) {
    apply(target.toString())
  }

}
