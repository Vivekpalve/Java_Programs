/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JavaAdvancePractical;

import java.awt.*;  
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class jmath extends JFrame implements ActionListener{  

   // create a frame
   static JFrame f;
 
   // create a textfield
   static JTextField tf1,tf2,tf_re;

    
    public static void main(String args[])  
    {  

        jmath pe =  new jmath();  
            
            f= new JFrame("Calculate");    
            
            tf1 = new JTextField("");
            tf2 = new JTextField("");
            tf_re = new JTextField("Result");
            tf1.setBounds(30,200,100,50);
            tf2.setBounds(170,200,100,50);
            tf_re.setBounds(100,400,100,50);

            f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
            JPanel panel=new JPanel();  
            panel.setBounds(40,80,400,600);    
            panel.setBackground(Color.gray);  

            JButton b1=new JButton("Addition");     
            b1.setBounds(30,100,150,30);    
            b1.setBackground(Color.yellow); 
            b1.addActionListener((ActionListener) pe);  
            
            JButton b2=new JButton("Substraction");   
            b2.setBounds(150,100,150,30);    
            b2.setBackground(Color.green);   
            b2.addActionListener(pe);
        
            

            panel.add(b1); panel.add(b2);  
            panel.add(tf1);
            panel.add(tf2);
            panel.add(tf_re);
            panel.setLayout(null);
            f.add(panel);  

        try {
            // set look and feel
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        }
        catch (Exception e) {
            System.err.println(e.getMessage());
        }
 

            f.setSize(400,400);    
            f.setLayout(null);    
            f.setVisible(true);    
         
            
           
            
        }  

       

        /* (non-Javadoc)
         * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
         */
        /* (non-Javadoc)
         * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
         */
        @Override
        public void actionPerformed(ActionEvent pe) {
           
            String s = pe.getActionCommand();
            Double c;

            
            
            // TODO Auto-generated method stub
            if(s.equals("Addition")){

                
                c = (Double.parseDouble(tf1.getText()) + Double.parseDouble(tf2.getText()));
                tf_re.setText(""+c);
            }else if(s.equals("Substraction")){

                c = (Double.parseDouble(tf1.getText()) - Double.parseDouble(tf2.getText()));
                tf_re.setText(""+c);

            }else{
                tf_re.setText("");
            }
            
        }
    }  
