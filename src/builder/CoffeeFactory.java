package builder;

public class CoffeeFactory implements DrinkAbstractFactory {
    @Override
    public Drink createLatte() {
        return new Coffee.Builder().setSize("medium").setMilk(true).setSugar(1).build();
    }

    @Override
    public Drink createCappuccino() {
        return new Coffee.Builder().setSize("large").setMilk(true).setSugar(2).setWhippedCream(true).build();
    }

    @Override
    public Drink createAmericano() {
        return new Coffee.Builder().setSize("large").setMilk(false).setSugar(0).build();
    }
}
