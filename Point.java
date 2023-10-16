public class Point {
    double x,y;

    public Point() {
        x = 0;
        y = 0;
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public Point(Point a)
    {
        this.x = a.x;
        this.y = a.y;
    }
    public double find_distance(double x,double y)
    {
       return Math.sqrt(Math.pow(x-this.x,2)+Math.pow(y-this.y,2));
    }
    public double find_distance(Point a)
    {
        return Math.sqrt(Math.pow(a.x-x,2)+Math.pow(a.y-y,2));
    }
    public void display()
    {
        System.out.println("("+x+","+y+")");
    }
}
