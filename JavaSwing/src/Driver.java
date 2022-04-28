import java.util.ArrayList;
import java.io.Serializable;
public abstract   class Driver implements Serializable {
    private String DriverName;
    private String Location;
    private String Team;
    private DriverStatics Statistic;
    private Champianships Race;
    private int DriverPoints;
    protected ArrayList<DriverStatics> list=new ArrayList<DriverStatics>();
    Driver(String DriverName ,String Locaton ,String Team ,DriverStatics Statistic,Champianships Race){
        this.DriverName = DriverName;
        this.Location =Locaton;
        this.Team =Team;
        this.Statistic =Statistic;
        this.Race = Race;
    }

    public String getDriverName(){
        return  this.DriverName;
    }
    public String getLocation() {return  this.Location;}
    public String getTeam(){return  this.Team;}
    public DriverStatics getStatistic(){return  this.Statistic; }
    public  void setDriverName(String value){this.DriverName =value;}
    public abstract  int getDriverPoints(DriverStatics statistic);

    public Champianships getRace() {
        return Race;
    }
}
