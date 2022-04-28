import java.util.Comparator;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

public class TotalDescending implements Comparator<Formula1Driver> {


    @Override
    public int compare(Formula1Driver o1, Formula1Driver o2) {
        return (o1.getDriverPoints(o1.getStatistic())<o2.getDriverPoints(o2.getStatistic())) ? -1 : (o1.getDriverPoints(o1.getStatistic())>o2.getDriverPoints(o2.getStatistic())) ? 1 : 0;
    }
}
