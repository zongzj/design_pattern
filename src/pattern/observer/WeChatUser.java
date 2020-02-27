package pattern.observer;

public class WeChatUser implements Observer {
    public String name;
    private String msg;
    @Override
    public void update(String msg) {
        this.msg=msg;
        System.out.println(name+"收到消息   ："+msg);

    }
}
