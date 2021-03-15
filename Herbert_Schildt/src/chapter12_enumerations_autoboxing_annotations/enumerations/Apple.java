package chapter12_enumerations_autoboxing_annotations.enumerations;

public enum Apple {
    Jonathan(10), GoldenDel(20), RedDel(5), Winesap(60), Cortland(40);

    private int price;

    Apple(int p) {
        price = p;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
