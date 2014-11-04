package gcolors

import static gcolors.Styles.*
import org.codehaus.groovy.runtime.GStringImpl


/**
 * Make strings pretty.
 *
 * @since 1.0.0
 */
class ColorsExtension {

  // ----- [ String ] -----
  static String reset(final String self) { reset.apply(self) }

  static String black(final String self)   { black.apply(self) }
  static String red(final String self)     { red.apply(self) }
  static String green(final String self)   { green.apply(self) }
  static String yellow(final String self)  { yellow.apply(self) }
  static String blue(final String self)    { blue.apply(self) }
  static String magenta(final String self) { magenta.apply(self) }
  static String cyan(final String self)    { cyan.apply(self) }
  static String white(final String self)   { white.apply(self) }
  static String gray(final String self)    { gray.apply(self) }
  static String grey(final String self)    { grey.apply(self) }

  static String bgBlack(final String self)   { bgBlack.apply(self) }
  static String bgRed(final String self)     { bgRed.apply(self) }
  static String bgGreen(final String self)   { bgGreen.apply(self) }
  static String bgYellow(final String self)  { bgYellow.apply(self) }
  static String bgBlue(final String self)    { bgBlue.apply(self) }
  static String bgMagenta(final String self) { bgMagenta.apply(self) }
  static String bgCyan(final String self)    { bgCyan.apply(self) }
  static String bgWhite(final String self)   { bgWhite.apply(self) }

  static String bold(final String self)      { bold.apply(self) }
  static String dim(final String self)       { dim.apply(self) }
  static String italic(final String self)    { italic.apply(self) }
  static String underline(final String self) { underline.apply(self) }
  static String inverse(final String self)   { inverse.apply(self) }
  static String hidden(final String self)    { hidden.apply(self) }
  static String strikethrough(final String self) { strikethrough.apply(self) }


  // ----- [ GString ] -----

  static String reset(final GString self) { reset.apply(self) }

  static String black(final GString self) { black.apply(self) }
  static String red(final GString self)     { red.apply(self) }
  static String green(final GString self)   { green.apply(self) }
  static String yellow(final GString self)  { yellow.apply(self) }
  static String blue(final GString self)    { blue.apply(self) }
  static String magenta(final GString self) { magenta.apply(self) }
  static String cyan(final GString self)    { cyan.apply(self) }
  static String white(final GString self)   { white.apply(self) }
  static String gray(final GString self)    { gray.apply(self) }
  static String grey(final GString self)    { grey.apply(self) }

  static String bgBlack(final GString self)   { bgBlack.apply(self) }
  static String bgRed(final GString self)     { bgRed.apply(self) }
  static String bgGreen(final GString self)   { bgGreen.apply(self) }
  static String bgYellow(final GString self)  { bgYellow.apply(self) }
  static String bgBlue(final GString self)    { bgBlue.apply(self) }
  static String bgMagenta(final GString self) { bgMagenta.apply(self) }
  static String bgCyan(final GString self)    { bgCyan.apply(self) }
  static String bgWhite(final GString self)   { bgWhite.apply(self) }

  static String bold(final GString self) { bold.apply(self) }
  static String dim(final GString self) { dim.apply(self) }
  static String italic(final GString self) { italic.apply(self) }
  static String underline(final GString self) { underline.apply(self) }
  static String inverse(final GString self) { inverse.apply(self) }
  static String hidden(final GString self) { hidden.apply(self) }
  static String strikethrough(final GString self) { strikethrough.apply(self) }
}

