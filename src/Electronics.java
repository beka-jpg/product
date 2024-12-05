public class Electronics extends Product{
    private String brand;
    private String color;
    private boolean isNew;
    private int memory;

    public Electronics(String name, String description, double price, String madeIn, String brand, String color, boolean isNew, int memory) {
        super(name, description, price, madeIn);
        this.brand = brand;
        this.color = color;
        this.isNew = isNew;
        this.memory = memory;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isNew() {
        return isNew;
    }

    public void setNew(boolean aNew) {
        isNew = aNew;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }


    @Override
    public String toString() {
        return "Electronics{" +
                super.toString() +
                "brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                ", isNew=" + isNew +
                ", memory=" + memory +
                '}';
    }
}
