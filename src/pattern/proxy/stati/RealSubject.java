package pattern.proxy.stati;

public class RealSubject implements  Subject {
    @Override
    public void doSomething() {
        System.out.println("做事的人");
    }
}
