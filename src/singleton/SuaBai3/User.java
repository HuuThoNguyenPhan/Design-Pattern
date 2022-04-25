package singleton.SuaBai3;

public class User {
    String name;

    public User(String name){
        this.name = name;
    }

    public void vote(Candidate candidate){
        Election e = Election.getInstance();
        e.Vote(candidate, this);
    }
}
