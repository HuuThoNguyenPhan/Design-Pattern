package decorator.Tinh;

public class Tru extends BieuThucDecorator{
    public Tru(float toanHang, BieuThuc bieuThuc) {
        super(toanHang, bieuThuc);
    }

    @Override
    public float giaTri() {
        return bieuThuc.giaTri() - toanHang;
    }

    @Override
    public String bieuThuc() {
        return bieuThuc.bieuThuc() + " - " + toanHang;
    }
}
