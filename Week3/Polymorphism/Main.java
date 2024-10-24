package Week3.Polymorphism;

class Main {
    public static void main(String[] args) {
        Slowcalculator cal = new Slowcalculator();
        System.out.println(cal.division(39.00, 49.00));
        System.out.println(cal.division(39, 49));
        System.out.println(cal.multiplication(37, 49));
        System.out.println(cal.exponent(3, 2));
    }
}