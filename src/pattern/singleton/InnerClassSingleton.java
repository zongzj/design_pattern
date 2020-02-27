package pattern.singleton;

/**
 * 静态内部类   推荐
 */
public class InnerClassSingleton {


    public InnerClassSingleton() {
    }
    private static  class  Singleton{
        public static  InnerClassSingleton singleton=new InnerClassSingleton();
    }
    public  static InnerClassSingleton getInstance(){
        return Singleton.singleton;
    }
}
