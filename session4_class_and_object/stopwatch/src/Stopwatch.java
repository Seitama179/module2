public class Stopwatch {
    private long startTime;
    private long endTime;

    public Stopwatch(long startTime, long endTime) {
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public Stopwatch() {
        startTime = System.currentTimeMillis();
    }

    public long getStartTime() {
        return this.startTime;
    }

    public long getEndTime() {
        return this.startTime;
    }

    public void start(){
        this.startTime = System.currentTimeMillis();
    }
    public void stop(){
        this.endTime = System.currentTimeMillis();
    }
    public long getElapsedTime(){
        return this.endTime -this.startTime;
    }

}
