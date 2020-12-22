package Abstract_factory;

public class Main {
    public static void main(String[] args) {
        Clothes clothes;
        AbstractFactory factory;
        factory=new GloriaJeansFactory();
        clothes=new Clothes(factory);
        clothes.getShirt();
        clothes.getShoes();
        System.out.println(factory.createShirt());

    }
}
