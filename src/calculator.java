import javax.swing.*;
import java.awt.event.*;
class Calc implements ActionListener{

    JFrame frame;
    JTextField text;
    JButton btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn0,btndivide,btnmultiply,btnsubtract,btnaddition,btnpoint,btnequals,btnclear,btnmod;
    static double a=0,b=0,result=0;
    static int operator=0;
    Calc()
    {
        frame=new JFrame("Calculator");
        text=new JTextField();
        btn1=new JButton("1");
        btn2=new JButton("2");
        btn3=new JButton("3");
        btn4=new JButton("4");
        btn5=new JButton("5");
        btn6=new JButton("6");
        btn7=new JButton("7");
        btn8=new JButton("8");
        btn9=new JButton("9");
        btn0=new JButton("0");
        btndivide=new JButton("/");
        btnmultiply=new JButton("*");
        btnsubtract=new JButton("-");
        btnaddition=new JButton("+");
        btnpoint=new JButton(".");
        btnequals=new JButton("=");
         btnmod=new JButton("%");
        btnclear=new JButton("Clear");


        text.setBounds(30,40,280,30);
        btn1.setBounds(40,100,50,40);
        btn2.setBounds(110,100,50,40);
        btn3.setBounds(180,100,50,40);
        btndivide.setBounds(250,100,50,40);

        btn4.setBounds(40,170,50,40);
        btn5.setBounds(110,170,50,40);
        btn6.setBounds(180,170,50,40);
        btnmultiply.setBounds(250,170,50,40);

        btn7.setBounds(40,240,50,40);
        btn8.setBounds(110,240,50,40);
        btn9.setBounds(180,240,50,40);
        btnsubtract.setBounds(250,240,50,40);

        btnpoint.setBounds(40,310,50,40);
        btn0.setBounds(110,310,50,40);
        btnmod.setBounds(180,310,50,40);
        btnaddition.setBounds(250,310,50,40);

        btnequals.setBounds(60,380,100,40);
        btnclear.setBounds(180,380,100,40);

        frame.add(text);

        frame.add(btn7);
        frame.add(btn8);
        frame.add(btn9);
        frame.add(btndivide);
        frame.add(btn4);
        frame.add(btn5);
        frame.add(btn6);
        frame.add(btnmultiply);
        frame.add(btn1);
        frame.add(btn2);
        frame.add(btn3);
        frame.add(btnsubtract);
        frame.add(btnpoint);
        frame.add(btn0);
        frame.add(btnequals);
        frame.add(btnaddition);
         frame.add(btnmod);
        frame.add(btnclear);

        frame.setLayout(null);
        frame.setVisible(true);
        frame.setSize(350,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);


        btn1.addActionListener(this);
        btn2.addActionListener(this);
        btn3.addActionListener(this);
        btn4.addActionListener(this);
        btn5.addActionListener(this);
        btn6.addActionListener(this);
        btn7.addActionListener(this);
        btn8.addActionListener(this);
        btn9.addActionListener(this);
        btn0.addActionListener(this);
        btnaddition.addActionListener(this);
        btndivide.addActionListener(this);
        btnmultiply.addActionListener(this);
        btnsubtract.addActionListener(this);
        btnpoint.addActionListener(this);
        btnequals.addActionListener(this);
        btnmod.addActionListener(this);
        btnclear.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==btn1)
            text.setText(text.getText().concat("1"));


        if(e.getSource()==btn2)
            text.setText(text.getText().concat("2"));

        if(e.getSource()==btn3)
            text.setText(text.getText().concat("3"));

        if(e.getSource()==btn4)
            text.setText(text.getText().concat("4"));

        if(e.getSource()==btn5)
            text.setText(text.getText().concat("5"));

        if(e.getSource()==btn6)
            text.setText(text.getText().concat("6"));

        if(e.getSource()==btn7)
            text.setText(text.getText().concat("7"));

        if(e.getSource()==btn8)
            text.setText(text.getText().concat("8"));

        if(e.getSource()==btn9)
            text.setText(text.getText().concat("9"));

        if(e.getSource()==btn0)

            text.setText(text.getText().concat("0"));

        if(e.getSource()==btnpoint)
            text.setText(text.getText().concat("."));

        if(e.getSource()==btnaddition)
        {
            a=Double.parseDouble(text.getText());
            operator=1;
            text.setText("");
        }

        if(e.getSource()==btnsubtract)
        {
            a=Double.parseDouble(text.getText());
            operator=2;
            text.setText("");
        }

        if(e.getSource()==btnmultiply)
        {
            a=Double.parseDouble(text.getText());
            operator=3;
            text.setText("");
        }
        if(e.getSource()==btnmod)
        {
            a=Double.parseDouble(text.getText());
            operator=5;
            text.setText("");
        }

        if(e.getSource()==btndivide)
        {
            a=Double.parseDouble(text.getText());
            operator=4;
            text.setText("");
        }

        if(e.getSource()==btnequals)
        {
            b=Double.parseDouble(text.getText());

            switch(operator)
            {
                case 1: result=a+b;
                    break;

                case 2: result=a-b;
                    break;

                case 3: result=a*b;
                    break;

                case 4: result=a/b;
                    break;

                case 5: result=a%b;
                       break;


                default: result=0;
            }

            text.setText(""+result);
        }

        if(e.getSource()==btnclear)
            text.setText("");


    }
    public static void main(String...s)
    {
        new Calc();
    }
}