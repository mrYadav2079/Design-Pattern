package FacadeDesignPattern;



public class Lenovo implements LaptopShop{
    @Override
    public void Model() {
        System.out.println(" Model : Lenovo ThinkPad");
    }

    @Override
    public void price() {
        System.out.println(" Price : 70,000");
    }
}
