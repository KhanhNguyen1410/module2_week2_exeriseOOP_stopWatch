package stopwacth;

public class StopWatch {
    private double starTime;
    private double endTime;

    public StopWatch(){
        this.starTime = System.currentTimeMillis();
    }
    public void start(){
       this.starTime = System.currentTimeMillis();
    }
    public  void stop(){
        this.endTime = System.currentTimeMillis();
    }
    public double getElapsedTime(){
        return this.endTime - this.starTime;
    }

}
