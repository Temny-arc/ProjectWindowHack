package Gamemodes;

import javax.swing.*;
import java.awt.*;

public class clickstop {

    private JFrame frame;

    public clickstop(){
        this.frame= new JFrame("Click to the end");

    }

    public int engage() {

        int y = (int) Toolkit.getDefaultToolkit().getScreenSize().getHeight();
        int x = (int) Toolkit.getDefaultToolkit().getScreenSize().getWidth();


        frame.setSize(x, y);

        return 0;
    }
}
