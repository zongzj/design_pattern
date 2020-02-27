package pattern.observer;

import pattern.reflect.User;

public class TestObserver {
    public static void main(String[] args) {
        WeChatServer server=new WeChatServer();
        WeChatUser observer1=new WeChatUser();
        WeChatUser observer2=new WeChatUser();
        observer1.name="李白";
        observer2.name="李黑";
        server.registerObserver(observer1);
        server.registerObserver(observer2);
        server.setNotify("大家都到村东头来开会");//
    }
}
