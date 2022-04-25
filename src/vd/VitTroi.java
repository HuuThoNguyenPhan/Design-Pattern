package vd;

public class VitTroi extends Duck{

    @Override
    public String display() {
        return "Em la vit troi\n"
                + "Bay: " + performFly()
                + "\nBoi: " + swim()
                + "\nkeu: " + performQuack();
    }
}
