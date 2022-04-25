package decorator.Tinh;

public class Main {
    public static void main(String[] args) {
        BieuThuc b1 = new BieuThucDonGian(6);

        b1 = new Cong(9,b1);

        b1 = new Nhan(2,b1);

        b1 = new Cong(3,b1);

        b1 = new Tru(2,b1);

        b1 = new Chia(2,b1);


        System.out.println(b1.bieuThuc());
        System.out.println(b1.giaTri());


    }
}
