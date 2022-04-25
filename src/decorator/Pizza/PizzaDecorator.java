package decorator.Pizza;

public class PizzaDecorator extends pizza{
    protected pizza mPizza;

    public PizzaDecorator(pizza mPizza) {
        this.mPizza = mPizza;
    }

    @Override
    public String doPizza() {
        return null;
    }
}
