public class PantsWithMoreSize extends ClothesWithSizeAbstract{
    @Override
    SizeSmall chooseSizeSmall() {
        return new PantsWithSizeSmall();
    }

    @Override
    SizeMedium chooseSizeMedium() {
        return new PantsWithSizeMedium();
    }

    @Override
    SizeLarge chooseSizeLarge() {
        return new PantsWithSizeLarge();
    }
}
