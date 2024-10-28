package myPokemon;

public class Main {

    //Main program to create two basic pokemon and have them fight and two custom pokemon to fight
    public static void main(String[] args) {
        Charizard charizard = new Charizard();
        Pikachu pikachu = new Pikachu();

        System.out.println(fight(charizard, pikachu) + " WINS!!!!");
        
        Charizard charizardCustom = new Charizard("Chary", 20, 8, 16);
        Jigglypuff JigglypuffCustom = new Jigglypuff("jiggly", 28, 12, 12);

        System.out.println(fight(charizardCustom, JigglypuffCustom) + " WINS!!!!");
    }


    //method to have the pokemon fight

    public static String fight(Pokemon fighterOne, Pokemon fighterTwo) {

        while (!fighterOne.getIsFainted() && !fighterTwo.getIsFainted()) {

            fighterOne.attack(fighterTwo);
            fighterTwo.attack(fighterOne);

            System.out.println("fighter one health: " + fighterOne.getHealth() + " figher two health: " + fighterTwo.getHealth());
        }

        if (fighterOne.getIsFainted()) return fighterTwo.getName();
        
        else return fighterOne.getName();
    }
}