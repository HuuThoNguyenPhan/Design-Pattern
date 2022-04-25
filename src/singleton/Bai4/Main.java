package singleton.Bai4;

public class Main {
    public static void main(String[] args) {
        User Tho = new User("Tho");
        User Y = new User("Y");
        Tho.Vote(UngVien.DonalTrump);
        Y.Vote(UngVien.DonalTrump);
        Y.Vote(UngVien.JoeBiden);
        Election coiphieu = Election.createInstance();
        coiphieu.xemPhieu();
    }
}
