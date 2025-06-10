class Customer {
    protected int cost;
    protected String items;

    public void purchaseList() {
        cost = 40;
        items = "Tomatoes";
    }
}

public class Mart extends Customer {
    protected int cost;
    protected String items;

    public void billing() {
        cost = 30;
        items = "Onions";
    }

    public void display() {
        System.out.println(this.items);
        System.out.println(this.cost);
        System.out.println("%%%%%%%%%%%%%%");
        System.out.println(super.items);
        System.out.println(super.cost);
    }

    public static void main(String[] args) {
        Mart m = new Mart();
        m.purchaseList();
        m.billing();
        m.display();
    }
}
