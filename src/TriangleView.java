import javax.swing.*;
import java.awt.*;

public class TriangleView
{
    public void printDetails(float height, float base, float hypotenuse){
        JFrame frame = new JFrame("Right Triangle");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(560, 200);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        JPanel panel = new JPanel();
        LayoutManager layout = new FlowLayout();
        panel.setLayout(layout);
        JButton jHeight = new JButton("New Height :" + height);
        JButton jBase = new JButton("New Base :" + base);
        JButton jHypotenuse = new JButton("New Hypotenuse :" + hypotenuse);
        panel.add(jHeight);
        panel.add(jBase);
        panel.add(jHypotenuse);
        frame.getContentPane().add(panel, BorderLayout.CENTER);
    }
}
