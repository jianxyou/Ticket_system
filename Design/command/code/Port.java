// 接收者
public class Port {
    private String name;
    private String address;

    public Port(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public void create() {
        System.out.println("Airport created: " + name + " in " + address);
    }

    public void update() {
        System.out.println("Airport updated: " + name + " in " + address);
    }

    public void delete() {
        System.out.println("Airport deleted: " + name + " in " + address);
    }
}