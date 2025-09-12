package builder;

public class DrinkDirector {
    public Drink makeLatte(Coffee.Builder builder) {
        return builder.setSize("medium")
                .setMilk(true)
                .setSugar(1)
                .setWhippedCream(false)
                .build();
    }

    public Drink makeCappuccino(Coffee.Builder builder) {
        return builder.setSize("large")
                .setMilk(true)
                .setSugar(2)
                .setWhippedCream(true)
                .build();
    }

    public Drink makeMatchaLatte(Matcha.Builder builder) {
        return builder.setSize("medium")
                .setMilk(true)
                .setSugar(2)
                .setWhippedCream(false)
                .build();
    }
}

