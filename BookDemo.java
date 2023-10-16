import java.util.Scanner;

public class BookDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Original Book Id,Name & Author:");
        int id = scanner.nextInt();
        String name = scanner.next();
        String author = scanner.next();
        Book r = new Book(id,name,author);
        r.BKDisplay();
        System.out.println("Enter Updated Book Id,Name & Author:");
        id = scanner.nextInt();
        name = scanner.next();
        author = scanner.next();
        r.BKUpdateDetails(name,id,author);
        System.out.println("Updated Details");
        r.BKDisplay();

    }
}
