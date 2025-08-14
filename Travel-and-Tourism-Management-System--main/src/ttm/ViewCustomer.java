
package ttm;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.sql.*;


public class ViewCustomer extends JFrame implements ActionListener{
    JButton back;

    public ViewCustomer(String username)
    {
        setBounds(450,180,870,625);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        JLabel lblun=new JLabel("Username");
        lblun.setBounds(30,50,150,25);
        add(lblun);
        
         JLabel lblusername=new JLabel();
        lblusername.setBounds(220,50,150,25);
        add(lblusername);
        
         JLabel lblid=new JLabel("Id");
        lblid.setBounds(30,110,150,25);
        add(lblid);
        
         JLabel labelid=new JLabel();
        labelid.setBounds(220,110,150,25);
        add(labelid);
        
        JLabel lbnumber=new JLabel("Number");
        lbnumber.setBounds(30,170,150,25);
        add(lbnumber);
        
         JLabel labelnumber=new JLabel();
        labelnumber.setBounds(220,170,150,25);
        add(labelnumber);
        
        
        JLabel lblname=new JLabel("Name");
        lblname.setBounds(30,230,150,25);
        add(lblname);
        
         JLabel labelname=new JLabel();
        labelname.setBounds(220,230,150,25);
        add(labelname);
        
        JLabel lblgender=new JLabel("Gender");
        lblgender.setBounds(30,290,150,25);
        add(lblgender);
        
         JLabel labelgender=new JLabel();
        labelgender.setBounds(220,290,150,25);
        add(labelgender);
        
        
        JLabel lblcountry=new JLabel("Country");
        lblcountry.setBounds(500,50,150,25);
        add(lblcountry);
        
         JLabel labelcountry=new JLabel();
        labelcountry.setBounds(690,50,150,25);
        add(labelcountry);
        
        
         JLabel lbladdress=new JLabel("Address");
        lbladdress.setBounds(500,110,150,25);
        add(lbladdress);
        
         JLabel labeladdress=new JLabel();
        labeladdress.setBounds(690,110,150,25);
        add(labeladdress);
        
        
        
         JLabel phone=new JLabel("Phoneno");
        phone.setBounds(500,170,150,25);
        add(phone);
        
         JLabel labelphone=new JLabel();
        labelphone.setBounds(690,170,150,25);
        
        
         JLabel lblemail=new JLabel("Email");
        lblemail.setBounds(500,230,150,25);
        add(lblemail);
        
         JLabel labelemail=new JLabel();
        labelemail.setBounds(690,230,150,25);
        add(labelemail);
        
        
        back=new JButton("Back");
        back.setBackground(Color.BLACK);
        back.setForeground(Color.white);
        back.setBounds(350,350,100,25);
        back.addActionListener(this);
      add(back);
      
      ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/viewall.jpg"));
        Image i2=i1.getImage().getScaledInstance(200, 200,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(90,400,600,200);
        add(image);
        
        
        
        add(labelphone);
        
        try{
            Conn c=new Conn();
            String query="select * from customer where username='"+username+"'";
            ResultSet rs=c.s.executeQuery(query);
            while(rs.next())
            {
                lblusername.setText(rs.getString("username"));
                labelid.setText(rs.getString("id"));
                 labelnumber.setText(rs.getString("number"));
                  labelname.setText(rs.getString("gender"));
                  labelcountry.setText(rs.getString("country"));
                   labelgender.setText(rs.getString("name"));
                    labeladdress.setText(rs.getString("address"));
                     labelphone.setText(rs.getString("phone"));
                      labelemail.setText(rs.getString("email"));
                
            }
            
        }catch(Exception e)
        {
            
            e.printStackTrace();
        }
        
        
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae)
    {
        setVisible(false);
        
    }
    
    
    
    
    public static void main(String args[])
    {
        new ViewCustomer("Parth");
    }
    
}
