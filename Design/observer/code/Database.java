import java.util.ArrayList;
class Database {
    private ArrayList<String> data;
    private ArrayList<Observer> observers;

    public Database(){
        data = new ArrayList<>(); // 存储的数据
        observers = new ArrayList<>(); // 观察者列表

    }

    // 取消注册观察者
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    // 通知所有的观察者进行更新
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(data);
        }

    }
    public void registerObserver(Observer obs) {
        observers.add(obs);

    }

    // 添加数据并通知观察者
    public void addData(String newData) {
        data.add(newData);
        notifyObservers();
    }

    // 获取数据
    public ArrayList<String> getData() {
        return data;
    }
}