package ButtonsFun;

import javax.swing.*;
import java.awt.*;

public class pushbutton {



    public static void startButton(JButton button){
        button.setBackground(new Color(130, 71, 23));
        button.setForeground(new Color(240,230,140));
        button.setFont(new Font("Arial",Font.BOLD,40));
       // button.setIconTextGap(3);
        button.setFocusPainted(false);
        button.setBorderPainted(false);
        button.setMaximumSize(new Dimension(Integer.MAX_VALUE, 48));
        button.setAlignmentX(Component.CENTER_ALIGNMENT);



        button.addActionListener(e -> {

            button.setBackground(new Color(0,255,0));
        });



    }




}
