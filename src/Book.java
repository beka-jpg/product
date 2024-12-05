public class Book extends Product {
    private String authorFullName;

    public Book(String name, String description, double price, String madeIn, String authorFullName) {
        super(name, description, price, madeIn);
        this.authorFullName = authorFullName;
    }

    public Book() {

    }


    public String getAuthorFullName() {
        return authorFullName;
    }

    public void setAuthorFullName(String authorFullName) {
        this.authorFullName = authorFullName;
    }


    @Override
    public String toString() {
        return "Book{" +
                super.toString() +
                "authorFullName='" + authorFullName + '\'' +
                '}';
    }
}
