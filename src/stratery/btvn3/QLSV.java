package stratery.btvn3;

import java.util.ArrayList;
import java.util.List;

public class QLSV {
    public void setSoSanh(ISoSanh soSanh) {
        this.soSanh = soSanh;
    }

    ISoSanh<SinhVien> soSanh;
    QLSV qlsv;
    List<SinhVien> svs = new ArrayList<>();

    public void sapXep() {
        svs.sort((o1, o2) -> {
            return soSanh.soSanh(o1,o2);
        });
    }

//    public void sapXep() {
//        for (int i = 0; i < svs.size() - 1; i++){
//            for (int j = i+1; j < svs.size(); j++){
//                if(soSanh.soSanh(svs.get(i), svs.get(j))==1)
//                {
//                    SinhVien tmp = svs.get(i);
//                    svs.set(i, svs.get(j));
//                    svs.set(j,tmp);
//                }
//            }
//        }
//    }




    public void inDS() {

        for (SinhVien i: svs){
            System.out.println(i.toString());
        }
    }

}
