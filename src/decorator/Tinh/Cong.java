package decorator.Tinh;

public class Cong extends BieuThucDecorator{


    public Cong(float toanHang, BieuThuc bieuThuc) {
        super(toanHang, bieuThuc);
    }

    @Override
    public float giaTri() {
        return bieuThuc.giaTri() + toanHang ;
    }

    @Override
    public String bieuThuc() {
        return bieuThuc.bieuThuc() + " + " + toanHang ;
    }
}
