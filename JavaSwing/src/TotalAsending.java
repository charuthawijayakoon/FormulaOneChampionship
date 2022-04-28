import java.util.Comparator;

public class TotalAsending implements Comparator<Formula1Driver> {
    @Override
    public int compare(Formula1Driver o1, Formula1Driver o2) {

        return (o1.getDriverPoints(o1.getStatistic())>o2.getDriverPoints(o2.getStatistic())) ? -1 : (o1.getDriverPoints(o1.getStatistic())<o2.getDriverPoints(o2.getStatistic())) ? 1 : 0;
    }
}
