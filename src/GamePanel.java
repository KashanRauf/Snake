import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class GamePanel extends JPanel {

    static final int WIDTH = 600;
    static final int HEIGHT = 600;
    static final int UNIT_SIZE = 30;
    static final int X_UNITS = WIDTH/UNIT_SIZE;
    static final int Y_UNITS = HEIGHT/UNIT_SIZE;
    boolean isRunning = false;
    Coordinate apple;
    ArrayList<Coordinate> snake = new ArrayList<>();

    public GamePanel() {
        setPreferredSize(new Dimension(WIDTH, HEIGHT));
        setBackground(Color.black);
    }

    // Currently impacting background color, should be black but is gray
    public void paintComponent(Graphics g) {
        for (int i = 0; i < (int)X_UNITS/2; i++) {
            g.drawLine(i*UNIT_SIZE, 0, i*UNIT_SIZE, 600);
        }
        for (int i = 0; i < (int)Y_UNITS/2; i++) {
            g.drawLine(0, i*UNIT_SIZE, 600, i*UNIT_SIZE);
        }
    }
}
