public class ThreadSafe {
    private static volatile ThreadSafe instance;
    //volatile giúp đảm bảo rằng trạng thái của biến instance luôn được cập nhật và đồng bộ giữa các luồng.
    private ThreadSafe(){

    }
    //synchronized, điều này đồng nghĩa với việc chỉ một luồng có thể thực hiện phương thức này tại một thời điểm,
    // đảm bảo rằng không có hai luồng cùng tạo ra thể hiện mới trong cùng một thời điểm.
    public static synchronized ThreadSafe getInstance()
    {
        if(instance == null)
        {
            instance = new ThreadSafe();
        }
        return instance;
    }
}
