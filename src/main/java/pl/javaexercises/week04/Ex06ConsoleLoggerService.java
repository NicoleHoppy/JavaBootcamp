package pl.javaexercises.week04;

public class Ex06ConsoleLoggerService implements Ex06LoggerService{
    @Override
    public void log(String message) {
        MainWeek04.printResult(Ex06Calculator.class, "LOG: " + message);
    }
}
