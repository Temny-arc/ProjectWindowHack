package Gamemodes;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;

public class clickstop {

    private JFrame frame; // the backround
    private static int currentframes; // counter of how many frames are in the place at once
    private static ArrayList<ArrayList<Integer>> locs = new ArrayList<>();



    public clickstop() {
    }



    public void initiate(){
        frame= new JFrame("Click to the end");


        int y = (int) Toolkit.getDefaultToolkit().getScreenSize().getHeight();
        int x = (int) Toolkit.getDefaultToolkit().getScreenSize().getWidth();


        frame.setSize(x, y);
        frame.setLayout(new FlowLayout());
    }
    public void engage() throws InterruptedException {

        generatePlace();
        initiate();
        JPanel panel = new JPanel(); // why do i want this, cuz i can, also this is background
        panel.setLayout(new BorderLayout());
        panel.setBackground(new Color(200, 100, 20));

        frame.add(panel, BorderLayout.CENTER);






/*

        Timer t = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                closewindow c = new closewindow("Nanomachines",0,0);
            }



        });


*/
        frame.setVisible(true);
        int tooMany = 0;
        ArrayList<clickstopasset> closethem = new ArrayList();
        for (int i = 0; i < 10; i++) {
            closethem.add(new clickstopasset("Gleba",i*10,i*1000));
            closethem.get(i).reveal();
            currentframes++;
        }


        frame.add(panel);






        long starter = System.nanoTime();
        long ender = System.nanoTime();
        /*
        while (tooMany <10) {
            ender = System.nanoTime();
            if (((ender - starter) / 1000000) > 1000) {
                starter = System.nanoTime();
                System.out.println(starter);
















                tooMany ++;
            }
        }

*/

/*
        while (tooMany < 20) {
            tooMany = 0;
            closethem.add(new clickstopasset("Gleba",0,0));
            closethem.getLast().start();
            for (int i = 0; i < closethem.size(); i++) {
                if (closethem.get(i).isActive()){
                    tooMany++;
                }
            }
            Thread.sleep(1000);
        }
*/


        


    }

    /**
     * this is basic method for adding new frames or screens its based of the time when the frame was created and the current time
     * @param starttime time when was the frame created
     */

    public void addsome(long starttime,int parrent){
        Random rd = new Random();
        long time = System.nanoTime();


        if (currentframes <= 20) {
            if (parrent<10) {

                clickstopasset c = new clickstopasset("placeholder", locs.get(rd.nextInt(locs.size())), parrent + 1);
                c.reveal();
                if (((time - starttime) / 1000000) > 5000) {
                    currentframes++;
                    clickstopasset d = new clickstopasset("Placeholder", 100, 0);
                    d.reveal();

                }
            } else {
                currentframes--;
            }
        } else if (currentframes <=1) {
            System.out.println("GG you won");

        } else {
            System.out.println("GG you lost");
        }

    }



    public void generatePlace(){

        double y =  Toolkit.getDefaultToolkit().getScreenSize().getHeight();
        double x =  Toolkit.getDefaultToolkit().getScreenSize().getWidth();
        int locx = (int) Math.floor(x/400);
        int locy = (int) Math.floor(y/300);;


        System.out.println("y done");

        int offsetx = (int) Math.floor(x - 400*locx) /2;
        int offsety = (int) Math.floor(y - 300*locy) /2;
        System.out.println(locx + "loc x " + locy);
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
