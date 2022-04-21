package FacadeDesignPattern;

public class Hp implements LaptopShop {


    @Override
    public void Model() {
        System.out.println(" Model : HP Pavilion");
    }

    @Override
    public void price() {
        System.out.println("Price : 45,000");
    }
}
