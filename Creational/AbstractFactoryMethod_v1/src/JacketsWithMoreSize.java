public class JacketsWithMoreSize extends ClothesWithSizeAbstract{
    @Override
    SizeSmall chooseSizeSmall() {
        return new JacketsWithSizeSmall();
    }

    @Override
    SizeMedium chooseSizeMedium() {
        return new JacketsWithSizeMedium();
    }

    @Override
    SizeLarge chooseSizeLarge() {
        return new JacketsWithSizeLarge();
    }
}
