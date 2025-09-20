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
