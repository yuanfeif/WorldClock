import java.util.HashMap;
import java.util.Map;

public abstract class Time {
    protected final Map<String, Clock> clocks = new HashMap<String, Clock>();

    public void add(String cityNme, Clock clock) {
        clocks.put(cityNme, clock);
    }

    public void remove(String cityName) {
        clocks.remove(cityName);
    }

    public abstract void clockUpdate();
}
