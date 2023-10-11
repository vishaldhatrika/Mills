package sprint1.production;

import javax.swing.*;
import java.net.URL;

import static java.awt.Color.*;

class NMMGameGUIFrame extends JFrame{

    private JPanel leftPanel;
    private JPanel rightPanel;
    private JPanel centerPanel;
    private JLabel imageLabel;


    public NMMGameGUIFrame() {
        this.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        this.setSize(1200,800);
        this.setTitle("Mills - 9 Men's Morris Game - by Pals");
        this.setResizable(false);
        this.setLocationRelativeTo(null); // to display the JFrame centered to the screen
        this.setVisible(true);

        leftPanel = new JPanel();
        centerPanel = new JPanel();
        rightPanel = new JPanel();

        leftPanel.setBackground(GRAY);
        leftPanel.setSize(285,800);
        leftPanel.setBounds(0,0,285,800);
        leftPanel.setVisible(true);

        centerPanel.setBackground(BLUE);
        centerPanel.setSize(630,800);
        centerPanel.setBounds(285,0,630,800);
        centerPanel.setVisible(true);

        rightPanel.setBackground(RED);
        rightPanel.setSize(285,800);
        rightPanel.setBounds(915,0,285,800);
        rightPanel.setVisible(true);

        this.add(leftPanel);
        this.add(rightPanel);
        this.add(centerPanel);


        URL imageUrl=NMMGameGUI.class.getResource("/nineBoard.png");
        ImageIcon icon=new ImageIcon(imageUrl);


        imageLabel = new JLabel(icon);
        centerPanel.add(imageLabel);

    }

}

public class NMMGameGUI {
    public NMMGameGUI() {

        Board nineMenMorrisBoard=new Board(9);
        nineMenMorrisBoard.setupNineBoard();
        NMMGame nmmGame = new NMMGame();

        NMMGameGUIFrame nmmGameGUIFrame = new NMMGameGUIFrame();
    }
}
