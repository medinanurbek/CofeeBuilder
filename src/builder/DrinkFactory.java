package builder;

public class DrinkFactory {
    public static Drink createDrink(String type) {
        return switch (type.toLowerCase()) {
            case "coffee" -> new Coffee.Builder().build();
            case "matcha" -> new Matcha.Builder().build();
            default -> throw new IllegalArgumentException("Unknown drink: " + type);
        };
    }
}
