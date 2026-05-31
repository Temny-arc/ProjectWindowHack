package Gamemodes;

import ButtonsFun.basedButton;
import ButtonsFun.pushbutton;
import Gamemodes.Load.questions;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Random;

public class questionasset {
     private JFrame frame;


     public questionasset(String title, ArrayList<Integer> arr, questions q) {
          frame = new JFrame(title);
          frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          frame.setSize(500, 500);
          frame.setLocationRelativeTo(null);
          frame.setResizable(false);
          frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));


          Random rd = new Random();
          frame.setLocation(arr.get(0) + rd.nextInt(100)-50,arr.get(1) +rd.nextInt(100)-50);
          frame.setBackground(new Color(255,236,188));
          frame.setForeground(new Color(255,236,188));
          JTextArea textArea = new JTextArea(q.getQuest());
          textArea.setEditable(false);
          textArea.setFont(new Font("Arial", Font.PLAIN, 22));
          textArea.setLineWrap(true);
          textArea.setBackground(new Color(255, 236, 188));
          textArea.setWrapStyleWord(true);
          frame.add(textArea);

          JButton ans1 = new JButton(q.getAns1());
          pushbutton.startbutton(ans1);


          ans1.addActionListener(e -> {
               if (q.getCorrect()==1){
                    Questions quest = new Questions(true);
                    quest.addsome();
               } else{
                    Questions quest = new Questions(false);
                    quest.addsome();
               }
               frame.dispose();
          });




          JButton ans2 = new JButton(q.getAns2());
          pushbutton.startbutton(ans2);

          ans2.addActionListener(e -> {
               if (q.getCorrect()==2){
                    Questions quest = new Questions(true);
                    quest.addsome();
               }else{
                    Questions quest = new Questions(false);
                    quest.addsome();
               }
               frame.dispose();

          });

          JButton ans3 = new JButton(q.getAns3());
          pushbutton.startbutton(ans3);

          ans3.addActionListener(e -> {
               if (q.getCorrect()==3){
                    Questions quest = new Questions(true);
                    quest.addsome();
               }else{
                    Questions quest = new Questions(false);
                    quest.addsome();
               }
               frame.dispose();
          });

          JButton ans4 = new JButton(q.getAns4());
          pushbutton.startbutton(ans4);

          ans4.addActionListener(e -> {
               if (q.getCorrect()==4){
                    Questions quest = new Questions(true);
                    quest.addsome();
               }else{
                    Questions quest = new Questions(false);
                    quest.addsome();
               }
               frame.dispose();
          });



          frame.add(ans1);
          frame.add(Box.createVerticalStrut(30));
          frame.add(ans2);
          frame.add(Box.createVerticalStrut(30));
          frame.add(ans3);
          frame.add(Box.createVerticalStrut(30));
          frame.add(ans4);
          frame.add(Box.createVerticalStrut(30));


          frame.setVisible(true);

     }



}
