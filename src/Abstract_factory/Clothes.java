package Abstract_factory;

public class Clothes {
    private Shoes shoes;
    private Shirt shirt;
    public Clothes(AbstractFactory factory){
        shoes=factory.createShoes();
        shirt=factory.createShirt();
    }
    public void getShoes(){
        shoes.showModel();
    }
    public void getShirt(){
        System.out.println(shirt.getSize());
        shirt.showMaterial();
    }
}
