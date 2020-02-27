package pattern.factory.simple;

public class CarTest {
    public static void main(String[] args) {
        CarFactory.create("a").run();
        CarFactory.create("b").run();
        CarMutilFactory.createCarA();
        CarMutilFactory.createCarB();
    }
}
