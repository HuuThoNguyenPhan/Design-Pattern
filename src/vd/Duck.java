package vd;

public abstract class Duck {

    IFly iFly;
    IQuack iQuack;

    public abstract String display();

    String performFly() {
        return iFly.fly();
    }
    String performQuack() {
        return iQuack.quack();
    }
    String swim(){
        return "Gap ho nuoc em bi ba bi bom";
    }

    public IFly getiFly() {
        return iFly;
    }

    public void setiFly(IFly iFly) {
        this.iFly = iFly;
    }

    public IQuack getiQuack() {
        return iQuack;
    }

    public void setiQuack(IQuack iQuack) {
        this.iQuack = iQuack;
    }

}
