public class Main {
    public static void main(String[] args) {
        System.out.println("Factory");
        DrinkFactory drinkFactory = new MilkFactory();
        Drink drink = drinkFactory.createDrink();
        drink.serve();

        drinkFactory = new TeaFactory();
        drink = drinkFactory.createDrink();
        drink.serve();

        System.out.println("Abstract");

        CafeFactory cafeFactory=new ItalianCafeFactory();
        Drink ItalianDrink = cafeFactory.createDrink();
        Dessert ItalianDessert = cafeFactory.createDessert();
        ItalianDrink.serve();
        ItalianDessert.eat();

        cafeFactory=new EnglishCafeFactory();
        Drink EnglishDrink = cafeFactory.createDrink();
        Dessert EnglishDessert = cafeFactory.createDessert();
        EnglishDrink.serve();
        EnglishDessert.eat();
    }
}
