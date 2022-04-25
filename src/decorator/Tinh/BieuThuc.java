package decorator.Tinh;

public abstract class BieuThuc {
    float toanHang;

    public BieuThuc(float toanHang) {
        this.toanHang = toanHang;
    }

    public float getToanHang() {
        return toanHang;
    }

    public abstract float giaTri();
    public abstract String bieuThuc();
}
