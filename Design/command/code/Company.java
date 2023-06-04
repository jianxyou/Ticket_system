// 接收者
public class Company {
    private String code;

    public Company(String code) {
        this.code = code;
    }

    public void create() {
        System.out.println("Airport created: "+ code);
    }

    public void update() {
        System.out.println("Airport updated: "+ code);
    }

    public void delete() {
        System.out.println("Airport deleted: "+ code);
    }
}