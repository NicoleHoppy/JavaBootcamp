package pl.javaexercises.week02.section01;

import pl.javaexercises.week02.TaskWeek02;

public class Ex05CaseConverter implements TaskWeek02<String> {

  @Override
  public String run(String input) {

    char[] nameList = input.toLowerCase().toCharArray();

    for (int i = 1; i < nameList.length; i += 2) {
      nameList[i] = Character.toUpperCase(nameList[i]);
    }
    return new String(nameList);
  }
}
