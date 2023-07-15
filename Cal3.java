package calculator;
import javax. swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.*;
import java.util.Stack;

class Calc extends JFrame implements ActionListener{
    int x=50,y=40,z=50;
    double a,b,result,temp1=0,temp2=0;
    StringBuffer strbuff = new StringBuffer();
    Container c;
    JPanel panel1,panel2;
    JTextField t1;
    JButton b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,bplus,bmin,bmul,bdiv,bpoint,bequal,breset,bback,bb1,bb2;
    Font font1 = new Font("SansSerif", Font.BOLD, 20);
    Calculation c1 = new Calculation();
    Calc(){
        setTitle("calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setBounds(1000,100,500,500);
        Border br = BorderFactory.createLineBorder(Color.black);

        c=getContentPane();
        panel1=new JPanel();
        panel2=new JPanel();
        panel1.setLayout(null);
        panel2.setLayout(null);

        // calculator screen area  
        t1=new JTextField();
        t1.setBounds(10,10, 380,80);
        t1.setMargin(new Insets(10, 20, 10, 20));
        t1.setFont(font1);
        panel1.add(t1); 

        //calculator button area
        b1=new JButton("1");  
        b1.setBounds(x,y,z,z);
        b2=new JButton("2");  
        b2.setBounds(x+60,y,z,z);
        b3=new JButton("3");  
        b3.setBounds(x+120,y,z,z);
        b4=new JButton("4");  
        b4.setBounds(x,y+60,z,z);
        b5=new JButton("5");  
        b5.setBounds(x+60,y+60,z,z);
        b6=new JButton("6");  
        b6.setBounds(x+120,y+60,z,z);
        b7=new JButton("7");  
        b7.setBounds(x,y+120,z,z);
        b8=new JButton("8");  
        b8.setBounds(x+60,y+120,z,z);
        b9=new JButton("9");  
        b9.setBounds(x+120,y+120,z,z);
        bpoint=new JButton(".");  
        bpoint.setBounds(x,y+180,z,z);
        b0=new JButton("0");  
        b0.setBounds(x+60,y+180,z,z);
        breset=new JButton("↻");
        breset.setBounds(x+120,y+180,z,z);
        bequal=new JButton("=");  
        bequal.setBounds(x+120,y+180,z,z);

        bplus=new JButton("+");  
        bplus.setBounds(x+180,y,z,z);
        bmin=new JButton("-");  
        bmin.setBounds(x+180,y+60,z,z);
        bmul=new JButton("*");  
        bmul.setBounds(x+180,y+120,z,z);
        bdiv=new JButton("/");  
        bdiv.setBounds(x+180,y+180,z,z);
        bback=new JButton("←");
        bback.setBounds(x+240,y,z,z);
        breset=new JButton("↻");
        breset.setBounds(x+240,y+60,z,z);
        bb1=new JButton("(");
        bb1.setBounds(x+240,y+120,z,z);
        bb2=new JButton(")");
        bb2.setBounds(x+240,y+180,z,z);

        b0.addActionListener(this); b1.addActionListener(this); b2.addActionListener(this); 
        b3.addActionListener(this); b4.addActionListener(this); b5.addActionListener(this); 
        b6.addActionListener(this); b7.addActionListener(this); b8.addActionListener(this); 
        b9.addActionListener(this); bpoint.addActionListener(this); bequal.addActionListener(this);
        bback.addActionListener(this); breset.addActionListener(this); bplus.addActionListener(this);
        bmin.addActionListener(this); bmul.addActionListener(this); bdiv.addActionListener(this); 
        bb1.addActionListener(this); bb2.addActionListener(this);  

        panel2.add(b0); panel2.add(b1); panel2.add(b2);
        panel2.add(b3); panel2.add(b4); panel2.add(b5);
        panel2.add(b6); panel2.add(b7); panel2.add(b8);
        panel2.add(b9); panel2.add(bback); panel2.add(breset);
        panel2.add(bplus); panel2.add(bmin); panel2.add(bmul);
        panel2.add(bdiv); panel2.add(bpoint); panel2.add(bequal);
        panel2.add(bb1); panel2.add(bb2);

        //panel decoration
        panel1.setBackground(Color.GRAY);
        panel1.setBorder(br);
        panel1.setBounds(50,40,400,100);
        panel2.setBackground(Color.darkGray);
        panel2.setBorder(br);
        panel2.setBounds(50,140,400,300);
        
        c.add(panel1);
        c.add(panel2);
        setVisible(true);
    }

    //getting input, working of buttons
    public void chk(int x){
        strbuff.append(String.valueOf(x));
        t1.setText(strbuff.toString());
    }
    public void actionPerformed(ActionEvent e){
        if (e.getSource()==b0) {
            chk(0);
        } else if (e.getSource()==b1) {
            chk(1);
        } else if (e.getSource()==b2) {
            chk(2);
        } else if (e.getSource()==b3) {
            chk(3);
        } else if (e.getSource()==b4) {
            chk(4);
        } else if (e.getSource()==b5) {
            chk(5);
        } else if (e.getSource()==b6) {
            chk(6);
        } else if (e.getSource()==b7) {
            chk(7);
        } else if (e.getSource()==b8) {
            chk(8);
        } else if (e.getSource()==b9) {
            chk(9);
        } else if (e.getSource()==bpoint) {
            strbuff.append(".");
            t1.setText(strbuff.toString());
        } else if (e.getSource()==bequal) {
            try {
                strbuff.append(" = "+ String.valueOf(c1.evaluate(strbuff.toString())));
                t1.setText(strbuff.toString());
            } catch (Exception ex) {
                ex.getMessage();
                t1.setText(" Invalid input ");
            }
        } else if (e.getSource()==bplus) {
            strbuff.append("+");
            t1.setText(strbuff.toString());
        } else if (e.getSource()==bmin) {
            strbuff.append("-");
            t1.setText(strbuff.toString());
        } else if (e.getSource()==bmul) {
            strbuff.append("*");
            t1.setText(strbuff.toString());
        } else if (e.getSource()==bdiv) {
            strbuff.append("/");
            t1.setText(strbuff.toString());
        } else if (e.getSource()==bback) {
            if (strbuff.length()>=1) {
                strbuff.replace(strbuff.length()-1, strbuff.length(), "");
            t1.setText(strbuff.toString());
            }
        } else if (e.getSource()==breset) {
            temp1=0;temp2=0;
            strbuff.replace(0, strbuff.length(), "");
            t1.setText(null);
        } else if (e.getSource()==bb1) {
            strbuff.append("(");
            t1.setText(strbuff.toString());
        } else if (e.getSource()==bb2) {
            strbuff.append(")");
            t1.setText(strbuff.toString());
        }
    }

}

//calculation 
class Calculation{
    public int evaluate(String exp)
    {
             Stack<Integer> operands = new Stack<>();  //Operand stack
             Stack<Character> operations = new Stack<>();  //Operator stack
             for(int i=0; i<exp.length();i++)
             {
                 char c = exp.charAt(i);
                 if(Character.isDigit(c))   //check if it is number
                 {
                     //Entry is Digit, and it could be greater than a one-digit number
                     int num = 0;
                     while (Character.isDigit(c))
                     {
                               num = num*10 + (c-'0');
                               i++;
                             if(i < exp.length())
                             {
                                 c = exp.charAt(i);
                             }
                             else
                             {
                                 break;
                             }
                     }
                     i--;
                 operands.push(num);
             }
             else if(c=='(')
             {
                 operations.push(c);   //push character to operators stack
             }
             //Closed brace, evaluate the entire brace
             else if(c==')')
             {
                 while(operations.peek()!='(')
                 {
                         int output = performOperation(operands, operations);
                         operands.push(output);   //push result back to stack
                 }
                 operations.pop();
             }
            
             // current character is operator
             else if(isOperator(c))
             {
                 while(!operations.isEmpty() && precedence(c)<=precedence(operations.peek()))
                 {
                         int output = performOperation(operands, operations);
                         operands.push(output);   //push result back to stack
                 }
                   operations.push(c);   //push the current operator to stack
             }
         }
        
         while(!operations.isEmpty())
         {
             int output = performOperation(operands, operations);
             operands.push(output);   //push final result back to stack
         }
         return operands.pop();
    }
    
    static int precedence(char c)
    {
             switch (c)
             {
                 case '+':
                 case '-':
                     return 1;
                 case '*':
                 case '/':
                     return 2;
                 case '^':
                     return 3;
             }
             return -1;
    }
    
    public int performOperation(Stack<Integer> operands, Stack<Character> operations)
    {
             int a = operands.pop();
             int b = operands.pop();
             char operation = operations.pop();
             switch (operation)
             {
                 case '+':
                     return a + b;
                 case '-':
                     return b - a;
                 case '*':
                     return a * b;
                 case '/':
                     return b/a;
             }
             return 0;
    }
    
    public boolean isOperator(char c)
    {
             return (c=='+'||c=='-'||c=='/'||c=='*'||c=='^');
    }
    
}

// driver class
public class Cal3
{
    public static void main(String[] args) 
    {
        new Calc();
    }
}

/*
 * bug1 = point
 * bug2 = error handling
 * bug3 = checking if the enerting input sequence is correct
 */