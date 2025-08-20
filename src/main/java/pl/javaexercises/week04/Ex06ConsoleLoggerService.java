package pl.javaexercises.week04;

public class Ex06ConsoleLoggerService implements Ex06LoggerService{
    @Override
    public void log(String message) {
    System.out.println("LOG: " + message);
    }
}
