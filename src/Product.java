public class Product {
    private String name;
    private String description;
    private double price;
    private String madeIn;

    public Product(String name, String description, double price, String madeIn) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.madeIn = madeIn;
    }

    public Product() {
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getMadeIn() {
        return madeIn;
    }

    public void setMadeIn(String madeIn) {
        this.madeIn = madeIn;
    }


    @Override
    public String toString() {
        return "Product{" +
                "description='" + description + '\'' +
                ", price=" + price +
                ", madeIn='" + madeIn + '\'' +
                '}';
    }
}
