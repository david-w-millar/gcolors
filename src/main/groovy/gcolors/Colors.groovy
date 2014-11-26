package gcolors

import static gcolors.Styles.*

/**
 * ALL THE COLORS! (AND STYLES!)
 * Showcase app / manual testing.
 */
class Colors {

  static final List<String> colors   = [ 'black', 'red', 'green', 'yellow', 'blue', 'magenta', 'cyan', 'white', 'gray' ].asImmutable()
  static final List<String> bgColors = (colors.collectAll { 'bg' + it.replaceFirst(/\w/, { it.toUpperCase() } ) } - 'bgGrey' - 'bgGray').asImmutable()
  static final List<String> styles = [ 'bold', 'dim', 'italic', 'underline', 'inverse', 'hidden', 'strikethrough' ].asImmutable()

  static void main(args) {
    showcase()
    //allColors()
    //allBgColors()
    //allStyles()
    //allCombos()
  }

  static void showcase() {
    println "I'm red".red()
    println "I'm blue and underlined".blue().underline()
    println "I'm all kinds of blue and bold".cyan().bgBlue().bold()
    println "I'm the inverse of the line above".cyan().bgBlue().bold().inverse()
  }

  static void allColors() {
    println "----- [ Colors ] -----"

    println 'black'.black()
    println 'red'.red()
    println 'green'.green()
    println 'yellow'.yellow()
    println 'blue'.blue()
    println 'magenta'.magenta()
    println 'cyan'.cyan()
    println 'white'.white()
    println 'gray'.gray()
  }

  static void allBgColors() {
    println "----- [ Background Colors ] -----"

    println 'black'.bgBlack()
    println 'red'.bgRed().black()
    println 'green'.bgGreen().black()
    println 'yellow'.bgYellow().black()
    println 'blue'.bgBlue().black()
    println 'magenta'.bgMagenta().black()
    println 'cyan'.bgCyan().black()
    println 'white'.bgWhite().black()
  }

  static void allStyles() {
    println "\n\n----- [ Styles ] -----"

    println 'bold'.bold()
    println 'dim'.dim()
    println 'italic'.italic()
    println 'underline'.underline()
    println 'inverse'.inverse()
    println 'hidden'.hidden()
    println 'strikethrough'.strikethrough()
  }


  static void allCombos() {
    println "\n\n----- [ All Combos ] -----"
    colors.each { color ->
      styles.each { style ->
        bgColors.each { bgColor ->
          println "${color} ${bgColor} ${style}".&"${color}".call().&"${style}".call().&"${bgColor}".call()
        }
      }
    }
  }

}
