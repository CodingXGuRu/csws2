
public class laptop {
    private String model;
    private double price;

    public laptop(String model, double price) {
        this.model = model;
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return ("Laptop model: " + this.model + " costs " + this.price + " Rs.");
    }
}

public class laptop {
    public static void main(String[] args) {
        Laptop laptop1 = new Laptop("ss", 1111.5);
        Laptop laptop2 = new Laptop("acer", 23232.7);

        System.out.println(laptop1.toString());
        System.out.println(laptop2.toString());
    }
}
