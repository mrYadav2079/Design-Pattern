package DecoratorDesignPattern;

public class Main {
    public static void main(String[] args) {
        Car sportyCar= new SportyCar(new BasicCar());
        sportyCar.assemble();
        System.out.println();

        Car classicCar =new ClassicCar(new BasicCar());
        classicCar.assemble();
        System.out.println();
    }
}
