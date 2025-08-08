package pl.javaexercises.week02.section03;

// 2. Create an interface Playable with the method play(). Create a class Guitar implementing
// Playable and displaying “Guitar is playing”.

public class Ex02Guitar implements Ex02Playable {

  @Override
  public void play() {
    System.out.println("Guitar is playing!");
  }
}
