package stratery.btvn2;

public class ThanhToanOline implements IThanhToan {
    @Override
    public double thanhToan(int tienHang) {
        if(tienHang < 1000000)
        {
            return tienHang * 0.95;
        }
        else {
            return tienHang * 0.93;
        }
    }
}
