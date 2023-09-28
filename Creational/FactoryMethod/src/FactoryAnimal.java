public class FactoryAnimal {
    public FactoryAnimal(){}
    public Animal feedAnimal(AnimalType animalType)
    {
        Animal animal = null;
        switch (animalType)
        {
            case CAT:
                animal =  new CatAnimal();
                break;
            case DOG:
                animal =  new DogAnimal();
                break;
            case LION:
                animal = new LionAnimal();
                break;
            case TIGER:
                animal = new TigerAnimal();
                break;
        }
        return animal;
    }
}
