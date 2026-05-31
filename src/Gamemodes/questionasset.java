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


          Random rd = new Random();
          frame.setLocation(arr.get(0) + rd.nextInt(100)-50,arr.get(1) +rd.nextInt(100)-50);

          JTextArea textArea = new JTextArea(q.getQuest());
          textArea.setEditable(false);
          textArea.setFont(new Font("Arial", Font.PLAIN, 24));
          textArea.setLineWrap(true);
          textArea.setWrapStyleWord(true);
          frame.add(textArea);

          JButton ans1 = new JButton(q.getAns1());
          pushbutton.startButton(ans1);

          ans1.addActionListener(e -> {

          });







          JButton ans2 = new JButton(q.getAns2());
          pushbutton.startButton(ans2);
          JButton ans3 = new JButton(q.getAns3());
          pushbutton.startButton(ans3);
          JButton ans4 = new JButton(q.getAns4());
          pushbutton.startButton(ans4);







          frame.setVisible(true);

     }



}
