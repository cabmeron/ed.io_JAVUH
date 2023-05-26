
// Point: represents a specific point in the x-y plane
import java.lang.Math;

class Point {
    private int x;
    private int y;

    public Point() {
        this.x = 0;
        this.y = 0;
    }

    public Point(int x, int y) {

        this.x = x;
        this.y = y;

    }

    public float distance() {
        return this.x + this.y;

    }

}
