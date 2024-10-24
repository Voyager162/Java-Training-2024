package Week3.Polymorphism;
import java.lang.Math;

class Slowcalculator extends Calculator{
    @Override
    public int multiplication(int one, int two) {
        int finalInt = 0;
        for (int i = two; i > 0; i--) {
            finalInt += one;
        }
        return finalInt;    
    }

    public double exponent(int one, int two) {
        return Math.pow(one, two);
    }
}