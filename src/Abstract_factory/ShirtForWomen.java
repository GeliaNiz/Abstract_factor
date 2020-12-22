package Abstract_factory;

public class ShirtForWomen implements Shirt{
    @Override
    public int getSize() {
        return 38;
    }

    @Override
    public void showMaterial() {
        System.out.println("Material is silk");
    }
}
