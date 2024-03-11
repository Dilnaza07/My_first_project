package Homework.Lesson22_SettersAndGetters;

public class RectangleTask2 {
    int length;
    int width;
    int area;
    String color;

    public void setLength(int h) {

        if (h <= 0) throw new Error();
        length = h;
        width = h;

    }

    public void setWidth(int w) {
        if (w <= 0) throw new Error();
        width = w;
    }

    public void setColor(String c) {
        color = c;
    }

    public int getLength(){
        return length;
    }
    public int getWidth(){
        return width;
    }public String getColor(){
        return color;
    }

    public int getArea() {
        area = length * width;
        return area;
    }
}
