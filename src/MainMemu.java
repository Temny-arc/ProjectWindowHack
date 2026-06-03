import ButtonsFun.basedButton;
import ButtonsFun.pushbutton;
import Gamemodes.Questions;
import Gamemodes.clickstop;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class MainMemu {

    private JFrame frame;
    private static Loader l;

    public MainMemu() {
        this.frame = new JFrame("Rules of nature");
    }

    public void ShowMenuScreen(){
        ArrayList<ArrayList<Integer>> locs = setupTheSpawn();
        int y = (int) Toolkit.getDefaultToolkit().getScreenSize().getHeight();
        int x = (int) Toolkit.getDefaultToolkit().getScreenSize().getWidth();





        frame.setSize(x,y);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // closes the app when X is clicked
        frame.setLocationRelativeTo(null); // centres the window on screen
        frame.setLayout(new BorderLayout());


        JLabel title = new JLabel("Hacking your window"); //
        title.setFont(new Font("SansSerif", Font.BOLD, 30));
        title.setForeground(new Color(250, 245, 230));
        title.setAlignmentX(Component.CENTER_ALIGNMENT); // centres the label horizontally
      //  title.setAlignmentY(Component.CENTER_ALIGNMENT);


        JLabel tagline = new JLabel("we offer you a choice to determine the fate of your computer "); // small subtitle under the title
        tagline.setFont(new Font("SansSerif", Font.PLAIN, 14)); // smaller and not bold
        tagline.setForeground(new Color(140, 195, 110));
        tagline.setAlignmentX(Component.CENTER_ALIGNMENT); // centres it horizontally

        javax.swing.JPanel header = new javax.swing.JPanel(); // panel that holds the title area
        header.setLayout(new BoxLayout(header, BoxLayout.Y_AXIS)); // stacks title and tagline vertically
        header.setBackground(new Color(0,128,128));
        header.setBorder(BorderFactory.createEmptyBorder(36, 0, 28, 0)); // adds breathing room above and below the text
        header.add(title); // puts the title into the header
        header.add(Box.createVerticalStrut(8)); // adds a small gap between title and tagline
        header.add(tagline); // puts the tagline into the header

        JTextArea description = new JTextArea(
                "Did you know that in Factorio: Space Gleba is the most unique planet?\n" +
                        "00:05 Gleba is a place of nature where everything is alive\n" +
                        "00:09 can rot into spoilage\n" +
                        "00:11 and don’t even make me start about the local wildlife\n" +
                        "00:14 because it’s even worse than an average Australian man\n" +
                        "00:18 When comes to uniqueness, you might be used to normal ore mining from Nauvis or to mining scrap from Fulgora\n" +
                        "00:25 However in hell, you build planting towers to cultivate and harvest various fruits.\n" +
                        "00:31 Yumako is mainly used as a nutrients source and for various craftings\n" +
                        "00:36 While jellyNuts can be turned into rocket fuel and into deez nuts jokes\n" +
                        "00:41 On gleba you unlock some technologies, but biolabs and belt stacking are simply the best\n" +
                        "00:47 Because pumping science fluids directly into biters will yield you 50% more research\n" +
                        "00:53 and make you feal like a real CIA agent\n" +
                        "00:56 With belt stacking throughput can improve up to 4 times\n" +
                        "01:00 Making yellow belt as efficient as a green ones from Vulcanus\n" +
                        "01:04 The only downside of gleba is the science pack pro\n"
        );

        description.setEditable(false); // player cannot type in this box
        description.setFocusable(false); // clicking it won't move keyboard focus here
        description.setBackground(new Color(252, 245, 220));
        description.setForeground(new Color(80, 60, 38));
        description.setFont(new Font("SansSerif", Font.PLAIN, 12)); // normal readable size
        description.setAlignmentX(Component.CENTER_ALIGNMENT);// centres it in the panel


        javax.swing.JPanel centre = new javax.swing.JPanel();
        centre.setLayout(new BoxLayout(centre, BoxLayout.Y_AXIS)); // stacks everything top to bottom
        centre.setBackground(new Color(255,253,224 ));
        centre.setBorder(BorderFactory.createEmptyBorder(100, x/4 + x/8, 20,  x/4 + x/8)); // padding so things don't touch the edges, or for an idiot it makes edges unacceptable by the buttons
        centre.setAlignmentX(Component.CENTER_ALIGNMENT);

        ArrayList<JButton> buttons = new ArrayList<>();



        for (int i = 0; i < 8; i++) { // number
            buttons.add(new JButton());
            pushbutton.startButton(buttons.get(i));
            buttons.get(i).setText("Placeholder");
            centre.add(buttons.get(i));
            centre.add(Box.createVerticalStrut(y/50));
        }

        buttons.get(0).setText("CLICK-STOP");
        buttons.get(1).setText("GUESS WHAT");
        buttons.get(2).setText("KIDS ARE CRUEL");
        buttons.get(3).setText("WE WILL SING");
        buttons.get(4).setText("Text placeholder");
        buttons.get(5).setText("Text placeholder");
        buttons.get(6).setText("Text placeholder");
        buttons.get(7).setText("I give up");









      //  centre.add(description); // adds the description paragraph

        // New Game button Listener
        buttons.get(0).addActionListener(e -> {

            try {
                new clickstop().engage(l.getTexts(),locs);
            } catch (InterruptedException ex) {
                throw new RuntimeException(ex);
            }


            frame.dispose();


        });

        buttons.get(1).addActionListener(e -> {

            Questions q =  new Questions("Question",l.getQuestions(),locs);
            q.startQuestion(x,y);
            frame.dispose();







        });


        // Load Game button Listener
        buttons.get(1).addActionListener(e -> {
            description.setText("Did you know that in Factorio: Space Gleba is the most unique planet?\n" +
                    "00:05 Gleba is a place of nature where everything is alive\n" +
                    "00:09 can rot into spoilage\n" +
                    "00:11 and don’t even make me start about the local wildlife\n" +
                    "00:14 because it’s even worse than an average Australian man\n" +
                    "00:18 When comes to uniqueness, you might be used to normal ore mining from Nauvis or to mining scrap from Fulgora\n" +
                    "00:25 However in hell, you build planting towers to cultivate and harvest various fruits.\n" +
                    "00:31 Yumako is mainly used as a nutrients source and for various craftings\n" +
                    "00:36 While jellyNuts can be turned into rocket fuel and into deez nuts jokes\n" +
                    "00:41 On gleba you unlock some technologies, but biolabs and belt stacking are simply the best\n" +
                    "00:47 Because pumping science fluids directly into biters will yield you 50% more research\n" +
                    "00:53 and make you feal like a real CIA agent\n" +
                    "00:56 With belt stacking throughput can improve up to 4 times\n" +
                    "01:00 Making yellow belt as efficient as a green ones from Vulcanus\n" +
                    "01:04 The only downside of gleba is the science pack pro\n"


            );
        });

        // Quit button listener
        buttons.getLast().addActionListener(e -> {
            System.exit(0); // close the entire application immediately
        });

        frame.add(header, BorderLayout.NORTH); // puts the green title area at the top
        frame.add(centre, BorderLayout.CENTER); // puts the buttons in the middle

        frame.setVisible(true); // makes the window appear on screen






























    }

    public ArrayList<ArrayList<Integer>> setupTheSpawn(){

        l = Loader.load("data.json");


        ArrayList<ArrayList<Integer>> locs = new ArrayList<>();

        double y =  Toolkit.getDefaultToolkit().getScreenSize().getHeight();
        double x =  Toolkit.getDefaultToolkit().getScreenSize().getWidth();
        int locx = (int) Math.floor(x/400);
        int locy = (int) Math.floor(y/300);




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
        return locs;
    }













}
