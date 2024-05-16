package Q2;

public class Main {

    public static void main(String[] args) {

        book book1 = new book(200, "Human Nature", 500);
        book book2 = new book("69969", "Artificial Intelligence", 90900);

        System.out.println(book1);
        System.out.println(book2);

        System.out.println(book1.equals(book2));

    }

}
