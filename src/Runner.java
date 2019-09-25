public class Runner {
    public static void main(String[] args){
        UtcTime hotelCity = new UtcTime();

        hotelCity.add("北京", new CityClock(8));
        hotelCity.add("伦敦", new CityClock(0));
        hotelCity.add("莫斯科",  new CityClock(4));
        hotelCity.add("悉尼", new CityClock(10));
        hotelCity.add("纽约", new CityClock(-5));

        PhoneClock waiter=new PhoneClock(8);
        waiter.setUtcTime(hotelCity);
        waiter.setLocalTime(9);

        hotelCity.printClocks();
    }
}
