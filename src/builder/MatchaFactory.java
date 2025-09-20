package builder;

public class MatchaFactory implements DrinkAbstractFactory {
    @Override
    public Drink createLatte() {
        return new Matcha.Builder().setSize("medium").setMilk(true).setSugar(2).build();
    }

    @Override
    public Drink createCappuccino() {
        throw new UnsupportedOperationException("Cappuccino is not available in Matcha menu");
    }

    @Override
    public Drink createAmericano() {
        throw new UnsupportedOperationException("Americano is not available in Matcha menu");
    }
}

