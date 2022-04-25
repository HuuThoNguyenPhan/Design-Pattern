package singleton.SuaBai3;

import java.util.ArrayList;
import java.util.List;

public class Election {
    private static Election instance;

    public int getJoe() {
        return joe;
    }

    public void setJoe(int joe) {
        this.joe = joe;
    }

    public int getDol() {
        return dol;
    }

    public void setDol(int dol) {
        this.dol = dol;
    }

    private int joe, dol = 0;
    List<String> users = new ArrayList<>();

    private Election() {
    }

    public static Election getInstance(){
        if(instance == null)
            instance = new Election();
        return instance;
    }

    public void Vote(Candidate candidate, User user){
        if (users.contains(user.name))
            return;
        if(candidate == Candidate.DonalTrump)
        {
            dol++;
            users.add(user.name);
        }
        else if(candidate == Candidate.JoeBiden)
        {
            joe++;
            users.add(user.name);
        }
    }

}
