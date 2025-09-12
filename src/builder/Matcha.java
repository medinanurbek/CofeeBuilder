package builder;

public class Matcha implements Drink {
    private final String size;
    private final boolean hasMilk;
    private final int sugarSpoons;
    private final boolean hasWhippedCream;

    private Matcha(String size, boolean hasMilk, int sugarSpoons, boolean hasWhippedCream) {
        this.size = size;
        this.hasMilk = hasMilk;
        this.sugarSpoons = sugarSpoons;
        this.hasWhippedCream = hasWhippedCream;
    }

    @Override
    public String getName() { return "Matcha"; }
    @Override
    public String getSize() { return size; }
    @Override
    public boolean hasMilk() { return hasMilk; }
    @Override
    public int getSugarSpoons() { return sugarSpoons; }
    @Override
    public boolean hasWhippedCream() { return hasWhippedCream; }

    @Override
    public String toString() {
        return getName() + '[' +
                "size = " + size +
                ", milk = " + hasMilk +
                ", sugar = " + sugarSpoons +
                ", whippedCream = " + hasWhippedCream +
                ']';
    }

    // Builder
    public static class Builder implements DrinkBuilder {
        private String size = "medium";
        private boolean hasMilk = true; // у матчи обычно идёт молоко по умолчанию
        private int sugarSpoons = 1;
        private boolean hasWhippedCream = false;

        @Override
        public Builder setSize(String size) {
            this.size = size;
            return this;
        }

        @Override
        public Builder setMilk(boolean hasMilk) {
            this.hasMilk = hasMilk;
            return this;
        }

        @Override
        public Builder setSugar(int spoons) {
            this.sugarSpoons = spoons;
            return this;
        }

        @Override
        public Builder setWhippedCream(boolean hasWhippedCream) {
            this.hasWhippedCream = hasWhippedCream;
            return this;
        }

        @Override
        public Drink build() {
            return new Matcha(size, hasMilk, sugarSpoons, hasWhippedCream);
        }
    }
}
