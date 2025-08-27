package pl.javaexercises.week05.section01;

public class MainWeek05Section01 {
    public static void main(String[] args) throws InterruptedException {
        Ex01TaskGenerator ex01TaskGenerator = new Ex01TaskGenerator();

        Thread generatorThread = new Thread(ex01TaskGenerator);
        generatorThread.start();
        generatorThread.join();
    }
}
