package Gamemodes;

import Gamemodes.Load.texts;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class clickstop {

    private JFrame frame; // the backround
    private static int currentframes; // counter of how many frames are in the place at once
    private static ArrayList<ArrayList<Integer>> locs = new ArrayList<>();
    private static ArrayList<texts> texts;
    private static HashMap<Integer,clickstopasset> closethem = new HashMap<>();


    public clickstop() {
    }



    public void initiate(){
        frame= new JFrame("Click to the end");


        int y = (int) Toolkit.getDefaultToolkit().getScreenSize().getHeight();
        int x = (int) Toolkit.getDefaultToolkit().getScreenSize().getWidth();


        frame.setSize(x, y);
        frame.setLayout(new FlowLayout());
    }
    public void engage(ArrayList<texts> text,ArrayList<ArrayList<Integer>> loc) throws InterruptedException {
        texts = text;
        locs = loc;
        generatePlace();
        initiate();
        frame.setBackground(new Color(200, 100, 20));








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


        Random rd = new Random();
        for (int i = 0; i < 3; i++) {
            closethem.put(i,new clickstopasset("placeholder", locs.get(rd.nextInt(locs.size())), 0,texts.get(rd.nextInt(texts.size())).getOut(),i));
            closethem.get(i).reveal();

            currentframes++;
        }








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

    public void addsome(long starttime,int parrent,int pos){
        Random rd = new Random();
        long time = System.nanoTime();


        if (currentframes <= 20 & currentframes >= 1) {
            if (parrent<10) {

                closethem.put( pos,new clickstopasset("placeholder", locs.get(rd.nextInt(locs.size())), parrent,texts.get(rd.nextInt(texts.size())).getOut(),pos));
                closethem.get(pos).reveal();
                if (((time - starttime) / 1000000) > 5000) {
                    currentframes++;
                    //TODO fix or improve this
                    for (int i = 0; i < closethem.size(); i++) {
                        if (!closethem.get(i).isActive()){
                            clickstopasset d = new clickstopasset("Placeholder",locs.get(rd.nextInt(locs.size())),0,texts.get(rd.nextInt(texts.size())).getOut(),i);
                            d.reveal();
                            break;
                        }
                    }




                }
            } else {
                currentframes--;
            }
        } else if (currentframes ==0) {
            System.out.println("GG you won");
            JFrame tFrame = new JFrame("Congratulations!");
            tFrame.setLayout(new BorderLayout());
            tFrame.setSize(frame.getWidth(), frame.getHeight());
            tFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            tFrame.setLocationRelativeTo(null);
            JTextArea textArea = new JTextArea("Congratulations! you have managed to save your computer");
            textArea.setEditable(false);

            tFrame.setVisible(true);


        } else {
            System.out.println("GG you lost");
        }

    }



    public void generatePlace(){

        double y =  Toolkit.getDefaultToolkit().getScreenSize().getHeight();
        double x =  Toolkit.getDefaultToolkit().getScreenSize().getWidth();
        int locx = (int) Math.floor(x/400);
        int locy = (int) Math.floor(y/300);;




        int offsetx = (int) Math.floor(x - 400*locx) /2;
        int offsety = (int) Math.floor(y - 300*locy) /2;

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
