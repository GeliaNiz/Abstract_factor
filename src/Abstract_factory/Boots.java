package Abstract_factory;

public class Boots implements Shoes{
    private String color;
    public Boots(String color){
        this.color=color;
    }
    @Override
    public void showModel() {
        System.out.println("It is boots. Color: "+ color);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Boots{" +
                "color='" + color + '\'' +
                '}';
    }
}
