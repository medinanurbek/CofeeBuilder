package builder;

public interface DrinkAbstractFactory {
    Drink createLatte();
    Drink createCappuccino();
    Drink createAmericano();
}
