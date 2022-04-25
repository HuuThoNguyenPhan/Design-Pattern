package singleton.SuaBai3;

public class Main {
    public static void main(String[] args) {
        User u1 = new User("Ngoc Y");
        u1.vote(Candidate.JoeBiden);
        User u2 = new User("Huu Tho");
        u2.vote(Candidate.DonalTrump);
        System.out.println("Trump: " + Election.getInstance().getDol());
        System.out.println("Joe: "+Election.getInstance().getJoe());
    }
}
