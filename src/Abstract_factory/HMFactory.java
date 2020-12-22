package Abstract_factory;

public class HMFactory implements AbstractFactory{
    @Override
    public Shoes createShoes() {
        return new Boots("black");
    }

    @Override
    public Shirt createShirt() {
        return new ShirtForWomen();
    }
}
