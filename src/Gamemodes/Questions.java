package Gamemodes;

import Gamemodes.Load.questions;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Random;

public class Questions {

    private JFrame frame;
    private static int currentframes;
    private static int correct;
    private static int incorrect;
    private static ArrayList<ArrayList<Integer>> locs;
    private static ArrayList<questions> q;

    public Questions(String title) {
        frame = new JFrame(title);
    }

    public Questions(boolean b) {
        if (b){
            correct ++;
        } else {
            incorrect ++;
        }
    }


    public void startQuestion() {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);



        Random rand = new Random();
        ArrayList<questionasset> closethem = new ArrayList();
        for (int i = 0; i < 10; i++) {
            closethem.add(new questionasset("Gleba",locs.get(rand.nextInt(locs.size())),q.get(rand.nextInt(q.size()))));

            currentframes++;
        }






    }
    public void addsome(long starttime,int parrent){
        Random rd = new Random();
        long time = System.nanoTime();


        if (currentframes <= 20) {
            if (parrent<10) {

                currentframes++;
            } else {
                currentframes--;
            }
        } else if (currentframes <=1) {
            System.out.println("GG you won");

        } else {
            System.out.println("GG you lost");
        }

    }
}
