package pl.javaexercises.week02.section02;

import pl.javaexercises.week02.TaskWeek02;

// 3. Check if a password:
//
// has at least 8 characters,
//
// contains a digit,
//
// contains an uppercase letter,
//
// contains a special character.

public class Ex03PasswordValidator implements TaskWeek02<String> {

  @Override
  public String run(String pass) {
    if (pass.length() < 8) return String.valueOf(false);
    return String.valueOf(pass.matches("^(?=.*[A-Z])(?=.*[^a-zA-Z0-9]).+$"));
  }
}
