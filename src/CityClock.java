public class CityClock extends Clock{

    public CityClock(int i) {
        super(i);
    }

    @Override
    public void setLocalTime(int utc) {
        super.localTime = localTime;
    }


}
