package core.basesyntax;

import java.io.PrintStream;

public class Diamond {

    /**
     * Нарисовать ромб со звёздочек заданной величины.
     *
     * Пример: величина 3, значит максимальное кол-во звёзд в ряду (по диагонали) будет 3.
     *
     * Вместо System.out.print() или System.out.println() использовать stream.print()
     * или stream.println()
     */
    public static void drawDiamond(int maxSize, PrintStream stream) {
      if (n % 2 == 0 || n < 0) {
      stream.println(null);
    }
    String[] asterisks = new String[n/2 + 1];
    asterisks[0] = "*\n";
    for(int i = 1; i < asterisks.length; i ++) {
      asterisks[i] = "**" + asterisks[i - 1];
    }
    String[] spaces = new String[n/2 + 1];
    spaces[0] = "";
    for(int i = 1; i < spaces.length; i ++) {
      spaces[i] = " " + spaces[i - 1];
    }
    String diamond = "";
    for (int i = 0; i < n/2 + 1; i ++) {
      diamond += spaces[spaces.length - i - 1] + asterisks[i];
    }
    for (int i = 1; i < n/2 + 1; i ++) {
      diamond += spaces[i] + asterisks[asterisks.length - i - 1];
    }
    stream.println(diamond);
    }

    public static void main(String[] args) {
        drawDiamond(5, System.out);
    }
}
