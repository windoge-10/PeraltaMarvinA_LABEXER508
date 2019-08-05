import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class ButtonTest extends JFrame {
    private JButton plainButton, fancyButton;
    public ButtonTest() {
        super("Testing Buttons");
        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        plainButton = new JButton("Plain Button");
        plainButton.setToolTipText("Button1");
        c.add(plainButton);
        Icon image1 = new ImageIcon("HTMLFILE.gif");
        Icon image2 = new ImageIcon("folder.gif");
        fancyButton = new JButton("Fancy Button", image1);
        fancyButton.setRolloverIcon(image2);
        fancyButton.setToolTipText("Button2");
        c.add(fancyButton);
        ButtonHandler handler = new ButtonHandler();
        fancyButton.addActionListener(handler);
        plainButton.addActionListener(handler);
        setSize(275, 100);
        show();
    }

    private class ButtonHandler implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            JOptionPane.showMessageDialog(null, "You pressed: " +
                    e.getActionCommand());
        }
    }
}

public class LABEXER50803 {
    public static void main(String args[])
    {
        ButtonTest app = new ButtonTest();
        app.addWindowListener(new WindowAdapter() {
                                  public void windowClosing(WindowEvent e)
                                  {
                                      System.exit(0);
                                  }
                              }
        );
    }

}
