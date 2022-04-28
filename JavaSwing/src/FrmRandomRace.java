import javax.swing.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;

public class FrmRandomRace   {
    JFrame frame ;
    String column[]={"Race ID" ,"Driver Name","1st Places","2nd Places","3rd Places","NFRF", "Total Point"};
    //NFRF = Number of FormulaOne Races Faced

    private Random randomGenerator = new Random();
    public FrmRandomRace(ArrayList<Formula1Driver> driverStatics){
        frame = new JFrame();
        Formula1Driver driverItem = driverStatics.stream()
                .max((x, y) -> x.getRace().getRaceID() - y.getRace().getRaceID())
                //.max((x, y) -> Integer.compare(x.getAge(),y.getAge()))
                .get();
        int index = randomGenerator.nextInt(driverItem.getRace().getRaceID());
        ArrayList<Formula1Driver> temDriverStatics;
        temDriverStatics =getTempRandomList(driverStatics ,index);
        Comparator<Formula1Driver> cmp = Collections.reverseOrder(new TotalDescending());
        Collections.sort(temDriverStatics, cmp);
        String data[][] =getGridData( temDriverStatics);

        JTable jtblDescDisplay=new JTable(data,column);
        jtblDescDisplay.setBounds(300,90,500,200);
        JScrollPane sPanel=new JScrollPane(jtblDescDisplay);
        frame.add(sPanel);
        frame.setSize(500, 300);
        frame.setVisible(true);
    }

    private ArrayList<Formula1Driver> getTempRandomList(ArrayList<Formula1Driver> driverStatics , int index){
        ArrayList<Formula1Driver> temDriverStatics =new ArrayList<Formula1Driver>();
        for(int i =0 ; i<driverStatics.size() ;i++){
           var itme = driverStatics.get(i);
            if(itme.getRace().getRaceID()==index){
                temDriverStatics.add(itme);
            }
        }
        return  temDriverStatics;
    }

    private String[][]   getGridData(ArrayList<Formula1Driver> driverStatics){
        String gridData[][] =new String[driverStatics.size()][];

        for(int i = 0 ;i< driverStatics.size();i++){
            Formula1Driver tRow =driverStatics.get(i);
            String [] copy = new String[7];
            copy[0]=String.valueOf(tRow.getRace().getRaceID());
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
