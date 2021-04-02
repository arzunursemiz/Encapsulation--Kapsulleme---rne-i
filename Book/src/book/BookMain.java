package book;

public class BookMain {

    public static void main(String[] args) {

        Book b1 = new Book("Harry Potter", "Rowling", "Can Yayinlari", 600);
        b1.setSayfaSayisii(50);
        System.out.println(b1.getSayfasayisii());

    }
}
