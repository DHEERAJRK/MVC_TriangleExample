import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MVCPatternDemo {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Right Triangle");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        createUI(frame);
        frame.setSize(560, 200);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    private static RightTriangle getTriangle(int height, int base){
        RightTriangle student = new RightTriangle();
        student.setBase(base);
        student.setHeight(height);
        return student;
    }

    private static void createUI(final JFrame frame){
        JPanel panel = new JPanel(new GridLayout(2, 1));
        LayoutManager layout = new FlowLayout();
        panel.setLayout(layout);

        JButton button = new JButton("Update sides of Triangle");
        final JLabel label = new JLabel();
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JTextField height = new JTextField(5);
                JTextField base = new JTextField(5);
                panel.add(height);
                panel.add(base);
                JOptionPane.showMessageDialog(null, panel);
                if(height.getText() != null && base.getText() !=null)
                {
                    JButton btn = new JButton("UpdateAndCalculate");
                    TriangleView view = new TriangleView();
                    btn.addActionListener(new controller(getTriangle(Integer.parseInt(height.getText()), Integer.parseInt(base.getText())), view));
                    btn.doClick();
                }else {
                    label.setText("0");
                }
            }
        });

        panel.add(button);
        panel.add(label);
        frame.getContentPane().add(panel, BorderLayout.CENTER);
    }
}