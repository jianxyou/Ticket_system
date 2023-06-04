public class Tranportation {
    private Section section;
    
    public Tranportation(Section section) {
        this.section = section;
    }
    
    public void setState(Section section) {
        this.section = section;
    }
    
    public int getPrice() {
        return section.getPrice();
    }
    
    public int getPosition() {
        return section.getPosition();
    }
    
    public String getName() {
        return section.getName();
    }
}
