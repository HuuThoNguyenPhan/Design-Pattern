package stratery.btvn3;

public class SoSanhTheoDate implements ISoSanh<SinhVien>{
    @Override
    public int soSanh(SinhVien o1, SinhVien o2) {
        return o1.getNgaySinh().compareTo(o2.getNgaySinh());
    }
}
