package FacadeDesignPattern;

public class ShopKeeper {
    private LaptopShop apple;
    private LaptopShop hp;
    private LaptopShop lenovo;

    public ShopKeeper(){
        apple= new Apple();
        hp=new Hp();
        lenovo=new Lenovo();
    }
    public void appleSale(){
        apple.Model();
        apple.price();
    }
    public void hpSale(){
        hp.Model();
        hp.price();
    }
    public void lenovoSale(){
        lenovo.Model();
        lenovo.price();
    }
}
