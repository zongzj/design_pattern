package pattern.proxy.stati;

public class Proxy implements Subject {

    RealSubject  realSubject=new RealSubject();

    @Override
    public void doSomething() {//代理人把事情交给做事的人
        realSubject.doSomething();
    }
}
