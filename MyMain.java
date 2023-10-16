public class MyMain {
    public static void main(String[] args) {
        Point p1 = new Point(3.25,7.89);
        Point p2 = new Point(5.37,18.12);
        Point p3 = new Point(p2);
        System.out.println(p1.find_distance(7.9,16.25));
        System.out.println(p1.find_distance(p3));
        p1.display();
        p2.display();
        p3.display();
    }
}
