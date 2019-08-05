import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class LabelTest extends JFrame {
    private JLabel label1, label2, label3;

    public LabelTest() {
        super("Testing JLabel");
        Container c = getContentPane();
        c.setLayout(new GridLayout(3, 1));
        label1 = new JLabel("Label with text");
        label1.setToolTipText("This is label1.");
        c.add(label1);
        Icon anchor = new ImageIcon("dogecoin-300.png");
        label2 = new JLabel("Label with text and icon", anchor, SwingConstants.LEFT);
        label2.setToolTipText("This is label2.");
        c.add(label2);
        label3 = new JLabel();
        label3.setText("Label with icon and text at the bottom");
        label3.setIcon(anchor);
        label3.setHorizontalTextPosition(SwingConstants.CENTER);
        label3.setVerticalTextPosition(SwingConstants.BOTTOM);
        label3.setToolTipText("This is label3");
        c.add(label3);
        setSize(275, 170);
        pack();
        show();
    }
}

public class LABEXER50801 {
    public static void main(String args[])
    {
        LabelTest app = new LabelTest();
        app.addWindowListener(new WindowAdapter() {
                                  public void windowClosing(WindowEvent e)
                                  {
                                      System.exit(0);
                                  }
                              }
        );
    }

}