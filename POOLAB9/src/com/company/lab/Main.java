package com.company.lab;

import javax.swing.*;

import java.awt.TextField;
import java.awt.event.*;


class Calc implements ActionListener
{
    JFrame frame;
    JTextField t;
    TextField errors;
    JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,bdiv,bmul,bsub,badd,bdec,beq,bdel,bclr;

    static double a=0,b=0,result=0;
    static int operator=0;

    Calc()
    {
        frame =new JFrame("Calculator");
        errors = new TextField();
        t=new JTextField();
        b1=new JButton("1");
        b2=new JButton("2");
        b3=new JButton("3");
        b4=new JButton("4");
        b5=new JButton("5");
        b6=new JButton("6");
        b7=new JButton("7");
        b8=new JButton("8");
        b9=new JButton("9");
        b0=new JButton("0");
        bdiv=new JButton("/");
        bmul=new JButton("*");
        bsub=new JButton("-");
        badd=new JButton("+");
        bdec=new JButton(".");
        beq=new JButton("=");
        bdel=new JButton("Delete");
        bclr=new JButton("Clear");

        t.setBounds(30,40,280,30);
        errors.setBounds(30,430,280,30);
        b7.setBounds(40,100,50,40);
        b8.setBounds(110,100,50,40);
        b9.setBounds(180,100,50,40);
        bdiv.setBounds(250,100,50,40);

        b4.setBounds(40,170,50,40);
        b5.setBounds(110,170,50,40);
        b6.setBounds(180,170,50,40);
        bmul.setBounds(250,170,50,40);

        b1.setBounds(40,240,50,40);
        b2.setBounds(110,240,50,40);
        b3.setBounds(180,240,50,40);
        bsub.setBounds(250,240,50,40);

        bdec.setBounds(40,310,50,40);
        b0.setBounds(110,310,50,40);
        beq.setBounds(180,310,50,40);
        badd.setBounds(250,310,50,40);

        bdel.setBounds(60,380,100,40);
        bclr.setBounds(180,380,100,40);

        frame.add(t);
        frame.add(b7);
        frame.add(b8);
        frame.add(b9);
        frame.add(bdiv);
        frame.add(b4);
        frame.add(b5);
        frame.add(b6);
        frame.add(bmul);
        frame.add(b1);
        frame.add(b2);
        frame.add(b3);
        frame.add(bsub);
        frame.add(bdec);
        frame.add(b0);
        frame.add(beq);
        frame.add(badd);
        frame.add(bdel);
        frame.add(bclr);
        frame.add(errors);

        frame.setLayout(null);
        frame.setVisible(true);
        frame.setSize(350,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        b0.addActionListener(this);
        badd.addActionListener(this);
        bdiv.addActionListener(this);
        bmul.addActionListener(this);
        bsub.addActionListener(this);
        bdec.addActionListener(this);
        beq.addActionListener(this);
        bdel.addActionListener(this);
        bclr.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e)
    {
        errors.setText(" ");

        if(e.getSource()==b1)
            t.setText(t.getText().concat("1"));

        if(e.getSource()==b2)
            t.setText(t.getText().concat("2"));

        if(e.getSource()==b3)
            t.setText(t.getText().concat("3"));

        if(e.getSource()==b4)
            t.setText(t.getText().concat("4"));

        if(e.getSource()==b5)
            t.setText(t.getText().concat("5"));

        if(e.getSource()==b6)
            t.setText(t.getText().concat("6"));

        if(e.getSource()==b7)
            t.setText(t.getText().concat("7"));

        if(e.getSource()==b8)
            t.setText(t.getText().concat("8"));

        if(e.getSource()==b9)
            t.setText(t.getText().concat("9"));

        if(e.getSource()==b0)
            t.setText(t.getText().concat("0"));

        if(e.getSource()==bdec)
            t.setText(t.getText().concat("."));

        if(e.getSource()==badd)
        {
            if(this.setA()) {
                operator=1;
                t.setText("");
            }
        }

        if(e.getSource()==bsub)
        {
            if(this.setA()) {
                operator=2;
                t.setText("");
            }
        }

        if(e.getSource()==bmul)
        {
            if(this.setA()) {
                operator=3;
                t.setText("");
            }
        }

        if(e.getSource()==bdiv)
        {
            if(this.setA()) {
                operator=4;
                t.setText("");
            }
        }

        if(e.getSource()==beq)
        {
            double lastValue = b;
            try {
                b=Double.parseDouble(t.getText());
            } catch(Exception invalidExpression){
                errors.setText("Bad input exception");
                b = lastValue;
                return;
            }

            try{
                if (b == 13){
                    throw new Exception();
                }
            } catch (Exception except){
                errors.setText("Unlucky number exception");
            }
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

                default: result=0;
            }

            t.setText(""+result);
        }

        if(e.getSource()==bclr)
            t.setText("");

        if(e.getSource()==bdel)
        {
            String s=t.getText();
            t.setText("");
            for(int i=0;i<s.length()-1;i++)
                t.setText(t.getText()+s.charAt(i));
        }
    }

    boolean setA(){
        double lastA = a;
        try {
            a=Double.parseDouble(t.getText());
        } catch(Exception invalidInput){
            errors.setText("Bad input exception");
            a = lastA;
            return false;
        }
        return true;
    }
}

public class Main{
    public static void main(String[] args)
    {
        new Calc();
    }
}