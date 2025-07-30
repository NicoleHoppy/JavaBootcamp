package pl.javaexercises.week02;

public class Ex08DigitWordConverter implements TaskWeek02<String> {

  @Override
  public String run(String name) {

    StringBuilder result = new StringBuilder();

    for (char c : name.toCharArray()) {
      if (Character.isDigit(c)) {
        result.append(
            switch (c) {
              case '0' -> "zero";
              case '1' -> "one";
              case '2' -> "two";
              case '3' -> "three";
              case '4' -> "four";
              case '5' -> "five";
              case '6' -> "six";
              case '7' -> "seven";
              case '8' -> "eight";
              case '9' -> "nine";
              default -> String.valueOf(c);
            });
      } else result.append(c);
    }

    return result.toString();
  }
}
