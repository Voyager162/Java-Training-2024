package myPokemon;

public abstract class Pokemon {

    private String name;

    int health;
    int strength;
    int shield;

    //basic super constructer
    Pokemon(String name, int health) {

        this.name = name;
        this.health = health;

    }

    //construture to take damage from an attack
    public void takeDamage(int damage) {

        this.health -= damage;

    }
    //abstract method to attack
    abstract void attack(Pokemon target);

    //checks if the health is below 0
    public boolean getIsFainted() {

        return this.health <= 0;

    }

    //gets the name of the pokemon
    public String getName() {

        return this.name;
        
    }
}
