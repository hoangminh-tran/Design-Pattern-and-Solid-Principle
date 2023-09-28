public class ClientTest {
    public static void main(String[] args)
    {
        ClothesFactory clothesFactory = new ClothesFactory();
        ClothesWithSizeAbstract chooseShirt = clothesFactory.getSizeOfClothes(ClothesType.SHIRTS);
        chooseShirt.chooseSizeSmall().withSize();
        chooseShirt.chooseSizeMedium().withSize();
        chooseShirt.chooseSizeLarge().withSize();


        ClothesWithSizeAbstract choosePants = clothesFactory.getSizeOfClothes(ClothesType.PANTS);
        choosePants.chooseSizeSmall().withSize();
        choosePants.chooseSizeMedium().withSize();
        choosePants.chooseSizeLarge().withSize();
    }
}
