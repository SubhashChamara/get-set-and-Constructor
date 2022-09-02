
public class Round {

    public Round(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    private int radius;

    public double roundArea() {
        return (2 * Math.PI * this.radius);
    }




}
