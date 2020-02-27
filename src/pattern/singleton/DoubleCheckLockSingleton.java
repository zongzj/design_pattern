package pattern.singleton;

/**
 *双重校验锁 ,推荐
 */
public class DoubleCheckLockSingleton {
    private static DoubleCheckLockSingleton singleton=new DoubleCheckLockSingleton();

    public DoubleCheckLockSingleton() {
    }

    public static  DoubleCheckLockSingleton getInstance() {
        if (singleton==null){
            synchronized (DoubleCheckLockSingleton.class){
                if (singleton==null){
                    singleton=new DoubleCheckLockSingleton();
                }
            }
        }
        return singleton;
    }
}
