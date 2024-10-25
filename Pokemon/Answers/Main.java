package Pokemon.Answers;

public class Main {
    public static void main(String[] args) {
        // Round 1
        Pokemon geodude = new Geodude();
        Pokemon jigglypuff = new Jigglypuff();

        while (!geodude.getIsFainted() && !jigglypuff.getIsFainted()) {
            geodude.attack(jigglypuff);
            jigglypuff.attack(geodude);
        }

        if (geodude.getIsFainted()) {
            System.out.println("The winner is " + jigglypuff.getName());
        } else {
            System.out.println("The winner is " + geodude.getName());
        }

        // Round 2
        Pokemon toughGuy = new Geodude(25, "Tough Guy");
        Pokemon littleBuddy = new Jigglypuff(12, "Little Buddy");

        while (!toughGuy.getIsFainted() && !littleBuddy.getIsFainted()) {
            toughGuy.attack(littleBuddy);
            littleBuddy.attack(toughGuy);
        }

        if (toughGuy.getIsFainted()) {
            System.out.println("The winner is " + littleBuddy.getName());
        } else {
            System.out.println("The winner is " + toughGuy.getName());
        }
    }
}
