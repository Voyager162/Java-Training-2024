package myPokemon;
import java.util.Random;

public class Jigglypuff extends Pokemon{
    //basic constructer
    Jigglypuff() {

        super("Jigglypuff", 35);
        this.setShield(5);
        this.setStrength(8);

    }
    //custom constructer
    Jigglypuff(String name, int health, int shield, int strength) {

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
