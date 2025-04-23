import java.util.Random;

public class Korvkioskspel {
    public static Choice getRandomChoice(){
        Random kort = new Random();
        String[] rarities = {"Common", "Rare", "Epic", "Legendary"};
        int[] rewards = {10, 20, 50, 100};
        int index = kort.nextInt(rarities.length);

    }
}
