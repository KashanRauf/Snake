import javax.swing.*;

public class GameFrame extends JFrame {

    public GameFrame() {
        setTitle("Snake Game");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(new GamePanel());
        setVisible(true);
        // Purpose of "packing" is to properly fit components based on preferred size (prevents HEIGHT_OFFSET, etc.)
        pack();
        setResizable(false);
    }
}
