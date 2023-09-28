public class ShirtsWithMoreSize extends ClothesWithSizeAbstract{
    @Override
    SizeSmall chooseSizeSmall() {
        return new ShirtsWithSizeSmall();
    }

    @Override
    SizeMedium chooseSizeMedium() {
        return new ShirtsWithSizeMedium();
    }

    @Override
    SizeLarge chooseSizeLarge() {
        return new ShirtsWithSizeLarge();
    }
}
