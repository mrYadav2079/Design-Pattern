package FacadeDesignPattern;


public class Apple implements LaptopShop{


    @Override
    public void Model() {
        System.out.println(" Model : Apple MackBook");
    }

    @Override
    public void price() {
        System.out.println("Price : 85,000");
    }
}
