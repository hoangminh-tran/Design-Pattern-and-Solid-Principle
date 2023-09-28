public class Main {
    public static void main(String[] args) {
//        EagerInitialization instance1 = EagerInitialization.getInstance();
//        instance1.setName("Test Singleton");
//        System.out.println(instance1.getName());
//
//        EagerInitialization instance2 = EagerInitialization.getInstance();
//        System.out.println(instance2.getName());
        LazyInitialization lazyInitialization = LazyInitialization.getInstance();
        lazyInitialization.setName("Test Lazy Initialization");
        System.out.println(lazyInitialization.getName());

        LazyInitialization lazyInitialization1 = LazyInitialization.getInstance();
        System.out.println(lazyInitialization1.getName());
    }
}