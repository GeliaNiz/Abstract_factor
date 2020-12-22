package Abstract_factory;

public class HighHeelShoes implements Shoes{
    private String color;
    public HighHeelShoes(String color){
        this.color=color;
    }
    @Override
    public void showModel() {
        System.out.println("It is high heel shoes. Color: "+ color);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "HighHeelShoes{" +
                "color='" + color + '\'' +
                '}';
    }
}
