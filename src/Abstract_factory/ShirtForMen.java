package Abstract_factory;

public class ShirtForMen implements Shirt {
    @Override
    public int getSize() {
        return 50;
    }

    @Override
    public void showMaterial() {
        System.out.println("Material is leather");
    }

}
