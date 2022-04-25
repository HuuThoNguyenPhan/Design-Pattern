package decorator.Pizza;

public class CheeseDecorator extends PizzaDecorator{
    public CheeseDecorator(pizza mPizza) {
        super(mPizza);
    }

    @Override
    public String doPizza() {
        return super.doPizza();
    }
}
