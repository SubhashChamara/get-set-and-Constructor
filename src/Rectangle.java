public class Rectangle {

//Constructor
    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }


    //Get Set
    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    private int length;
    private int width;
//Method
    public int rectangleArea() {

        return this.length*this.width;
    }
}
