public class Main {
    public static void main(String[] args) {
        FactoryAnimal factoryAnimal = new FactoryAnimal();
        Animal animal = factoryAnimal.feedAnimal(AnimalType.CAT);
        animal.eatSomething();
    }
}