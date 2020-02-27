package pattern.factory.simple;

public class CarFactory {
    public static ICar create(String carName) {
        if (carName.equals("a")) {
            return new CarA();
        } else if (carName.equals("b")) {
            return new CarB();
        }
        return null;
    }
}
