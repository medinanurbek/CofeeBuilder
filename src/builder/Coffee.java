package builder;

public class Coffee implements Drink {
    private final String size;
    private final boolean hasMilk;
    private final int sugarSpoons;
    private final boolean hasWhippedCream;

    private Coffee(String size, boolean hasMilk, int sugarSpoons, boolean hasWhippedCream) {
        this.size = size;
        this.hasMilk = hasMilk;
        this.sugarSpoons = sugarSpoons;
        this.hasWhippedCream = hasWhippedCream;
    }

    @Override
    public String getName() { return "Coffee"; }
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
        private boolean hasMilk = false;
        private int sugarSpoons = 0;
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
            return new Coffee(size, hasMilk, sugarSpoons, hasWhippedCream);
        }
    }
}
