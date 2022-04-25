package builderpatterm.baitap1;

import java.time.LocalDate;

public class HoaDonHeader {
    String MHD;
    String tenKhachHang;
    LocalDate ngayBan;

    public HoaDonHeader(String MHD, String tenKhachHang, LocalDate ngayBan) {
        this.MHD = MHD;
        this.tenKhachHang = tenKhachHang;
        this.ngayBan = ngayBan;
    }

    @Override
    public String toString() {
        return "HoaDonHeader{" +
                "MHD='" + MHD + '\'' +
                ", tenKhachHang='" + tenKhachHang + '\'' +
                ", ngayBan=" + ngayBan +
                '}';
    }
}
