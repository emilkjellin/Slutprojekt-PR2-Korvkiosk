 abstract class Choice {
    protected String rarity;
    protected int reward;

    public Choice(String rarity, int reward){
        this.rarity = rarity;
        this.reward = reward;
    }
    public abstract void applyChoice(Player player);// så att man ska kunna nämna denna i choice.


}
