package Gamemodes;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class clickstop {

    private JFrame frame;

    public clickstop(){
        this.frame= new JFrame("Click to the end");

    }

    public void engage() {

        int y = (int) Toolkit.getDefaultToolkit().getScreenSize().getHeight();
        int x = (int) Toolkit.getDefaultToolkit().getScreenSize().getWidth();


        frame.setSize(x, y);

        closewindow c = new closewindow("Nanomachines",0,0);

/*

        Timer t = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                closewindow c = new closewindow("Nanomachines",0,0);
            }



        });


*/





        frame.setVisible(true);










    }








    private class closewindow {

        private JFrame frame;



        public closewindow(String title, int x, int y){
            frame = new JFrame("Hello");
            frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
            frame.setLocation(x,y);

            JPanel panel = new JPanel();
            panel.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.X_AXIS));


            frame.setResizable(false);
            frame.add(panel);

            frame.setVisible(true);
        }







    }




}
