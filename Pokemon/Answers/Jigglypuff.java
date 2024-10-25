package Pokemon.Answers;

public class Jigglypuff extends Pokemon {

    // default constructor, setting to 15 health and naming the pokemon "Jigglypuff"
    public Jigglypuff() {
        super(15, "Jigglypuff");
    }

    // non-default constructor, allowing the user to specify Geodude's health and name
    public Jigglypuff(int health, String name) {
        super(health, name);
    }
    
    // Attack method for damaging an opposing pokemon
    @Override
    public void attack(Pokemon opposingPokemon) {
        opposingPokemon.takeDamage(3); // I have decided that jigglypuff's atack should do three damage
    }

}
