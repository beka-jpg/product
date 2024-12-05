import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        User[] users = new User[]{
            new User(
                    "user",
                    "name",
                    "user01@gmail.com",
                    "password01",
                    null
            )
        };

        Product[] products = new Product[10];


        products[0] = new Electronics("Смартфон", "Смартфон с хорошей камерой", 600.0, "Китай", "Samsung", "Черный", true, 128);
        products[1] = new Electronics("Ноутбук", "Мощный ноутбук для работы и игр", 1200.0, "США", "Apple", "Серебристый", true, 512);
        products[2] = new Electronics("Телевизор", "4K UHD телевизор", 800.0, "Южная Корея", "LG", "Черный", false, 0);
        products[3] = new Book("1984", "Антиутопия о тоталитарном обществе", 15.0, "Великобритания", "Джордж Оруэлл");
        products[4] = new Book("Война и мир", "Классический роман", 20.0, "Россия", "Лев Толстой");
        products[5] = new Book("Мастер и Маргарита", "Роман о борьбе добра и зла", 18.0, "Россия", "Михаил Булгаков");
        products[6] = new Electronics("Планшет", "Компактный планшет для работы", 300.0, "Китай", "Xiaomi", "Белый", true, 64);
        products[7] = new Book("Преступление и наказание", "Роман о моральных дилеммах", 22.0, "Россия", "Федор Достоевский");
        products[8] = new Electronics("Умные часы", "Часы с функцией фитнес-трекера", 200.0, "США", "Fitbit", "Синий", true, 16);
        products[9] = new Book("Гарри Поттер", "Фэнтези о магии и приключениях", 25.0, "Великобритания", "Дж. К. Роулинг");

//        for (Product product : products) {
//            System.out.println(product);
//        }

        menu();
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Введите ваше имя");
                String firstNameN = sc.nextLine();
                sc.nextLine();
                System.out.println("Введите ваше фамилию");
                String lastNameN = sc.nextLine();
                System.out.println("Введите ваше емайл");
                String emailN = sc.nextLine();
                System.out.println("Введите ваше пароль");
                String passwordN = sc.nextLine();

                User[] newUsers = Arrays.copyOf(users, users.length + 1);
                newUsers[newUsers.length - 1] = new User(firstNameN, lastNameN, emailN, passwordN, null);

                menuAfterLogin();
                int choiceOfMethod = sc.nextInt();
                switch (choiceOfMethod){
                    case 1:
                        Product[] newProduct = Arrays.copyOf(products, products.length + 1 );
                        System.out.println("Выберите что хотите создать");
                        int indexOfClass = sc.nextInt(); // 1 - electronics, 2 - book ,

                        if (indexOfClass == 1 ){
                            System.out.println("Введите имя ");
                            String nameE = sc.nextLine();
                            sc.nextLine();
                            System.out.println("Введите описание ");
                            String descriptionE = sc.nextLine();
                            System.out.println("Введите цену ");
                            double priceE = sc.nextDouble();
                            sc.nextLine();
                            System.out.println("Введите страну");
                            String madeInE = sc.nextLine();
                            System.out.println("Введите бренд ");
                            String brand = sc.nextLine();
                            System.out.println("Введите цвет ");
                            String color = sc.nextLine();
                            System.out.println("Введите новое ли оно ");
                            boolean isNew = sc.nextBoolean();
                            System.out.println("Введите память ");
                            int memory = sc.nextInt();
                            newProduct[newProduct.length - 1] = new Electronics(nameE, descriptionE, priceE, madeInE, brand, color, isNew, memory);
                            products = newProduct;
                        } else if (indexOfClass == 2 ) {
                            System.out.println("Введите имя ");
                            String nameB = sc.nextLine();
                            System.out.println("Введите описание ");
                            String descriptionB = sc.nextLine();
                            System.out.println("Введите цену ");
                            double priceE = sc.nextDouble();
                            System.out.println("Введите страну ");
                            String madeInE = sc.nextLine();
                            System.out.println(" Введит автора");
                            String authorFullName = sc.nextLine();
                            newProduct[newProduct.length - 1] = new Book(nameB,descriptionB,priceE, madeInE, authorFullName);
                            products = newProduct;
                        }
                        break;
                    case 2:
                            for (Product product : products) {
                                System.out.println(product);
                            }
                        break;
                    case 3:
                        for (Product product : products) {
                            if (product.getClass() == Book.class){
                                System.out.println(product);
                            }
                        }
                        break;
                    case 4:
                        for (Product product : products) {
                            if (product.getClass() == Electronics.class){
                                System.out.println(product);
                            }
                        }
                        break;
                }

                break;
            case 2:
                System.out.println("Введите ваше имя");
                String firstNameO = sc.nextLine();
                sc.nextLine();
                System.out.println("Введите ваше фамилию");
                String lastNameO = sc.nextLine();
                System.out.println("Введите ваше емайл");
                String emailO = sc.nextLine();
                System.out.println("Введите ваше пароль");
                String passwordO = sc.nextLine();

                for (User user : users){
                    if (
                            !user.getFirstName().equals(firstNameO) && !user.getFirstName().equals(lastNameO)
                            && !user.getEmail().equals(emailO) && !user.getPassword().equals(passwordO)
                    ) {
                        System.err.println("Что - то не так ");
                    } else {
                        menuAfterLogin();
                        int choideA = sc.nextInt();
                        switch (choideA){
                            case 1:
                                Product[] newProduct = Arrays.copyOf(products, products.length + 1 );
                                System.out.println("Выберите что хотите создать");
                                int indexOfClass = sc.nextInt(); // 1 - electronics, 2 - book ,

                                if (indexOfClass == 1 ){
                                    System.out.println("Введите имя ");
                                    String nameE = sc.nextLine();
                                    sc.nextLine();
                                    System.out.println("Введите описание ");
                                    String descriptionE = sc.nextLine();
                                    System.out.println("Введите цену ");
                                    double priceE = sc.nextDouble();
                                    sc.nextLine();
                                    System.out.println("Введите страну");
                                    String madeInE = sc.nextLine();
                                    System.out.println("Введите бренд ");
                                    String brand = sc.nextLine();
                                    System.out.println("Введите цвет ");
                                    String color = sc.nextLine();
                                    System.out.println("Введите новое ли оно ");
                                    boolean isNew = sc.nextBoolean();
                                    System.out.println("Введите память ");
                                    int memory = sc.nextInt();
                                    newProduct[newProduct.length - 1] = new Electronics(nameE, descriptionE, priceE, madeInE, brand, color, isNew, memory);
                                    products = newProduct;
                                } else if (indexOfClass == 2 ) {
                                    System.out.println("Введите имя ");
                                    String nameB = sc.nextLine();
                                    System.out.println("Введите описание ");
                                    String descriptionB = sc.nextLine();
                                    System.out.println("Введите цену ");
                                    double priceE = sc.nextDouble();
                                    System.out.println("Введите страну ");
                                    String madeInE = sc.nextLine();
                                    System.out.println(" Введит автора");
                                    String authorFullName = sc.nextLine();
                                    newProduct[newProduct.length - 1] = new Book(nameB,descriptionB,priceE, madeInE, authorFullName);
                                    products = newProduct;
                                }
                                break;
                            case 2:
                                for (Product product : products) {
                                    System.out.println(product);
                                }
                                break;
                            case 3:
                                for (Product product : products) {
                                    if (product.getClass() == Book.class){
                                        System.out.println(product);
                                    }
                                }
                                break;
                            case 4:
                                for (Product product : products) {
                                    if (product.getClass() == Electronics.class){
                                        System.out.println(product);
                                    }
                                }
                                break;
                        }
                    }
                }
                break;
            case 3:
                break;
        }


    }

    public static void menu(){
        System.out.println("""
                1.Register
                2.Login
                3.Exit
                """);
    }

    public static void menuAfterLogin(){
        System.out.println("""
                1.Add new product
                2.Get All Products
                3.Get All Books
                4.Get All Electronics
                """);
    }
}