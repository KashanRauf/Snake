import javax.swing.*;
import java.awt.*;
import java.awt.Graphics;

public class GameFrame extends JFrame{

    static final int FRAME_HEIGHT = 600;
    static final int FRAME_WIDTH = 600;
    static final int

    public GameFrame() {
        this.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        this.setTitle("Snake Game");
        this.getContentPane().setBackground(Color.BLACK);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.setVisible(true);
    }
}
