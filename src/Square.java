public class Square {

//Construtor
    public Square(int length) {
        this.length = length;
    }
//Get Set
    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    private int length;

//    Method

    public double squareAea() {
        return Math.pow(this.length,2);


    }
}
