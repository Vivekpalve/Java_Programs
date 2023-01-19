package JavaAdvancePractical;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class SimpleCaculater extends JFrame implements ActionListener{
    static JLabel l1,l2,l3;
    static JTextField t1,t2,t3;
    static JButton ADD,SUBSTRACT,MUlTI,DIV;
    SimpleCaculater(){
        
        super("Calculator");
        setLayout(null);
        
        l1= new JLabel("1ST_number");
        l1.setBounds(40, 20, 100, 30);
        add(l1);
        
        t1 = new JTextField();
        t1.setBounds(150, 20, 150, 30);
        add(t1);
        
        l2  = new JLabel("2ND_number ");
        l2.setBounds(40 ,70 ,100,30);
        add(l2);
        
        t2 = new JTextField();
        t2.setBounds(150,70,150,30);
        add(t2);
        
        l3  = new JLabel("Result");
        l3.setBounds(40 ,120 ,100,30);
        add(l3);
        
        t3 = new JTextField();
        t3.setBounds(150,120,150,30);
        add(t3);
        
        ADD = new JButton("ADD");
        ADD.setBounds(40, 160, 120, 30);
        ADD.setFont(new Font("serif",Font.BOLD,15));
        ADD.addActionListener(this);
        add(ADD);
        
        SUBSTRACT = new JButton("SUBSTRACT");
        SUBSTRACT.setBounds(180, 160, 130, 30);
        SUBSTRACT.setFont(new Font("serif",Font.BOLD,15));
        SUBSTRACT.addActionListener(this);
        add(SUBSTRACT);
        
        MUlTI = new JButton("MUlTI");
        MUlTI.setBounds(40, 190, 120, 30);
        MUlTI.setFont(new Font("serif",Font.BOLD,15));
        MUlTI.addActionListener(this);
        add(MUlTI);
        
        DIV = new JButton("DIV");
        DIV.setBounds(180, 190, 130, 30);
        DIV.setFont(new Font("serif",Font.BOLD,15));
        DIV.addActionListener(this);
        add(DIV);
        
        getContentPane().setBackground(Color.WHITE);

        setVisible(true);
        setSize(400, 300);
        setLocation(400, 270);
    }
    public void actionPerformed(ActionEvent ae){
        Integer p=0;
        String s = ae.getActionCommand();
        if(s.equals("ADD")){
            try{
                String p1 = t1.getText();
                String p2 = t2.getText();
                p=((Integer.parseInt(p1)) + (Integer.parseInt(p2)));
                
                t3.setText(""+p);
            }
            catch(Exception e){
                e.printStackTrace();
            }
        }
        else if(s.equals("SUBSTRACT")){
            try{
                String p1 = t1.getText();
                String p2 = t2.getText();
                p=((Integer.parseInt(p1)) - (Integer.parseInt(p2)));
                t3.setText(""+p);
            }
            catch(Exception e){
                e.printStackTrace();
            }
        }
        else if(s.equals("MUlTI")){
            try{
                String p1 = t1.getText();
                String p2 = t2.getText();
                p=((Integer.parseInt(p1)) * (Integer.parseInt(p2)));
                t3.setText(""+p);
            }
            catch(Exception e){
                e.printStackTrace();
            }
        }
        else if(s.equals("DIV")){
            try{
                String p1 = t1.getText();
                String p2 = t2.getText();
                p=((Integer.parseInt(p1)) / (Integer.parseInt(p2)));
                t3.setText(""+p);
            }
            catch(Exception e){
                e.printStackTrace();
            }
        }
        else {
            System.exit(0);
        }
    }
    public static void main(String args[]){
        new SimpleCaculater();
    }
}
