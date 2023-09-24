public class Point {
    int x;
    int y;
    public Point() {
        this.x = 0;
        this.y = 0;
    };
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    };
    void move(int x, int y) {
        this.x = x;
        this.y = y;
    };
}