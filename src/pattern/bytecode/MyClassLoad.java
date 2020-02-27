package pattern.bytecode;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class MyClassLoad extends ClassLoader {
    private String path;
    private String classLoadName;

    public MyClassLoad(String path, String classLoadName) {
        this.path = path;
        this.classLoadName = classLoadName;
    }

    /**
     * 寻找类
     * @param name
     * @return
     * @throws ClassNotFoundException
     */
    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        byte[] b=loadClassData(name);
        return defineClass(name,b,0,b.length);
    }

    private byte[] loadClassData(String name) {
        name=path+name+".class";
        InputStream in=null;
        ByteArrayOutputStream out=null;
        try {
            in=new FileInputStream(new File(name));
            out=new ByteArrayOutputStream();
            int i=0;
            while ((i=in.read())!=-1){
                out.write(i);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally {

            try {
                in.close();
                out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        return out.toByteArray();
    }
}
