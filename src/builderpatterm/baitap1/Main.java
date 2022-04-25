package builderpatterm.baitap1;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        HoaDon h = new HoaDon.Builder()
                .addHoaDonHeader("th123","Tho", LocalDate.of(2022,4,2))
                .addCTHD("MSI G63",1,23000000d,0.1f)
                .addCTHD("MSI G62",1,23000000d,0.2f)
                .build();
        h.hienThi();
    }
}
