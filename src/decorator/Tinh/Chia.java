package decorator.Tinh;

public class Chia extends BieuThucDecorator{
    public Chia(float toanHang, BieuThuc bieuThuc) {
        super(toanHang, bieuThuc);
    }

    @Override
    public float giaTri() {
        return bieuThuc.giaTri() / toanHang;
    }

    @Override
    public String bieuThuc() {
        return "( " + bieuThuc.bieuThuc() + ") / " + toanHang;
    }
}
