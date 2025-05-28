public class Diamond {
    private int assetVal;
    private int exposureVal;
    private boolean broken;

    public Diamond(int v, int e, boolean b) {
        this.assetVal = v;
        this.exposureVal = e;
        this.broken = b;
    }

    public void printStats(){
        System.out.println(".+*------------------------------------*+.");
        System.out.println("Here are your asset's current stats: ");
        System.out.println("Asset Value: " + assetVal);
        System.out.println("Exposure Value: " + exposureVal);
        System.out.println("Is Broken: " + broken);
        System.out.println(".+*------------------------------------*+.");
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
