public class HighEndElectronicDevice extends ElectronicDeviceAbstractFactory{
    @Override
    Laptop createLaptop() {
        return new HighEndLaptop();
    }

    @Override
    Phone createPhone() {
        return new HighEndPhone();
    }
}
