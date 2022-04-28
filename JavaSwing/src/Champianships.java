import java.util.Date;
import java.io.Serializable;
public class Champianships implements Serializable  {

    private int RaceID;
    private Date EventDate;

    public Date getEventDate() {
        return EventDate;
    }
    public int getRaceID() {
        return RaceID;
    }

    public void setEventDate(Date eventDate) {
        EventDate = eventDate;
    }
    public void setRaceID(int raceID) {
        RaceID = raceID;
    }

}
