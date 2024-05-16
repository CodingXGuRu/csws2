
public class Q3 {
    int X, Y;

    public Q3(int X, int Y) {
        this.X = X;
        this.Y = Y;
    }

    public Q3(Q3 another) {
        this(another.X, another.Y);
    }

    public int getX() {
        return X;
    }

    public void setX(int X) {
        this.X = X;
    }

    public int getY() {
        return Y;
    }

    public void setY(int Y) {
        this.Y = Y;
    }

    public static void main(String[] args) {

        Q3 p1 = new Q3(2, 5);
        Q3 p2 = new Q3(p1);

        System.out.println(p1.getX() + "," + p1.getY());
        System.out.println(p2.getX() + "," + p2.getY());

        p1.setX(4);
        p1.setY(6);

        System.out.println(p1.getX() + "," + p1.getY());
        System.out.println(p2.getX() + "," + p2.getY());

    }

}
