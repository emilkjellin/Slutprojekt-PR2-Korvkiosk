import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        while(true){
            Scanner scan = new Scanner(System.in);
            try{

                System.out.println("Hej salesman!");
                System.out.println("Du ska nu ta hand om en korvkiosk");
                System.out.println("du har 2 stats(money,fame) som du ska hålla upp så länge som möjligt");
                System.out.println("ska vi börja?");
                String start = scan.nextLine();
                if (start == "ja"){
                    System.out.println("okej då börjar vi");
                } else {
                    System.out.println("korvmojen behöver ju dig:(");
                }


            } catch(Exception e) {
                System.out.println("Svara rätt och utan stora bokstäver snälla:)");
            }
        }
    }
}