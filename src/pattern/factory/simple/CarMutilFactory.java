package pattern.factory.simple;

/**
 * 多个工厂方法模式、 静态方法模式
 */
public class CarMutilFactory {
    public static ICar createCarA() {
        System.out.println("多方法A车");
        return new CarA();
    }

    public static ICar createCarB() {
        System.out.println("多方法B车");
        return new CarB();
    }
}
