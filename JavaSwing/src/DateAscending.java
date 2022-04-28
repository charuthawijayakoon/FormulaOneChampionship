import javax.swing.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;

public class DateAscending implements Comparator<Formula1Driver> {

    @Override
    public int compare(Formula1Driver o1, Formula1Driver o2) {
        return o2.getRace().getEventDate().compareTo(o1.getRace().getEventDate());
       // return (o1.getRace().getEventDate().compareTo(o2.getRace().getEventDate())) ? -1 : (o1.getStatistic().getFirstPlaceCount()>o2.getStatistic().getFirstPlaceCount()) ? 1 : 0;

        //return (o1.getRace().getEventDate().compareTo(o2.getRace().getEventDate())) ? -1 : (o1.getDriverPoints(o1.getStatistic())<o2.getDriverPoints(o2.getStatistic())) ? 1 : 0;
    }
}