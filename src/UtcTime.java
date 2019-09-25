public class UtcTime extends Time {
    private int utc;

    @Override
    public void clockUpdate() {
        for(Clock clock: super.clocks.values())
        {
            clock.setTime(this.utc);
        }
    }

    public int getUtc() {
        return utc;
    }

    public void setUtc(int utc) {
        this.utc = utc;
        clockUpdate();
    }

    public void printClocks(){
        for(String cityName:super.clocks.keySet()){
            System.out.println(cityName+": "+super.clocks.get(cityName).getTime());
        }
    }
}
