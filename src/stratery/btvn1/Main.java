package stratery.btvn1;

public class Main {
    public static void main(String[] args) {
        context c = new context();

        c.setTinhToan(new Cong());
        System.out.println(c.tinhToan(75,12));

        c.setTinhToan(new Tru());
        System.out.println(c.tinhToan(51,78));
    }
}
