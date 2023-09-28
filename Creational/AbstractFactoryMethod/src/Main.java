public class Main {
    public static void main(String[] args) {
        ElectronicDeviceFactory electronicDeviceFactory = new ElectronicDeviceFactory();
        ElectronicDeviceAbstractFactory device = electronicDeviceFactory.getDevice(Segment.MID_RANGE);
        device.createLaptop().doSegments();
        device.createPhone().doSegments();
    }
}