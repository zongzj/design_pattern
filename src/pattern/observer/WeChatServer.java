package pattern.observer;

import java.util.ArrayList;
import java.util.List;

public class WeChatServer implements Observeable {
    private List<Observer> list;
    private String msg="新消息";

    public WeChatServer() {
        this.list = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        list.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        list.remove(observer);

    }

    @Override
    public void notifyObserver() {
        list.forEach(observer ->
                        observer.update(msg)
                );

    }

    public void setNotify(String msg){
        this.msg=msg;
        System.out.println("微信服务发送消息： " + msg);
        notifyObserver();
    }
}
