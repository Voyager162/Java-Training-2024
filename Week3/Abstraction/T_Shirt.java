package Week3.Abstraction;

class T_Shirt extends Shirt {
    int size;
    double price;
    T_Shirt(int size, double price, String color) {
        super(color);
        this.size = size;
        this.price = price;
    }

    @Override
    String getDescription() {
        return size + " " + color + " " + price;
    }
}