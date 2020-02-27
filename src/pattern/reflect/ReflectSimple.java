package pattern.reflect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectSimple {

    public static void main(String[] args) {
        try {
            Class c = Class.forName("D:\\workother\\DesignPattern\\app\\src\\main\\java\\test\\pattern\\reflect\\User.java");
            User user = (User) c.newInstance();
            Method m = c.getDeclaredMethod("eat");
            m.setAccessible(true);
            Object o = m.invoke(user);
            System.out.println("class name  is:"+c.getName());
            System.out.println(o.toString());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
