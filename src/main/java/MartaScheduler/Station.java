package MartaScheduler;

import java.util.Date;

public enum Station {

    NORTH_AVE(10),
    PEACHTREE_CENTER,
    FIVE_POINTS;

    private int timeFromTop;

    private Station(int timeFromTop) {
        this.timeFromTop = timeFromTop;
    }

    public abstract Date getTimeBetweenStations(Station departureStation);
}
