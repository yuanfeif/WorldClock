import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

class TimeTest {

    private UtcTime testClock;

    @BeforeEach
    void Init(){
        testClock = new UtcTime();
        testClock.add("beijing", new CityClock(0));
        testClock.add("newyork", new CityClock(-5));
    }

    @Test
    void if_add_is_successful() {
        assertNotNull(testClock.clocks);
    }

    @Test
    void if_getTime_is_successful(){
        testClock.clocks.get("beijing").setTime(0);
        testClock.clocks.get("newyork").setTime(0);
        assertEquals("0", testClock.clocks.get("beijing").getTime());
        assertEquals("19", testClock.clocks.get("newyork").getTime());
    }
}