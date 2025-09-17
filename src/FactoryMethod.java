
interface DrinkFactory{
    Drink createDrink();
}

class MilkFactory implements DrinkFactory{
    public Drink createDrink(){
        return new Milk();
    }
}

class TeaFactory implements DrinkFactory{
    public Drink createDrink(){
        return new Tea();
    }
}
public class FactoryMethod {
    public static void main(String[] args) {
        DrinkFactory drinkFactory = new MilkFactory();
        Drink drink = drinkFactory.createDrink();
        drink.serve();

        drinkFactory = new TeaFactory();
        drink = drinkFactory.createDrink();
        drink.serve();
    }
}
