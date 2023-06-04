public enum Unit {
    PORT(1),
    COMPANY(2),
    ROUTE(3);

    private int value;

    private Unit(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}