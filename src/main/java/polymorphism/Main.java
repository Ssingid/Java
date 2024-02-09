package polymorphism;

public class Main {
    public static void main(String[] args) {
        Car car = new Toyota();
        System.out.println(car.getBrand());
        car = new Lexus();
        System.out.println(car.getBrand());
    }
}
