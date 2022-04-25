package decorator.Tinh;

public class Nhan extends BieuThucDecorator{

    public Nhan(float toanHang, BieuThuc bieuThuc) {
        super(toanHang, bieuThuc);
    }

    @Override
    public float giaTri() {
        return bieuThuc.giaTri() * toanHang;
    }

    @Override
    public String bieuThuc() {
        return "(" + bieuThuc.bieuThuc() + ")* " + toanHang;
    }
}
