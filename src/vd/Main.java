package vd;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Duck duck = new VitTroi();
        duck.setiFly(new FlyNoway());
        duck.setiQuack(new Squack());
        System.out.println(duck.display());

        duck.setiFly(new FlyWithWings());
        System.out.println("\nThay doi hanh vi");
        System.out.println(duck.display());

        duck.setiFly(new FlySlow());
        System.out.println("\nThay doi hanh vi");
        System.out.println(duck.display());

        Duck d2 = new VitXiem();
        d2.setiFly(new FlySlow());
        System.out.println(d2.display());
    }
}
