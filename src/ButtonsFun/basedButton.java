package ButtonsFun;

import javax.swing.*;
import java.awt.*;

public class basedButton {

    public basedButton() {
        this.online = false;
    }

    public basedButton(boolean online) {
        this.online = online;
    }

    private boolean online;






    public void startButton(JButton button){
        button.setBackground(new Color(0,100,255));
        button.setForeground(Color.white);
        button.setFont(new Font("Arial",Font.BOLD,20));
        button.setFocusPainted(false);
        button.setBorderPainted(false);

        button.addActionListener(e -> {
            if (!this.online) {
                button.setBackground(new Color(0, 255, 40));
                this.online = true;
                button.setText("Online");
            } else {
                button.setBackground(new Color(255,0,40));
                this.online = false;
                button.setText("Offline");
            }

        });

    }



}
