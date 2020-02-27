package pattern.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 Java动态代理的优势是实现无侵入式的代码扩展，也就是方法的增强；让你可以在不用修改源码的情况下，增强一些方法；在方法的前后你可以做你任何想做的事情（甚至不去执行这个方法就可以）。

 1.动态代理是设计模式中的代理模式：
 定义：为其它对象提供一种代理以控制对这个对象的访问控制；在某些情况下，客户不想或者不能直接引用另一个对象，这时候代理对象可以在客户端和目标对象之间起到中介的作用。

 2.静态代理
 静态代理类：由程序员创建或者由第三方工具生成，再进行编译；在程序运行之前，代理类的.class文件已经存在了。
 静态代理类通常只代理一个类。
 静态代理事先知道要代理的是什么。
 3.动态代理
 动态代理类：在程序运行时，通过反射机制动态生成。
 动态代理类通常代理接口下的所有类。
 动态代理事先不知道要代理的是什么，只有在运行的时候才能确定。
 动态代理的调用处理程序必须事先InvocationHandler接口，及使用Proxy类中的newProxyInstance方法动态的创建代理类。
 Java动态代理只能代理接口，要代理类需要使用第三方的CLIGB等类库。
 ————————————————
 版权声明：本文为CSDN博主「随风yy」的原创文章，遵循 CC 4.0 BY-SA 版权协议，转载请附上原文出处链接及本声明。
 原文链接：https://blog.csdn.net/yaomingyang/article/details/81053130
 */
public class Test {
    public static void main(String[] args) {
        BaseImp baseImp=new BaseImp();
        BaseinterFace baseinterFac= (BaseinterFace) Proxy.newProxyInstance(baseImp.getClass().getClassLoader(),
                baseImp.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        if (method.getName().equals("doSomething")){
                            return method.invoke(baseImp,args);
                        }
                        return null;
                    }
                });
        baseinterFac.doSomething();

    }
}
