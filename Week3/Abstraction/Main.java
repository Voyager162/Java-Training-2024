package Week3.Abstraction;

class Main {
    public static void main(String[] args) {
        T_Shirt myT_Shirt = new T_Shirt(12, 36.89, "red");
        Jacket myJacket = new Jacket(52.84, "red");
        System.out.println(myJacket.color);
        double totalPrice = myT_Shirt.price + myJacket.price;
        System.out.println(totalPrice);

    }
}