import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CityClockTest {

    @Test
    void if_the_time_of_the_cityclocks_will_be_changed_after_the_change_of_the_phoneclock() {
        UtcTime londonClock = new UtcTime();
        londonClock.add("london",new CityClock(0));
        PhoneClock waitera=new PhoneClock(8);
        // Act
        waitera.setUtcTime(londonClock);
        waitera.setLocalTime(9);

        // Assert
        assertEquals("1", londonClock.clocks.get("london").getTime() );
    }



}