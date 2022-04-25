package builderpatterm.TourDuLich;

public class Main {
    public static void main(String[] args) {
        Tour t = new Tour.Builder()
                .addTen("Nha Trang")
                .addDiadiem("Hòn chồng")
                .addDiadiem("Tháp Bà")
                .addGia(100000d)
                .addThoiGian("14 tháng 5")
                .build();
        t.hienThi();

    }
}
