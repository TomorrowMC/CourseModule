import javax.swing.*;
import java.awt.*;

/**
 * @author Yifei.Hu
 * @create 2021-11--16:52
 */
public class GraTest {
    public static void main(String[] args) {
        JFrame j1= new JFrame("good");
        j1.setSize(290,290);

        j1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JpTest jpTest = new JpTest(0, 0, 20, 20);
        j1.add(jpTest);
        j1.setVisible(true);

    }

}
class JpTest extends JPanel{
    public JpTest(int x,int y,int w,int h) {
        super();

    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        setBackground(Color.green);
    }
}
