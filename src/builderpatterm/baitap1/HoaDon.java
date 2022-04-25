package builderpatterm.baitap1;
import java.time.LocalDate;
import java.util.ArrayList;

public class HoaDon {
    HoaDonHeader hoaDonHeader;
    ArrayList<CTHD> cthds = new ArrayList<CTHD>();

    public HoaDon(Builder builder){
        this.hoaDonHeader = builder.hoaDonHeader;
        this.cthds = builder.cthds;
    }

    public void hienThi(){
        System.out.println(hoaDonHeader.toString());
        cthds.forEach(cthd -> System.out.println(cthd.toString()));
    }

    public static class Builder{
        HoaDonHeader hoaDonHeader;
        ArrayList<CTHD> cthds = new ArrayList<CTHD>();

        Builder addHoaDonHeader(String MHD, String tenKhachHang, LocalDate ngayBan){
            this.hoaDonHeader = new HoaDonHeader(MHD,tenKhachHang,ngayBan);
            return this;
        }

        Builder addCTHD(String sanPham, int soLuong, double donGia, float chietKhau){
            this.cthds.add(new CTHD(sanPham,soLuong,donGia,chietKhau));
            return this;
        }

        public HoaDon build(){
            return new HoaDon(this);
        }
 ;   }
}
