package builder;

public interface DrinkBuilder {
    DrinkBuilder setSize(String size);
    DrinkBuilder setMilk(boolean hasMilk);
    DrinkBuilder setSugar(int spoons);
    DrinkBuilder setWhippedCream(boolean hasWhippedCream);
    Drink build();
}
