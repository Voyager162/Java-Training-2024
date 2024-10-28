package myPokemon;

public abstract class Pokemon {

    private String name;

    private int health;
    private int strength;
    private int shield;

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

    //getters
    public String getName() {

        return this.name;
        
    }
    public int getStrength() {

        return this.strength;

    }
    public int getHealth() {

        return this.health;

    }
    public int getShield() {

        return this.shield;

    }

    //setters

    public void setName(String name) {

        this.name = name;
        
    }
    public void setStrength(int strength) {

        this.strength = strength;

    }
    public void setHealth(int health) {

        this.health = health;

    }
    public void setShield(int shield) {

        this.shield = shield;

    }
}
