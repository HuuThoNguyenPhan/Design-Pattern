package singleton.Bai4;

public class Election {
    private static Election instance;
    private int Trump = 0;
    private int Biden = 0;

    private Election(){}
    public static Election createInstance() {
        if( instance == null ) instance = new Election();
        return instance;
    }

    public int getTrump() {
        return Trump;
    }

    public void setTrump(int trump) {
        Trump = trump;
    }

    public int getBiden() {
        return Biden;
    }

    public void setBiden(int biden) {
        Biden = biden;
    }

    public void xemPhieu(){
        System.out.println("Số phiếu của Donal Trump: " + Trump);
        System.out.println("Sô phiểu của Joe Biden: " + Biden);
    }
}
