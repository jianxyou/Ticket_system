import java.util.ArrayList;
class AdminView implements Observer {
    private Database database;

    public AdminView(Database database) {
        this.database = database;
        this.database.registerObserver(this); // 将自己注册为观察者
    }

    // 更新视图
    public void update(ArrayList<String> newData) {
        System.out.println("AdminView updated: " + newData);
    }
}