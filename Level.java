public class Level {
    private String name;
    private String attackType;
    private int exposureVal;
    private int correctAnswer;

    public Level(String n, String a, int e, int c){
        this.name = n;
        this.attackType = a;
        this.exposureVal = e;
        this.correctAnswer = c;
    }

    public void attack(){
        String a1 = "1) ";
        String a2 = "2) ";
        String a3 = "3) ";
        if (attackType.equals("Phishing")){
            System.out.println("Now that we're in the mansion... there's a lot of notifications blowing up your phone. You don't have that many friends, so you're really not used to it.");
            System.out.println("Upon checking, you realize you've recieved 3 emails about your disappearance! How considerate.");
            System.out.println("Choose which one to reply to!");
            a1 += "---------------------------------------------------------------------------------------------- \n" +
                    "bestesIinsurance@gmail.com: You HAVE to keep that diamond safe... or else it will be gone by \n" +
                    "tomorrow morning. As your trusted insurance provider, click now to keep it safe. \n" +
                    "----------------------------------------------------------------------------------------------";
            a2 += "---------------------------------------------------------------------------------------------- \n" +
                    "texthelp@geicomail.com: \n" +
                    "Hello, \n" +
                    "\nWe have noticed an unusual lack of activity from your vehicle." +
                    "For this reason, we have paused your insurance payments." +
                    "Please contact your Geico agent to make any changes." +
                    "----------------------------------------------------------------------------------------------";
            a3 += "Bug: taht diamond is soooooooooooo cool -- why dn't you tell me mor?";
        }

        else if (attackType.equals("DoS")){
            System.out.println("We've made it through the entryway... but there's so much going on! We're experiencing a Denial of Service attack -- decide on which defense would me the most effective!");
            a1 += "Invest in configuring a firewall (like Cloudflare or AWS Sheild) that can detect unusual traffic and block malicious requests.";
            a2 += "Manually block every IP that is trying to infiltrate to ensure that you don't miss any.";
            a3 += "Invest in more bandwith to stop attackers by delaying the impact to the point where it doesn't happen.";
        }

        else if (attackType.equals("InsecureWifi")) {
            System.out.println("We're sooooooo close to the exit!!! There's only one more question. It's Wi-Fi themed!! What is a safe way to use Wi-Fi?");
            a1 += "Log into your Social Security account on public wi-fi.";
            a2 += "Make a credit-card transaction on an online retailer in a Coffee Shop.";
            a3 += "Writing an email from your school email address in your dorm room.";
        }
        
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
        System.out.println("----------------------------------------------------------------------------------------");
        System.out.println("Which choice will you pick?! Type in the number: ");
    }

    public boolean isCorrectAnswer(String answer) {
        return answer.trim().equals(Integer.toString(correctAnswer));
    }


    public int lose(){
        System.out.println("You fool! You've lost to the obstacle.. I'm sorry! But,,, your asset will have to pay </3");
        return exposureVal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAttackType() {
        return attackType;
    }

    public void setAttackType(String attackType) {
        this.attackType = attackType;
    }

    public int getExposureVal() {
        return exposureVal;
    }

    public void setExposureVal(int exposureVal) {
        this.exposureVal = exposureVal;
    }

}
