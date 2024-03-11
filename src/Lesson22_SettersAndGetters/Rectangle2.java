package Lesson22_SettersAndGetters;

public class Rectangle2 {
    int length;
    int width;
    int area;

    public void setLength(int h) {
        length = h;
    }
    public void setWidth(int w) {
        width = w;
    }
    public int getArea() {
        area = length * width;
        return area;
    }
}
