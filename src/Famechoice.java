class Famechoice extends Choice {
    public Famechoice(String rarity, int reward){
        super (rarity,reward);
    }

     public void applyChoice(Player player){
        player.fame += reward;
        System.out.println("Du valde fame! " + reward + " fame");
    }
}
