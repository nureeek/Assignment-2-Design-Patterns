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
