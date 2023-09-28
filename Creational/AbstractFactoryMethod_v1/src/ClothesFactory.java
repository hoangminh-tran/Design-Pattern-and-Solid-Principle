public class ClothesFactory {
    public ClothesFactory(){}

    public ClothesWithSizeAbstract getSizeOfClothes(ClothesType clothesType)
    {
        switch (clothesType)
        {
            case PANTS:
                return new PantsWithMoreSize();
            case SHIRTS:
                return new ShirtsWithMoreSize();
            case JACKETS:
                return new JacketsWithMoreSize();
            default:
                throw new UnsupportedOperationException("This Clothes is not have Size");
        }
    }
}
