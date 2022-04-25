package decorator.Tinh;

public abstract class BieuThucDecorator extends BieuThuc{
    BieuThuc bieuThuc;

    public BieuThucDecorator(float toanHang, BieuThuc bieuThuc) {
        super(toanHang);
        this.bieuThuc = bieuThuc;
    }

}
