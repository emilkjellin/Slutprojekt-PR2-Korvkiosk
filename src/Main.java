import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        while(true){
            Scanner scan = new Scanner(System.in);
            Player player = new Player();
            try{
                for (int i = 0; i < 5;i++){
                Choice choice =Korvkioskspel.getRandomChoice();
                    System.out.println(choice);
                    System.out.println("vill du ha detta ja / nej)");
                    String val = scan.nextLine();
                    if (val.equalsIgnoreCase("ja")){
                        choice.applyChoice(player);
                    } else if (val.equalsIgnoreCase("nej")) {
                        System.out.println("okej no gains:(");
                    }
                    player.status();
                }
                break;

            } catch(Exception e) {
                System.out.println("Svara ja eller nej ensälla :)");
            }
        }
    }
}