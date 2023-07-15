package calculator;
import java.awt.*;
import java.awt.event.*;  
class MyFrame extends Frame implements ActionListener
{
    int x,y,z,temp1=0,temp2=0;
    boolean plus=false, minus=false, mul=false, div = false;
    TextField t1,t2,t3,t4;
    Button b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15;
    MyFrame() 
    {
        System.out.println("frame created");
        t1 = new TextField(20);
        t2 = new TextField(20);
        t3 = new TextField(20);
        t4 = new TextField(20);
        b0 = new Button("0");
        b1 = new Button("1");
        b2 = new Button("2");
        b3 = new Button("3");
        b4 = new Button("4");
        b5 = new Button("5");
        b6 = new Button("6");
        b7 = new Button("7");
        b8 = new Button("8");
        b9 = new Button("9");
        b10 = new Button("+");
        b11 = new Button("-");
        b12 = new Button("*");
        b13 = new Button("/");
        b14 = new Button("=");
        b15 = new Button("reset");

        add(t1); add(t2); add(t3); add(t4);
        add(b15); add(b1); add(b2); add(b10);add(b3); add(b4); add(b5); 
        add(b11); add(b6); add(b7); add(b8); add(b12); add(b9); add(b0);
        add(b14); add(b13);
        b0.addActionListener(this); b1.addActionListener(this);
        b2.addActionListener(this); b3.addActionListener(this);
        b4.addActionListener(this); b5.addActionListener(this);
        b6.addActionListener(this); b7.addActionListener(this);
        b8.addActionListener(this); b9.addActionListener(this);
        b10.addActionListener(this); b11.addActionListener(this);
        b12.addActionListener(this); b13.addActionListener(this);
        b14.addActionListener(this); b15.addActionListener(this);

        addWindowListener (new WindowAdapter() 
        {    
            public void windowClosing (WindowEvent e) 
            {    
                dispose();    
            }    
        });   
        
    }
    
    public void actionPerformed(ActionEvent e)
    {
        //digits
        if (e.getSource()==b0) 
        {
            if(plus==false && minus==false && mul==false && div==false)
            {
                temp1 = temp1*10 + 0;
                t1.setText(String.valueOf(temp1));
            }
            else if(plus==true || minus==true || mul==true || div==true)
            {
                temp2 = temp2*10 + 0;
                t3.setText(String.valueOf(temp2));
            }
        }
        else if (e.getSource()==b1) 
        {
            if(plus==false && minus==false && mul==false && div==false)
            {    
                temp1 = temp1*10 + 1;
                t1.setText(String.valueOf(temp1));
            }
            else if(plus==true || minus==true || mul==true || div==true)
            {
                temp2 = temp2*10 + 1;
                t3.setText(String.valueOf(temp2));
            }
        } 
        else if (e.getSource()==b2) 
        {
            if(plus==false && minus==false && mul==false && div==false)
            {    
                temp1 = temp1*10 + 2;
                t1.setText(String.valueOf(temp1));
            }
            else if(plus==true || minus==true || mul==true || div==true)
            {    
                temp2 = temp2*10 + 2;
                t3.setText(String.valueOf(temp2));
            }
        }  
        else if (e.getSource()==b3) 
        {
            if(plus==false && minus==false && mul==false && div==false)
            {    
                temp1 = temp1*10 + 3;
                t1.setText(String.valueOf(temp1));
            }
            else if(plus==true || minus==true || mul==true || div==true)
            {    
                temp2 = temp2*10 + 3;
                t3.setText(String.valueOf(temp2));
            }
        }  
        else if (e.getSource()==b4) 
        {
            if(plus==false && minus==false && mul==false && div==false)
            {
                temp1 = temp1*10 + 4;
                t1.setText(String.valueOf(temp1));
            }
            else if(plus==true || minus==true || mul==true || div==true)
            {
                temp2 = temp2*10 + 4;
                t3.setText(String.valueOf(temp2));
            }
        }  
        else if (e.getSource()==b5) 
        {
            if(plus==false && minus==false && mul==false && div==false)
            {
                temp1 = temp1*10 + 5;
                t1.setText(String.valueOf(temp1));
            }
            else if(plus==true || minus==true || mul==true || div==true)
            {
                temp2 = temp2*10 + 5;
                t3.setText(String.valueOf(temp2));
            }
        }  
        else if (e.getSource()==b6) 
        {
            if(plus==false && minus==false && mul==false && div==false)
            {
                temp1 = temp1*10 + 6;
                t1.setText(String.valueOf(temp1));
            }
            else if(plus==true || minus==true || mul==true || div==true)
            {
                temp2 = temp2*10 + 6;
                t3.setText(String.valueOf(temp2));
            }
        }  
        else if (e.getSource()==b7) 
        {
            if(plus==false && minus==false && mul==false && div==false)
            {
                temp1 = temp1*10 + 7;
                t1.setText(String.valueOf(temp1));
            }
            else if(plus==true || minus==true || mul==true || div==true)
            {
                temp2 = temp2*10 + 7;
                t3.setText(String.valueOf(temp2));
            }
        }  
        else if (e.getSource()==b8) 
        {
            if(plus==false && minus==false && mul==false && div==false)
            {
                temp1 = temp1*10 + 8;
                t1.setText(String.valueOf(temp1));
            }
            else if(plus==true || minus==true || mul==true || div==true)
            {
                temp2 = temp2*10 + 8;
                t3.setText(String.valueOf(temp2));
            }
        }  
        else if (e.getSource()==b9) 
        {
            if(plus==false && minus==false && mul==false && div==false)
            {
                temp1 = temp1*10 + 9;
                t1.setText(String.valueOf(temp1));
            }
            else if(plus==true || minus==true || mul==true || div==true)
            {
                temp2 = temp2*10 + 9;
                t3.setText(String.valueOf(temp2));
            }
        } 
        //operators
        else if (e.getSource()==b10) 
        {
            t1.setText(String.valueOf(temp1));
            t2.setText("+");
            x= temp1;
            plus = true;
        } 
        else if (e.getSource()==b11) 
        {
            t1.setText(String.valueOf(temp1));
            t2.setText("-");
            x = temp1;
            minus = true;
        }
         else if (e.getSource()==b12) 
        {
            t1.setText(String.valueOf(temp1));
            t2.setText("*");
            x = temp1;
            mul = true;
        } 
        else if (e.getSource()==b13) 
        {
            t1.setText(String.valueOf(temp1));
            t2.setText("/");
            x = temp1;
            div = true;
        } 
        //result
        else if (e.getSource()==b14) 
        {
            t3.setText(String.valueOf(temp2));
            y = temp2;
            if(plus)
                z=x+y;
            else if(minus)
                z= x-y;
            else if(mul)
                z= x*y;
            else if(div)
                z= x/y;
            String s3 = String.valueOf(z);
            t4.setText(s3);
            
        }
        //reset
        else if (e.getSource()==b15)
        {
            t1.setText("");
            t2.setText("");
            t3.setText("");
            t4.setText("");
            temp1=0;
            temp2=0;
            plus = false; minus=false; mul=false; div = false;
        }
    }
}

// main class
public class Calculator
{
    public static void main(String[] args) 
    {
        MyFrame frame1 = new MyFrame();
        frame1.setSize(500,500);
        frame1.setVisible(true);
        frame1.setLayout(new GridLayout(6,3,20,55));
    }
}