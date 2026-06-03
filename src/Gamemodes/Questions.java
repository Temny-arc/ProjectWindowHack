package Gamemodes;

import Gamemodes.Load.questions;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Random;

public class Questions {

    private JFrame frame;
    private static int correct;
    private static int incorrect;
    private static ArrayList<ArrayList<Integer>> locs;
    private static ArrayList<questions> q;

    public Questions(String title,ArrayList<questions> questions,ArrayList<ArrayList<Integer>> loc) {
        frame = new JFrame(title);
        locs = new ArrayList<>();

        q = questions;


    }

    public Questions(boolean b) {
        if (b){
            correct ++;
        } else {
            incorrect ++;
        }
    }


    public void startQuestion(int x, int y) {
        generatePlace();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setSize(x,y);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);




        Random rand = new Random();
        ArrayList<questionasset> closethem = new ArrayList();
        for (int i = 0; i < 3; i++) {
            closethem.add(new questionasset("Gleba",locs.get(rand.nextInt(locs.size())),q.get(rand.nextInt(q.size()))));


        }






    }


    public void addsome(){
        Random rd = new Random();

        if (correct+incorrect<12){
            questionasset m = new questionasset("Question",locs.get(rd.nextInt(locs.size())),q.get(rd.nextInt(q.size())));
        } else {
            System.out.println(correct+"Correct "+incorrect +"Incorrect ");
        }



    }

    public void generatePlace(){

        double y =  Toolkit.getDefaultToolkit().getScreenSize().getHeight();
        double x =  Toolkit.getDefaultToolkit().getScreenSize().getWidth();
        int locx = (int) Math.floor(x/500);
        int locy = (int) Math.floor(y/500);;




        int offsetx = (int) Math.floor(x - 500*locx) /2;
        int offsety = (int) Math.floor(y - 500*locy) /2;

        for (int i = 0; i < locx; i++) {
            for (int j = 0; j < locy; j++) {
                ArrayList<Integer> location = new ArrayList();
                location.add(i*400 +offsetx);
                location.add(j*300 +offsety);
                locs.add(location);
            }
        }
    }
}
