package pl.javaexercises.week03;

public class Ex05Product implements Comparable<Ex05Product>{
    String name;
    double price;
    double rating;

    public Ex05Product(String name, double price, double rating) {
        this.name = name;
        this.price = price;
        this.rating = rating;
    }

    public double getPrice() {
        return price;
    }

    public double getRating() {
        return rating;
    }

    @Override
    public int compareTo(Ex05Product ex05Product) {
        return Double.compare(this.price, ex05Product.price);
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", rating=" + rating +
                "} ";
    }
}
