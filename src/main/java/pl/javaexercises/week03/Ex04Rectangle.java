package pl.javaexercises.week03;

public class Ex04Rectangle implements Ex04Shape {

    public double width;
    public double height;

    public Ex04Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public void area() {
        double result = width*height;
        System.out.println("The area of the rectangle: " + result);
    }
}
