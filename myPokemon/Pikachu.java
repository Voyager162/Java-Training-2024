package myPokemon;
import java.util.Random;

public class Pikachu extends Pokemon{
    Random rand = new Random();
    //code to attack, deals damage equal to a random integer between 0 and the attackers strength subtracted by the defenders shield
    @Override
    void attack(Pokemon target) {
        double finalDamage;
        if (this.strength > target.shield) {
            finalDamage = this.strength - target.shield;
            finalDamage = Math.floor(Math.random() * (finalDamage - 1));
            target.takeDamage((int)finalDamage);
        }
    }
    //basic constructer
    Pikachu() {
        super("Pikachu", 14);
        this.shield = 12;
        this.strength = 10;

    }
    //custom constructer
    Pikachu(String name, int health, int shield, int strength) {
        super(name, health);
        this.shield = shield;
        this.strength = strength;
    }
}
