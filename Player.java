import java.lang.Object;

public class Player {
    private String name;
    private int health;
    private boolean dead;
    private int armor;
    
    public Player(String n, int h, boolean d, int a){
        this.name = n;
        this.health = h;
        this.dead = d;
        this.armor = a;
    }

    public void setName(String n){
        name = n;
    }
    public void setHealth(int h){
        health = h;
    }

    public void setArmor(int a){
        armor = a;
    }
    
    public void setDead(boolean b){
        dead = b;
    }


    public boolean isDead(){
        return dead;
    }

    public int getArmor(){
        return armor;
    }

    public int getHealth(){
        return health;
    }

    public void printStats(){
        System.out.println(".+*------------------------------------*+.");
        System.out.println("Here are your current stats, " + name + ": ");
        System.out.println("Health: " + getHealth());
        System.out.println("Armor: " + getArmor());
        System.out.println("Is Dead: " + isDead());
        System.out.println(".+*------------------------------------*+.");
    }
}

