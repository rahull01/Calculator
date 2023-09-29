package cal2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;

public  class call2 implements ActionListener {

    JFrame jframe;
    JButton[] numbers = new JButton[10];
    JButton[] function = new JButton[8];
    JTextField field;
    JLabel jLabel;
    JPanel panel;
    JButton add, sub, multi, div, equal, dec;
    JButton del, clear;
   // ImageIcon i;
    double num1=0,num2=0,result=0;
    char operators;
   // double results = 0;
  Font f = new Font("Times New Roman", Font.BOLD, 30);


    public call2() {
        jframe = new JFrame();
        jframe.setSize(350, 500);
        jframe.setTitle( "                               calculator");
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jframe.setResizable(false);

        jframe.setLayout(null);
        ImageIcon icon = new ImageIcon("\"C:\\Users\\Rahul Singh\\OneDrive\\Desktop\\cal.png\"");
        jframe.setIconImage(icon.getImage());
       // jframe.setContentPane().setBackgroud(Color.blue);

        field = new JTextField();
        field.setBounds(28, 25, 280, 70);
        field.setEditable(false);
        field.setFont(f);

        add = new JButton("+");
        sub = new JButton("-");
        multi = new JButton("*");
        div = new JButton("/");
        equal = new JButton("=");
        dec = new JButton(".");
        del = new JButton("delete");
        clear = new JButton("clear");

        function[0] = add;
        function[1] = sub;
        function[2] = multi;
        function[3] = div;
        function[4] = equal;
        function[5] = dec;
        function[6] = del;
        function[7] = clear;

        for (int i = 0; i < 8; i++) {

            function[i].addActionListener(this);
            function[i].setFocusable(false);
        }
        for (int i = 0; i < 10; i++) {
            numbers[i] = new JButton(String.valueOf(i));
            numbers[i].addActionListener(this);
            numbers[i].setFocusable(false);
        }
        panel = new JPanel();
        panel.setBounds(28, 120, 280, 250);
        panel.setLayout(new GridLayout(4, 4, 10, 10));
        panel.setFont(f);

        panel.add(numbers[1]);
        panel.add(numbers[2]);
        panel.add(numbers[3]);
        panel.add(add);
        panel.add(numbers[4]);
        panel.add(numbers[5]);
        panel.add(numbers[6]);
        panel.add(sub);
        panel.add(numbers[7]);
        panel.add(numbers[8]);
        panel.add(numbers[9]);
        panel.add(multi);
        panel.add(dec);
        panel.add(numbers[0]);
        panel.add(equal);
        panel.add(div);


        del.setBounds(38, 390, 120, 50);


        clear.setBounds(172, 390, 120, 50);

        //jframe.add(i);
        jframe.add(panel);
        jframe.add(del);
        jframe.add(clear);
        jframe.add(field);
        jframe.setVisible(true);

    }


    public static void main(String[] args) {
        call2 c = new call2();

    }


    @Override
    public void actionPerformed(ActionEvent e) {
        for (int i = 0; i < 10; i++) {
            if (e.getSource() == numbers[i]) {
                field.setText(field.getText().concat(String.valueOf(i)));
            }
        }
            if (e.getSource()==dec)
            {
                field.setText(field.getText().concat("."));
            }
            if (e.getSource()==add)
            {
              num1 = Double.parseDouble(field.getText());
              operators = '+';
              field.setText(" ");
            }
             if (e.getSource()==sub)
             {
                 num1 = Double.parseDouble(field.getText());
                 operators='-';
                 field.setText(" ");
             }
             if (e.getSource()==multi)
             {
                 num1 = Double.parseDouble(field.getText());
                 operators='*';
                 field.setText(" ");
             }
             if (e.getSource() == div)
             {
                 num1 = Double.parseDouble(field.getText());
                 operators = '/';
                 field.setText(" ");
             }
             if (e.getSource()==clear)
             {
                 field.setText(" ");
             }
             if (e.getSource()==del)
             {
                 field.setText(" ");
             }
             if (e.getSource()==equal)
             {
                 num2 = Double.parseDouble(field.getText());
                 switch (operators)
                 {
                     case'+':
                         result = num1+num2;
                         break;
                     case'-':
                         result = num1-num2;      //git remote add origin https://github.com/rahull01/myfirstjava.git
                         break;
                     case'*':
                         result = num1*num2;
                         break;
                     case'/':
                         result =num1/num2;

                 }
                 field.setText(String.valueOf(num1+" "+operators+" "+num2+" = "+result +"-/"));
                 num1=result;
             }
    }
}
