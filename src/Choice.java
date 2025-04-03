 abstract class Choice {
    protected String rarity;
    protected int reward;

    public Choice(String rarity, int reward){
        this.rarity = rarity;
        this.reward = reward;
    }
    public abstract void applyChoice(Player player);

    @Override
     public String toString() {
        return "[" + rarity + "] - ger " + reward +"poäng";
    }
}
