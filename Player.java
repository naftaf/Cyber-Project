import java.lang.Object;

public class Player {
    private int health;
    private boolean dead;
    private int armor;

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
}

