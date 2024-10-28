package myPokemon;
import java.util.Random;

public class Pikachu extends Pokemon{
    //basic constructer
    Pikachu() {

        super("Pikachu", 14);
        this.setShield(12);
        this.setStrength(10);

    }
    //custom constructer
    Pikachu(String name, int health, int shield, int strength) {

        super(name, health);
        this.setShield(shield);
        this.setStrength(strength);
        
    }
    Random rand = new Random();

    //code to attack, deals damage equal to a random integer between 0 and the attackers strength subtracted by the defenders shield
    @Override
    void attack(Pokemon target) {

        double finalDamage;

        if (this.getStrength() > target.getShield()) {

            finalDamage = this.getStrength() - target.getShield();

            finalDamage = Math.floor(Math.random() * (finalDamage - 1));

            target.takeDamage((int)finalDamage);
        }
    }
}
