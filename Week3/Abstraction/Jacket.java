package Week3.Abstraction;

class Jacket extends Shirt {
    int brand;
    double price;
    Jacket(double price, String color) {
        super(color);
        this.price = price;
    }

    @Override
    String getDescription() {
        return brand + " " + color + " " + price;
    }
}
