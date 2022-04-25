package stratery.btvn1;

public class context {

    private ITinh tinhToan;


    public void setTinhToan(ITinh tinhToanh) {
        this.tinhToan = tinhToanh;
    }

    public float tinhToan(float a, float b) {
        return tinhToan.tinh(a,b);
    }

}
