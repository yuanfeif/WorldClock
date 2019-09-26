public abstract class Clock {
    protected int localTime=0;
    protected int offset;

    public Clock(int i) {
        offset=i;
    }

    public abstract void setLocalTime(int LocalTime);

    public String getTime(){
        return String.valueOf(this.localTime);
    }

    public void setTime(int utc) {
        this.localTime = Clock.Hour(utc + this.offset);
    }

    private static int Hour(int hour) {
        return (hour + 24) % 24;
    }
}
