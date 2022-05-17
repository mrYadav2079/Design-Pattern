package DecoratorDesignPattern;

public class ClassicCar extends CarDecorator {
    public ClassicCar(Car car) {
        super(car);
    }

    @Override
    public void assemble() {
        super.assemble();
        System.out.println("Adding Classic Car features");
    }
}
