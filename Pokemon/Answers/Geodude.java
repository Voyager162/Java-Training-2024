package Pokemon.Answers;

public class Geodude extends Pokemon {

    // default constructor, setting to 20 health and naming the pokemon "Geodude"
    public Geodude() {
        super(18, Geodude.class.getSimpleName()); // Fancy way of getting the name of the class
    }

    // non-default constructor, allowing the user to specify Geodude's health and name
    public Geodude(int health, String name) {
        super(health, name);
    }

    // Attack method for damaging an opposing pokemon
    @Override
    public void attack(Pokemon opposingPokemon) {
        opposingPokemon.takeDamage(2); // I have decided that geodude's atack should do 2 damage
    }

}
