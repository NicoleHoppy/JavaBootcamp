package pl.javaexercises.week02;

public class Ex04InitialsGenerator implements TaskWeek02<String> {

  @Override
  public String run(String fullName) {
    String[] nameTable = fullName.split(" ");
    String name = nameTable[0];
    String surname = nameTable[1];
    char firstNameLetter = name.charAt(0);
    char firstSurnameLetter = surname.charAt(0);
    return ("The initials for "
        + fullName
        + " are: "
        + firstNameLetter
        + "."
        + firstSurnameLetter
        + ".");
  }
}
