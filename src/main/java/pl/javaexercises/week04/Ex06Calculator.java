package pl.javaexercises.week04;

//6. Implement a Calculator class that, in addition to adding, logs the result to LoggerService. Test that logger.log(...) was called with the correct message.

public class Ex06Calculator {
    private final Ex06LoggerService loggerService;

    public Ex06Calculator(Ex06LoggerService loggerService) {
        this.loggerService = loggerService;
    }

    public int add(int a, int b) {
        int result = a + b;
        loggerService.log("Added: " + result);
        return result;
    }
}
