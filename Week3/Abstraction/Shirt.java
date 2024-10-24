package Week3.Abstraction;

public abstract class Shirt {
    String color;
    Shirt(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
    abstract String getDescription();
}