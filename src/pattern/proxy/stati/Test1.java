package pattern.proxy.stati;

//静态代理
public class Test1 {
    public static void main(String[] args) {
        Subject proxy= new Proxy();
        proxy.doSomething();
    }
}
