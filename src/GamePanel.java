import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JPanel;

public class GamePanel extends JPanel {

    static final int WIDTH = 600;
    static final int HEIGHT = 600;
    static final int UNIT_SIZE = 30;
    static final int X_UNITS = WIDTH/UNIT_SIZE;
    static final int Y_UNITS = HEIGHT/UNIT_SIZE;
    boolean isRunning = false;
    Coordinate apple;
    ArrayList<Coordinate> snake = new ArrayList<>();
    Random r;

    public GamePanel() {
        r = new Random();
        setPreferredSize(new Dimension(WIDTH, HEIGHT));
        setBackground(Color.black);
        start();
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        // Draws a grid
        g.setColor(Color.BLUE);
        for (int i = 0; i < X_UNITS; i++) {
            g.drawLine(i*UNIT_SIZE, 0, i*UNIT_SIZE, 600);
        }
        for (int i = 0; i < Y_UNITS; i++) {
            g.drawLine(0, i*UNIT_SIZE, 600, i*UNIT_SIZE);
        }

        // Draw apple
        g.setColor(Color.RED);
        g.fillRect(apple.x, apple.y, UNIT_SIZE-1, UNIT_SIZE-1);

        // Draw snake, head is a different color
        g.setColor(new Color(0, 148, 0));
        g.fillRect(snake.get(0).x, snake.get(0).y, UNIT_SIZE, UNIT_SIZE);
        g.setColor(Color.GREEN);
        for (int i = 1; i < snake.size(); i++) {
            System.out.println("body");
            g.fillRect(snake.get(i).x, snake.get(i).y, UNIT_SIZE, UNIT_SIZE);
        }
    }

    // Starts the game
    private void start() {
        isRunning = true;
        spawnApple();

        // Initializes snake body
        snake.add(new Coordinate(3, 3));
        snake.add(new Coordinate(2, 3));
    }

    // Places the apple at a random position, max 1 apple
    private void spawnApple() {
        int x = r.nextInt(X_UNITS);
        int y = r.nextInt(Y_UNITS);
        apple = new Coordinate(x, y);
        apple.x+=1;
        apple.y+=1;
    }
}
