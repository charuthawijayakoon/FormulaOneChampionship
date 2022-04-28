import javax.swing.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class FrmDescOrderDisplay
         {

    JFrame frame ;

     String column[]={"Driver Name","1st Places","2nd Places","3rd Places","NFRF", "Total Point"};
     //NFRF = Number of FormulaOne Races Faced

    public FrmDescOrderDisplay(ArrayList<Formula1Driver> driverStatics){

         frame = new JFrame();
        Comparator<Formula1Driver> cmp = Collections.reverseOrder(new TotalDescending());
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

       for(int i = 0 ;i< driverStatics.size();i++){
           Formula1Driver tRow =driverStatics.get(i);
           String [] copy = new String[6];
           copy[0]=tRow.getDriverName();
           copy[1]=String.valueOf( tRow.getStatistic().getFirstPlaceCount());
           copy[2]=String.valueOf( tRow.getStatistic().getSecondPlaceCount());
           copy[3]=String.valueOf( tRow.getStatistic().getThirdPlaceCount());
           copy[4]=String.valueOf( tRow.getStatistic().getNumberOfRaces());
           copy[5]=String.valueOf( tRow.getDriverPoints(tRow.getStatistic()));
           gridData[i] = copy;

       }

        return gridData;
    }
}
