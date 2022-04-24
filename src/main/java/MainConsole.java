import javax.swing.*;
import java.awt.*;

public class MainConsole {

    public JFrame frame;
    public JTextField mainConsoleTextField;
    public ScrollPane mainConsoleScrolledTextField;
    public JButton fileButton;

    MainConsole() {
        frame = new JFrame("RockyShell");
        frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        frame.setSize(900, 550);
        frame.setVisible(true);

    }

    public static void main(String[] args) {
        new MainConsole();
    }
}
