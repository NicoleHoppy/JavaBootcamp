package pl.javaexercises.week02;

public class Ex06WordCounter implements TaskWeek02<String> {

  @Override
  public String run(String name) {
    String[] nameList = name.trim().split("\\s");
    return String.valueOf(nameList.length);
  }
}
