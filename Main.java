import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Player p = new Player("", 100, false, 20);
        Diamond d = new Diamond(100, 0, false);
        int lvlCount = 0;

       /*  */ //intro
        if (lvlCount == 0){
            System.out.println("Welcome to .+*Haunted Mansion*+. boooooooo~~~");
            System.out.println("But don't fret! this game is definitely not as scary as the Google Coursera course :3 But there's lots of reading.. (did NOT want to make a GUI)");
            System.out.println("...");
            System.out.print("Want to hear how to get out? Type Y or N: ");
            String input = s.nextLine();
            input = input.toUpperCase();

            while (!input.equals("Y")){
                System.out.print("We both need this grade -- you don't really have a choice! Try again: ");
                input = s.nextLine();
                input = input.toUpperCase();
            }

            System.out.println("Great! Here are the rules: \n");
            System.out.println("You have a very important ASSET on you. It's a large DIAMOND, and you have to be able to get out of here with it in tact.");
            System.out.println("Each round, you will be tasked with solving a puzzle or defeating an obstacle.");
            System.out.println("You also have ARMOR that will increase with each correct answer.");
            System.out.println("But stay aware of your environment -- in a RISKIER environment, you will be at more RISK (duh) if you happen to lose to the obstacle, meaning you and your ASSET will take more damange.");
            System.out.println("----------------------------------------------------------------------------------------------------------------------------");
            System.out.println("First, enter your name: ");
            p.setName(s.nextLine());
            p.printStats();
            d.printStats();
            System.out.println("Great! Seems like you're ready -- let's start!");
            lvlCount++;
        }

        if (lvlCount == 1) {
            Level lvl1 = new Level("test", "Phishing", 25, 2);
        }
    }
}

