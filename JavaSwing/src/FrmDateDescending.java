import javax.swing.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class FrmDateDescending {
    JFrame frame ;
    String column[]={"Event Date", "Driver Name","1st Places","2nd Places","3rd Places","NFRF", "Total Point"};
    //NFRF = Number of FormulaOne Races Faced

    public FrmDateDescending(ArrayList<Formula1Driver> driverStatics){
        frame = new JFrame();

        Comparator<Formula1Driver> cmp = Collections.reverseOrder(new DateAscending());
        Collections.sort(driverStatics, cmp);

        String data[][] =getGridData( driverStatics);

        JTable jtblDescDisplay=new JTable(data,column);
        jtblDescDisplay.setBounds(300,90,500,200);
        JScrollPane sPanel=new JScrollPane(jtblDescDisplay);
        frame.add(sPanel);
        frame.setSize(500, 300);
        frame.setVisible(true);
    }
    private String[][]   getGridData(ArrayList<Formula1Driver> driverStatics){
        String gridData[][] =new String[driverStatics.size()][];
        DateFormat formatter1 = new SimpleDateFormat("yyyy-MM-dd");
        for(int i = 0 ;i< driverStatics.size();i++){
            Formula1Driver tRow =driverStatics.get(i);
            String [] copy = new String[7];
            copy[0]=String.valueOf(formatter1.format( tRow.getRace().getEventDate()));
            copy[1]=tRow.getDriverName();
            copy[2]=String.valueOf( tRow.getStatistic().getFirstPlaceCount());
            copy[3]=String.valueOf( tRow.getStatistic().getSecondPlaceCount());
            copy[4]=String.valueOf( tRow.getStatistic().getThirdPlaceCount());
            copy[5]=String.valueOf( tRow.getStatistic().getNumberOfRaces());
            copy[6]=String.valueOf( tRow.getDriverPoints(tRow.getStatistic()));
            gridData[i] = copy;

        }

        return gridData;
    }
}
