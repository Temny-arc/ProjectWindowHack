package ButtonsFun;

import javax.swing.*;
import java.awt.*;

public class pushbutton {



    public static void startButton(JButton button){
        button.setBackground(new Color(0,100,255));
        button.setForeground(Color.white);
        button.setFont(new Font("Arial",Font.BOLD,40));
       // button.setIconTextGap(3);
        button.setFocusPainted(false);
        button.setBorderPainted(false);


        button.addActionListener(e -> {

            button.setBackground(new Color(0,255,0));
        });

    }


}
