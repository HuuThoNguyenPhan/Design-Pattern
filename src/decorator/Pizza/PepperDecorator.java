package decorator.Pizza;

public class PepperDecorator extends PizzaDecorator{
    public PepperDecorator(pizza mPizza) {
        super(mPizza);
    }

    @Override
    public String doPizza() {
        return super.doPizza();
    }
}
