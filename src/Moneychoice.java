 class Moneychoice extends Choice {
     public Moneychoice(String rarity, int reward) {
         super(rarity, reward);
     }
     @Override
     public void applyChoice(Player player){
         player.money += reward;
         System.out.println("Du valde money! " + reward + "money");
     }
 }
 }
