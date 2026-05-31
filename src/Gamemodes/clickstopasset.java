package Gamemodes;

import ButtonsFun.basedButton;
import Gamemodes.Load.questions;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;

public class clickstopasset{

    private JFrame frame;
    private boolean active;
    private static int delay;

    public clickstopasset(String title, int x, int y,int pos){
        long startTime = System.nanoTime();
        frame = new JFrame(title);
        frame.setLocationRelativeTo(null);
        frame.setLocation(x,y);
        frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        this.active = true;



        frame.setSize(300,200);



        frame.setBackground(new Color(80, 60, 38));

        JTextArea yap = new JTextArea("Who the fuck are you?");
        yap.setEditable(false);

        yap.setFont(new Font("Serif", Font.PLAIN, 20));

        JButton close = new JButton("Close");
        close.addActionListener(e -> {
            clickstop del = new clickstop();
            del.addsome(startTime,0,pos);

            frame.dispose();
        });

        frame.add(yap, BorderLayout.CENTER);

        frame.add(close, BorderLayout.SOUTH);

        frame.setResizable(false);





    }


    public clickstopasset(String title, ArrayList<Integer> arr, int parrentnum,String text,int pos){
        long startTime = System.nanoTime();
        frame = new JFrame(title);
        frame.setLocationRelativeTo(null);
        Random rd = new Random();
        frame.setLocation(arr.get(0) + rd.nextInt(100)-50,arr.get(1) +rd.nextInt(100)-50);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.active = true;





        frame.setSize(300,200);



        frame.setBackground(new Color(80, 60, 38));

        JTextArea yap = new JTextArea(text);// displays question
        yap.setEditable(false);

        yap.setFont(new Font("Serif", Font.PLAIN, 20));

        JButton close = new JButton("Close");
        close.addActionListener(e -> {
            clickstop del = new clickstop();
            del.addsome(startTime,parrentnum,pos);
            this.active = false;
            frame.dispose();
        });

        frame.add(yap, BorderLayout.CENTER);

        frame.add(close, BorderLayout.SOUTH);

        frame.setResizable(false);





    }


    public boolean isActive() {
        return active;
    }

    public void reveal() {
        frame.setVisible(true);
    }











}
