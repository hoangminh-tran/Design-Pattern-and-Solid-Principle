public class DoubleCheckLocking {
    private static volatile DoubleCheckLocking instance;

    private DoubleCheckLocking(){

    }

    public static DoubleCheckLocking getInstance()
    {
        if(instance == null)
        {
            // luồng hiện tại sẽ vào một block
            // synchronized (DoubleCheckLocking.class) để đảm bảo rằng chỉ có một luồng duy nhất được phép tiến hành tạo ra thể hiện mới.
            synchronized (DoubleCheckLocking.class) {
                if (instance == null) //Trong block synchronized, kiểm tra instance một lần nữa bên trong,
                    // bởi vì có thể đã có một luồng khác đã tạo thể hiện trong thời gian chờ.
                    // Nếu instance vẫn là null, thì nó tạo ra thể hiện mới và gán nó cho biến instance.
                {
                    instance = new DoubleCheckLocking();
                }
            }
        }
        return instance;
    }
}
