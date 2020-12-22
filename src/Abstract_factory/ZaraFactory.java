package Abstract_factory;

public class ZaraFactory implements AbstractFactory{
    @Override
    public Shoes createShoes() {
        return new HighHeelShoes("red");
    }

    @Override
    public Shirt createShirt() {
        return new ShirtForWomen();
    }
}
