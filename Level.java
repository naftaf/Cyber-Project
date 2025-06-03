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

    public void printAnswers(String a1, String a2, String a3){
        System.out.println("1) " + a1);
        System.out.println("2) " + a2);
        System.out.println("3) " + a3);
    }

    public void attack(){
        String a1 = "";
        String a2 = "";
        String a3 = "";
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
