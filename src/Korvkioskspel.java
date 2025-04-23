import java.util.Random;

public class Korvkioskspel {
    public static Choice getRandomChoice(){
        Random kort = new Random();
        String[] rarities = {"Common", "Rare", "Epic", "Legendary"};
        int[] rewards = {10, 20, 50, 100};
        int index = kort.nextInt(rarities.length);
        if (kort.nextBoolean()) {
        return new Moneychoice(rarities[index], rewards[index]);
        } else {
            return new Famechoice(rarities[index], rewards[index]);
        }
    }
}
