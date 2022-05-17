package DecoratorDesignPattern;

public class SportyCar extends CarDecorator {
    public SportyCar(Car car) {
        super(car);
    }

    @Override
    public void assemble() {
        super.assemble();
        System.out.println("Adding Sporty Car features");
    }
}
