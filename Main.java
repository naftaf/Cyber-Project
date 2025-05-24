import java.util.Scanner;
import java.util.Timer;

class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Player p;
        Diamond d;
        int lvlCount = 0;
        float mostRecentTime;
        
       /*  */ //intro
        if (lvlCount == 0){
            System.out.println("Welcome to .+*Haunted Mansion*+. boooooooo~~~");
            System.out.println("But don't fret! this game is definitely not as scary as the Google Coursera course :3");
            mostRecentTime = (float)(System.currentTimeMillis());
            System.out.println("...");
            System.out.print("Want to hear how to get out? Type Y or N: ");
            String input = s.nextLine();
            if (input.equals("Y") || input.equals("y")){
                System.out.println("Great! Here are the rules: ");
                System.out.println("You have a very important ASSET on you. It's a large DIAMOND, and you have to be able to get out of here with it in tact.");
                System.out.println("Each round, you will be tasked with solving a puzzle or defeating an obstacle. You also have ARMOR that will increase with each correct answer.");
                System.out.println("Each round, you will be tasked with solving a puzzle or defeating an obstacle. You also have ARMOR that will increase with each correct answer.");

            }
            else if (input.equals("N") || input.equals("n")){
                System.out.println("hehehe");
            }
            
        }
    }
}

