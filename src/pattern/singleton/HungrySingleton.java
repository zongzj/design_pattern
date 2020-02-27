package pattern.singleton;

/**
 * 饿汉式
 */
public class HungrySingleton {
    private static HungrySingleton singleton=new HungrySingleton();

    public HungrySingleton() {
    }
    public static HungrySingleton instence(){
        return singleton;
    }
}
