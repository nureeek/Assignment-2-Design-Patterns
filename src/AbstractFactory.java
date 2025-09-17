interface Dessert{
    void eat();
}

class Cake implements Dessert{
    public void eat(){
        System.out.println("Eating Cake");
    }
}
class Cookie implements Dessert{
    public void eat(){
        System.out.println("Eating Cookie");
    }
}
interface CafeFactory{
    Drink createDrink();
    Dessert createDessert();
}
class ItalianCafeFactory implements CafeFactory{
    public Drink createDrink(){
        return new Milk();
    }
    public Dessert createDessert(){
        return new Cake();
    }
}
class EnglishCafeFactory implements CafeFactory{
    public Drink createDrink(){
        return new Tea();
    }
    public Dessert createDessert(){
        return new Cookie();
    }
}
public class AbstractFactory {
    public static void main(String[] args) {
        CafeFactory factory = new ItalianCafeFactory();
        Drink drink = factory.createDrink();
        Dessert dessert = factory.createDessert();
        drink.serve();
        dessert.eat();

        factory=new EnglishCafeFactory();
        drink = factory.createDrink();
        dessert = factory.createDessert();
        drink.serve();
        dessert.eat();
    }
}
