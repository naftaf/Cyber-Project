import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Player p = new Player("", 100, false, 20);
        Diamond d = new Diamond(100, 400, false);
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
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println("First, enter your name: ");
            p.setName(s.nextLine());
            p.printStats();
            d.printStats();
            System.out.println("Great! Seems like you're ready -- let's start!");
            System.out.println();
            System.out.println();
            System.out.println();
            lvlCount++;
        }

        while (d.getHealth() > 0 && d.isBroken() == false && p.getHealth() > 0 && lvlCount < 3){
            if (lvlCount == 1) {
                System.out.println(".+*-------------------------------------------------------------------------------------------------------------------------*+.");
                Level lvl1 = new Level("Entryway", "Phishing", 2, 2);
                lvl1.attack();
                String answer = s.nextLine();
                if (lvl1.isCorrectAnswer(answer)) {
                    System.out.println("You've surpassed the first level! Great job. Here is some armor: ");
                    p.setArmor(30);
                    System.out.println("Current Armor: " + p.getArmor());
                    lvlCount++;
                }
                else {
                    int val = lvl1.lose();
                    d.SLE(val, p.getArmor());
                    d.printStats();
                }
            }
            
            System.out.println();
            System.out.println();
            System.out.println();
            if (lvlCount == 2){
                System.out.println(".+*-------------------------------------------------------------------------------------------------------------------------*+.");
                Level lvl2 = new Level("MainRoom", "DoS", 3, 1);
                lvl2.attack();
                String a = s.nextLine();
                if (lvl2.isCorrectAnswer(a)) {
                    System.out.println("You've surpassed the second level! Great job. Here is even MORE armor: ");
                    p.setArmor(40);
                    System.out.println("Current Armor: " + p.getArmor());
                    lvlCount++;
                }
                else {
                    int val = lvl2.lose();
                    d.SLE(val, p.getArmor());
                    p.setHealth(p.getHealth() - 20);
                    p.printStats();
                    d.printStats();
                }
            }

            System.out.println();
            System.out.println();
            System.out.println();

            if (lvlCount == 3){
                System.out.println(".+*-------------------------------------------------------------------------------------------------------------------------*+.");
                Level lvl3 = new Level("Exit", "InsecureWifi", 4, 3);
                lvl3.attack();
                String a = s.nextLine();
                if (lvl3.isCorrectAnswer(a)) {
                    System.out.println("You've surpassed the third level! Great job. WE'RE OUT OF HERE!!!!!!!!");
                    p.setArmor(60);
                    System.out.println("Current Armor: " + p.getArmor());
                    lvlCount++;
                }
                else {
                    int val = lvl3.lose();
                    d.SLE(val, p.getArmor());
                    p.setHealth(p.getHealth() - 40);
                    p.printStats();
                    d.printStats();
                }
            }

            System.out.println();
            System.out.println();
            System.out.println();
        }

        if (d.getHealth() == 0 || d.getHealth() < 0) {
            d.setBroken(true);
        }

        if (p.getHealth() == 0 || p.getHealth() < 0) {
            p.setDead(true);
        }

        if (d.isBroken() || p.isDead()){
            System.out.println("Oh my... you've lost! It's okay, you won't fail. But, you may need to review some Coursera vocab!");
        }

        if (lvlCount == 4){
            System.out.println("YAYYY YOU WONNN WE DID ITTTTTTTTTTTTTTTTTTTTTTTTTTTTT HAVE FUN GRADUATING");
        }

        System.out.println("THE END.");
        
    }
}

