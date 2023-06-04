import java.util.ArrayList;
class ClientView implements Observer {
    private Database database;

    public ClientView(Database database) {
        this.database = database;
        this.database.registerObserver(this); // 将自己注册为观察者
    }

    @Override
    public void update(ArrayList<String> newData) {
        System.out.println("ClientView updated: " + newData);
    }
}