package decorator.Tinh;

public class BieuThucDonGian extends BieuThuc{


    public BieuThucDonGian(float toanHang) {
        super(toanHang);
    }

    @Override
    public float giaTri() {
        return this.toanHang;
    }

    @Override
    public String bieuThuc() {
        return Float.toString(this.toanHang);
    }
}
