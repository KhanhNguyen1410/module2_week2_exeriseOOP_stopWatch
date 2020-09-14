package fan;

public class Fan {
    final private int SLOW = 1;
    final private int MEDIUM = 2;
    final private int FAST = 3;
    private int speed = SLOW;
    boolean on = false;
    private double RADIUS = 5;
    private String COLOR = "blue";

    public Fan() {

    }

    public Fan(boolean on, double RADIUS, String COLOR,int speed) {
        this.on = on;
        this.RADIUS = RADIUS;
        this.COLOR = COLOR;
        this.speed = speed;


    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public void setCOLOR(String COLOR) {
        this.COLOR = COLOR;
    }

    public void setRADIUS(double RADIUS) {
        this.RADIUS = RADIUS;
    }

    public double getRADIUS() {
        return RADIUS;
    }

    public int getFAST() {
        return this.speed=FAST;
    }

    public int getMEDIUM() {
        return this.speed=MEDIUM;
    }

    public int getSLOW() {
        return this.speed=SLOW;
    }

    public String getCOLOR() {
        return COLOR;
    }

    @Override
    public String toString() {
        return "{" +
                "SPEED=" + speed +
                ", on=" + on +
                ", RADIUS=" + RADIUS +
                ", COLOR='" + COLOR + '\'' +
                '}';
    }
}
