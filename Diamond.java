public class Diamond {
    private int assetVal;
    private int exposureVal;
    private int health;
    private boolean broken;

    public Diamond(int v, int e, int h, boolean b) {
        this.assetVal = v;
        this.exposureVal = e;
        this.health = h;
        this.broken = b;
    }

    public void printStats(){
        System.out.println(".+*------------------------------------*+.");
        System.out.println("Here are your asset's current stats: ");
        System.out.println("Asset Value: " + assetVal);
        System.out.println("Exposure Value: " + exposureVal);
        System.out.println("Health: " + health);
        System.out.println("Is Broken: " + broken);
        System.out.println(".+*------------------------------------*+.");
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getAssetVal() {
        return assetVal;
    }

    public void setAssetVal(int assetVal) {
        this.assetVal = assetVal;
    }

    public int getExposureVal() {
        return exposureVal;
    }

    public void setExposureVal(int exposureVal) {
        this.exposureVal = exposureVal;
    }

    public boolean isBroken() {
        return broken;
    }

    public void setBroken(boolean broken) {
        this.broken = broken;
    }
}
