package myPokemon;
import java.util.Random;

public class Charizard extends Pokemon {
    Random rand = new Random();
    @Override
    //code to attack, deals damage equal to a random integer between 0 and the attackers strength subtracted by the defenders shield
    void attack(Pokemon target) {
        double finalDamage;
        if (this.strength > target.shield) {
            finalDamage = this.strength - target.shield;
            finalDamage = Math.floor(Math.random() * (finalDamage - 1));
            target.takeDamage((int)finalDamage);
        }
    }
    //basic constructer
    Charizard() {
        super("charizard", 12);
        this.shield = 5;
        this.strength = 18;

    }
    //custom constructer
    Charizard(String name, int health, int shield, int strength) {
        super(name, health);
        this.shield = shield;
        this.strength = strength;
    }
}
