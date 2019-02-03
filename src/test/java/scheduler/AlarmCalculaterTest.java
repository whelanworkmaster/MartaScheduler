package scheduler;

import MartaScheduler.Station;
import org.junit.jupiter.api.Test;

import java.util.Date;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AlarmCalculaterTest {

    @Test
    public void calculateIdealTrain() {
        // Want a unit test for high level functionality, which is?
        // Scenario: A user has wants to be notified when a train which will take them to their destination
        // on time will be arriving
        // This means the user will provide: The starting station, the ending station, and the desired arrival time at
        // the destination station. The service will need to estimate the travel time between starting and ending
        // stations, subtract that from the desired arrival time to get the desired departure time, then get a list
        // of trains arriving at that time and find the one that will first arrive <= the desired departure time.
        // That will be the train the user should take.
        Station arrivalStation = Station.NORTH_AVE;
        Station departureStation = Station.FIVE_POINTS;
        Date desiredArrivalTime = new Date();
        desiredArrivalTime.setTime(12);
        Date timeBetweenStations = Station.getTimeBetweenStations(arrivalStation, departureStation);
        Date desiredDepartureTime = calculateDesiredDepartureTime(desiredArrivalTime, timeBetweenStations);
        List<Date> arrivingTrainTimes = getArriveTrainETAsByStation(arrivalStation);
        Date bestTrainToTakeTime = calculateBestTrainToTake(arrivingTrains);
        assertEquals(new Date(1130), bestTrainToTakeTime);
    }
}
