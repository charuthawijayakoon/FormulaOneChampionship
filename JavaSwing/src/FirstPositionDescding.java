import java.util.Comparator;

import java.util.Comparator;
public class FirstPositionDescding implements Comparator<Formula1Driver>  {

        @Override
        public int compare(Formula1Driver o1, Formula1Driver o2) {
            return (o1.getStatistic().getFirstPlaceCount()<o2.getStatistic().getFirstPlaceCount()) ? -1 : (o1.getStatistic().getFirstPlaceCount()>o2.getStatistic().getFirstPlaceCount()) ? 1 : 0;
        }

}
