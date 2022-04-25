package builderpatterm.TourDuLich;

import java.util.ArrayList;
import java.util.List;

public class Tour {
    private static Tour instance;

    private Tour() {
    }

    String Ten;
    List<DiaDiem> DiaDiems = new ArrayList<>();
    double Gia;
    String ThoiGian;

    public Tour(Builder builder) {
        this.Ten=builder.Ten;
        this.DiaDiems=builder.DiaDiems;
        this.Gia=builder.Gia;
        this.ThoiGian=builder.ThoiGian;
    }



    public void hienThi(){
        System.out.println("Ten tour du lịch"+Ten);
        System.out.println("Danh sách địa điểm tham quan:");
        DiaDiems.forEach(DiaDiem -> System.out.println(DiaDiem.toString()));
        System.out.println("Giá tour du lịch "+Gia);
        System.out.println("Thời gian Tour du lịch "+ThoiGian);
    }

    public static class Builder{
        String Ten;
        List<DiaDiem> DiaDiems = new ArrayList<>();
        double Gia;
        String ThoiGian;

        Builder addTen(String Ten){
            this.Ten = Ten;
            return this;
        }

        Builder addDiadiem(String tenDD){
            this.DiaDiems.add(new DiaDiem(tenDD));
            return this;
        }

        Builder addGia(double Gia){
            this.Gia = Gia;
            return this;
        }

        Builder addThoiGian(String ThoiGian){
            this.ThoiGian = ThoiGian;
            return this;
        }

        public Tour build(){
            if (instance == null)
                instance = new Tour(this);
            return instance;
        }

    }
}
