package builder;

public class Main {
    public static void main(String[] args){
        DrinkDirector director = new DrinkDirector();

        Drink Latte = director.makeLatte(new Coffee.Builder());
        Drink cappuccino = director.makeCappuccino(new Coffee.Builder());
        Drink matchaLatte = director.makeMatchaLatte(new Matcha.Builder());
        Drink Americano = director.makeAmericano(new Coffee.Builder());

        System.out.println("Latte: " + Latte);
        System.out.println("Cappuccino: " + cappuccino);
        System.out.println("MatchaLatte: " + matchaLatte);
        System.out.println("Americano: " + Americano);
        System.out.println(Latte.getSize());
    }
}
