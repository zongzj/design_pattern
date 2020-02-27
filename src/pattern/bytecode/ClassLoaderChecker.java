package pattern.bytecode;

public class ClassLoaderChecker {
    public static void main(String[] args) {
        MyClassLoad m=new MyClassLoad("C:\\Users\\zzj\\Documents\\","myClass");
        try {
            Class c=m.findClass("Wall");
            System.out.println(c.getClassLoader());
            c.newInstance();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }

    }
}
