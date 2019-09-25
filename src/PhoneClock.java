public class PhoneClock extends Clock {

    private UtcTime utcTime;

    public PhoneClock(int i) {
        super(i);
    }

    @Override
    public void setLocalTime(int localTime) {
        super.localTime=localTime;
        this.utcTime.setUtc(localTime-offset);
    }

    public void setUtcTime(UtcTime utcTime) {
        this.utcTime = utcTime;
    }


}
