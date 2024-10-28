package myPokemon;
import java.util.Random;

public class Charizard extends Pokemon {
    //basic constructer
    Charizard() {

        super("charizard", 12);
        this.setShield(5);
        this.setStrength(18);

    }
    //custom constructer
    Charizard(String name, int health, int shield, int strength) {

        super(name, health);
        this.setShield(shield);
        this.setStrength(strength);
        
    }
    Random rand = new Random();
    @Override
    //code to attack, deals damage equal to a random integer between 0 and the attackers strength subtracted by the defenders shield
    void attack(Pokemon target) {

        double finalDamage;

        if (this.getStrength() > target.getShield()) {

            finalDamage = this.getStrength() - target.getShield();

            finalDamage = Math.floor(Math.random() * (finalDamage - 1));

            target.takeDamage((int)finalDamage);
        }
    }
}
