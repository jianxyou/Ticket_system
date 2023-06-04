public class Section2 implements Section {
    private String name;
    private int price;
    private int position;
    

    public Section2(String name, int price, int position){
        this.name = name;
        this.price = price;
        this.position = position;
    }
    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public int getPosition() {
        return position;
    }

    @Override
    public String getName() {
        return name;
    }
}