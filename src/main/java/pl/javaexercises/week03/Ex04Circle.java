package pl.javaexercises.week03;

public class Ex04Circle implements Ex04Shape {

    public double radius;

    public Ex04Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void area() {
        double result = Math.PI* radius* radius;
        System.out.println("The area of the circle: " + result);
    }
}
