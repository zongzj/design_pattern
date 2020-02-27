package pattern.singleton;

/**
 * 懒汉式
 */
public class LazySIngleton {
    private static LazySIngleton ingleton = null;

    public LazySIngleton() {
    }

    public static LazySIngleton getInstance() {
        if (ingleton == null) {
            ingleton = new LazySIngleton();
        }
        return ingleton;
    }
}
