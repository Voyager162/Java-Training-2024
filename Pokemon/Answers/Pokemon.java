package Pokemon.Answers;

public abstract class Pokemon {

    private int health;
    private String name;

    public Pokemon(int health, String name) {
        this.health = health;
        this.name = name;
    }

    public void takeDamage(int damage) {
        health -= damage;
    }

    public abstract void attack(Pokemon opposingPokemon);

    public boolean getIsFainted() {
        return health <= 0;
    }

    public String getName(){
        return name;
    }
    public int getHealth(){
        return health;
    }
}
