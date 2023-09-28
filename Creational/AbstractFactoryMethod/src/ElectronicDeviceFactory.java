public class ElectronicDeviceFactory {
    public ElectronicDeviceFactory(){}

    public static ElectronicDeviceAbstractFactory getDevice(Segment segment)
    {
        switch (segment)
        {
            case HIGH_END:
                return new HighEndElectronicDevice();
            case MID_RANGE:
                return new MidRangeElectronicDevice();
            default:
                throw new UnsupportedOperationException("This device unsupported");
        }
    }
}
