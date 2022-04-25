package singleton.Bai4;

public class User {
    private String name;
    private boolean check = false;
    public User(String name) {
        this.name = name;
    }

    public void Vote(UngVien u){
       if(!check){
           Election e = Election.createInstance();
           check = true;
           if(u==UngVien.JoeBiden)
           {
               e.setBiden(e.getBiden()+1);
           }
           else if (u==UngVien.DonalTrump)
           {
               e.setTrump(e.getTrump()+1);
           }
           else
           {
               System.out.println("lỗi!!!");
           }
       }
       else {
           System.out.println(name + " chỉ vote một lần và một người thôi! ");
       }
    }

}
