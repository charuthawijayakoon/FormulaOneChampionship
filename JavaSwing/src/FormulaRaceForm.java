import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class FormulaRaceForm  extends JFrame
        implements ActionListener {

    private Container frmContainer;
    private JButton disAscOrderBtn;
    private JButton disDescOrderBtn;
    private  JButton disDescOrderFirstBtn;
    private  JButton disRandomRace;
    private  JButton disDateAsc;
    private  JButton disStackDis;

    private JTextField txtSearch;

    //Assigning conditions with functions to run when the buttons are clicked
    @Override
    public void actionPerformed(ActionEvent e)
    {
       if (e.getSource() == disAscOrderBtn){
           Formula1ChampionshipManager obj = new Formula1ChampionshipManager();
           obj.SetInitialDriverDetail();
           FrmAcendingDisplay frmAcs =new FrmAcendingDisplay(obj.getDriverStatic());

       }
       if(e.getSource() == disDescOrderBtn){
           Formula1ChampionshipManager obj = new Formula1ChampionshipManager();
           obj.SetInitialDriverDetail();

           FrmDescOrderDisplay frmDesc =new FrmDescOrderDisplay(obj.getDriverStatic());

       }
       if(e.getSource()==disDescOrderFirstBtn){
           Formula1ChampionshipManager obj = new Formula1ChampionshipManager();
           obj.SetInitialDriverDetail();
           FrmFirstPositionDesc frmFirstDesc =new FrmFirstPositionDesc(obj.getDriverStatic());
       }

       if(e.getSource()==disRandomRace){
           Formula1ChampionshipManager obj = new Formula1ChampionshipManager();
           obj.SetInitialDriverDetail();
           FrmRandomRace frmFirstDesc =new FrmRandomRace(obj.getDriverStatic());
       }

        if(e.getSource()==disDateAsc){
            Formula1ChampionshipManager obj = new Formula1ChampionshipManager();
            obj.SetInitialDriverDetail();
            FrmDateDescending frmFirstDesc =new FrmDateDescending(obj.getDriverStatic());
        }

        //Making the Search button non-functional when it is clicked without typing anything in the search text box
        if(e.getSource() ==disStackDis){
            Formula1ChampionshipManager obj = new Formula1ChampionshipManager();
            obj.SetInitialDriverDetail();
            if(txtSearch.getText()==null)
            {

            }
            else{
                FrmSearchForm frmFirstDesc =new FrmSearchForm(obj.getDriverStatic() ,Integer.getInteger(txtSearch.getText()));
            }


        }

    }

    public  FormulaRaceForm(){
        setTitle("Formula_One_Championship");
        setBounds(300, 90, 300, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);

        //Making the container pane
        frmContainer = getContentPane();
        frmContainer.setLayout(null);

        //Making the Button that that create the total points in ascending order
        disAscOrderBtn = new JButton("Display ASC Order");
        disAscOrderBtn.setFont(new Font("Arial", Font.PLAIN, 15));
        disAscOrderBtn.setSize(200, 20);
        disAscOrderBtn.setLocation(40, 20);
        disAscOrderBtn.addActionListener(this);
        frmContainer.add(disAscOrderBtn);

        //Making the Button that that create the total points in descending order
        disDescOrderBtn = new JButton("Display DESC Order");
        disDescOrderBtn.setFont(new Font("Arial", Font.PLAIN, 15));
        disDescOrderBtn.setSize(200, 20);
        disDescOrderBtn.setLocation(40, 50);
        disDescOrderBtn.addActionListener(this);
        frmContainer.add(disDescOrderBtn);

        //Making the Button that that create the number of first positions in descending order
        disDescOrderFirstBtn = new JButton("First position DESC");
        disDescOrderFirstBtn.setFont(new Font("Arial", Font.PLAIN, 15));
        disDescOrderFirstBtn.setSize(200, 20);
        disDescOrderFirstBtn.setLocation(40, 80);
        disDescOrderFirstBtn.addActionListener(this);
        frmContainer.add(disDescOrderFirstBtn);

        //Making the Random Race Button
        disRandomRace= new JButton("Random Race");
        disRandomRace.setFont(new Font("Arial", Font.PLAIN, 15));
        disRandomRace.setSize(200, 20);
        disRandomRace.setLocation(40, 110);
        disRandomRace.addActionListener(this);
        frmContainer.add(disRandomRace);

        //Making the date Ascending button
        disDateAsc= new JButton("Date Ascending");
        disDateAsc.setFont(new Font("Arial", Font.PLAIN, 15));
        disDateAsc.setSize(200, 20);
        disDateAsc.setLocation(40, 140);
        disDateAsc.addActionListener(this);
        frmContainer.add(disDateAsc);

        //Making the Search Bar
        disStackDis= new JButton("Search");
        disStackDis.setFont(new Font("Arial", Font.PLAIN, 15));
        disStackDis.setSize(200, 20);
        disStackDis.setLocation(40, 250);
        disStackDis.addActionListener(this);
        frmContainer.add(disStackDis);

        //Making the Text area for search content
        txtSearch=new JTextField();
        txtSearch.setBounds(40,220, 200,30);
        frmContainer.add(txtSearch);

    }
}
