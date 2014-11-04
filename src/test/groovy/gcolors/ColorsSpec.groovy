package gcolors;

import spock.lang.*
import spock.util.mop.ConfineMetaClassChanges

class ColorsSpec extends Specification {

  @ConfineMetaClassChanges(ConsoleUtils)
  void 'I can use all combinations of colors and styles without blowing up'() {
    given:
    ConsoleUtils.metaClass.'static'.isInteractive = { false }

    when:
    List<String> colors   = [ 'black', 'red', 'green', 'yellow', 'blue', 'magenta', 'cyan', 'white', 'gray' ]
    List<String> bgColors = colors.collectAll { 'bg' + it.replaceFirst(/\w/, { it.toUpperCase() } ) } - 'bgGrey' - 'bgGray'
    List<String> styles = [ 'bold', 'dim', 'italic', 'underline', 'inverse', 'hidden', 'strikethrough' ]

    then:
    colors.each { color ->
      styles.each { style ->
        bgColors.each { bgColor ->
          "${color} ${bgColor} ${style}".&"${color}".call().&"${style}".call().&"${bgColor}".call()
        }
      }
    }
  }

  @ConfineMetaClassChanges(ConsoleUtils)
  void 'styles and colors are ignored for non-interactive environments'() {
    when: ConsoleUtils.metaClass.'static'.isInteractive = { false }
    then: "red".red() == "red"
  }

  @ConfineMetaClassChanges(ConsoleUtils)
  void 'styles and colors are applied for non-interactive environments'() {
    when: ConsoleUtils.metaClass.'static'.isInteractive = { true }
    then: 'red'.red() != 'red'
  }


}
