package stratery.btvn3;

import java.util.Calendar;

public class Main {

    public static void main(String[] args) {
        Calendar c1 = Calendar.getInstance();
        Calendar c2 = Calendar.getInstance();
        Calendar c3 = Calendar.getInstance();
        c1.set(1900, Calendar.MARCH,3);
        c2.set(1888,Calendar.FEBRUARY,7);
        c3.set(1888,Calendar.APRIL,7);

        QLSV ql = new QLSV();
        ql.svs.add(new SinhVien("Y", c1.getTime(),(float) 9.5));
        ql.svs.add(new SinhVien("Tho", c2.getTime(),(float)6.0));
        ql.svs.add(new SinhVien("Chi", c3.getTime(), (float) 7.3));

        ql.setSoSanh(new SoSanhTheoDiem());
        ql.sapXep();
        System.out.println("\n--------So sanh theo diem--------");
        ql.inDS();

        ql.setSoSanh(new SoSanhTheoTen());
        ql.sapXep();
        System.out.println("\n--------So sanh theo ten--------");
        ql.inDS();

        ql.setSoSanh(new SoSanhTheoDate());
        ql.sapXep();;
        System.out.println("\n--------So sanh theo date--------");
        ql.inDS();
    }

}