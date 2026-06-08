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

    private static JFrame frame; // the backround
    private static JTextArea textArea = new JTextArea();
    private static ArrayList<ArrayList<Integer>> locs = new ArrayList<>();
    private static ArrayList<texts> texts;
    private static ArrayList<clickstopasset> closethem = new ArrayList<>();


    public clickstop() {
    }


    public void initiate() {
        frame = new JFrame("Click to the end");


        int y = (int) Toolkit.getDefaultToolkit().getScreenSize().getHeight();
        int x = (int) Toolkit.getDefaultToolkit().getScreenSize().getWidth();


        frame.setSize(x, y);
        frame.setLayout(new FlowLayout());
    }

    public void engage(ArrayList<texts> text, ArrayList<ArrayList<Integer>> loc) throws InterruptedException {
        texts = text;
        locs = loc;
        generatePlace();
        initiate();
        frame.setLayout(new BorderLayout());
        frame.setBackground(new Color(20, 200, 185));
        JPanel panel = new JPanel();
        panel.setBackground(new Color(20, 200, 185));
        panel.setLayout(new BorderLayout());
        frame.add(panel);

        JTextArea textArea = new JTextArea();
        textArea.setEditable(false);
        textArea.setFont(new Font("Serif", Font.PLAIN, 20));
        textArea.setBackground(new Color(20, 200, 185));
        textArea.setForeground(Color.BLACK);
        panel.add(textArea,BorderLayout.CENTER);





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
        for (int i = 0; i < 5; i++) {
            closethem.add(new clickstopasset("placeholder", locs.get(rd.nextInt(locs.size())), 0, texts.get(rd.nextInt(texts.size())).getOut(), i));
            closethem.get(i).reveal();

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
     *
     * @param starttime time when was the frame created
     */

    public void addsome(long starttime, int parrent, int pos) {
        Random rd = new Random();
        long time = System.nanoTime();

        System.out.println(parrent);
        if (parrent < 5) {

            closethem.add(pos, new clickstopasset("placeholder", locs.get(rd.nextInt(locs.size())), parrent+1, texts.get(rd.nextInt(texts.size())).getOut(), pos));
            closethem.get(pos).reveal();


            if (((time - starttime) / 1000000) > 5000) {
                int how = 0;
                //TODO fix or improve this
                for (int i = 0; i < closethem.size(); i++) {
                    if (!closethem.get(i).isActive()) {// loop that will break once the new frame is added
                        closethem.add(i,new clickstopasset("Placeholder", locs.get(rd.nextInt(locs.size())), 0, texts.get(rd.nextInt(texts.size())).getOut(), i));
                        closethem.get(i).reveal();
                        break;
                    }
                    how++;
                }
                if (how>20){
                    System.out.println("You have lost");
                    JTextArea textArea = new JTextArea("You hava managed to lose all you have now");
                    textArea.setEditable(false);
                    frame.add(textArea);
                    turnoff();
                }

            }


        } else {
            closethem.get(pos).turnoff();
            int end = 0;
            for (int i = 0; i < closethem.size(); i++) {
                if (closethem.get(i).isActive()) {
                    end++;
                }
            }
            System.out.println(end);
            if (end == 0) {
                System.out.println("GG you won");

                JTextArea textArea = new JTextArea("Congratulations! you have managed to save your computer");
                textArea.setEditable(false);
                textArea.setFont(new Font("Serif", Font.PLAIN, 20));
                textArea.setBackground(new Color(20, 200, 185));
                textArea.setForeground(Color.BLACK);
                frame.add(textArea,BorderLayout.CENTER);
                turnoff();


            }
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

    public void turnoff(){
        for (int i = 0; i < closethem.size(); i++) {
            closethem.get(i).turnoff();
        }
        

    }

















}
