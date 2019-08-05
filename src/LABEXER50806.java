import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class ComboBoxTest extends JFrame {
    private JComboBox images;
    private JLabel label;
    private String names[] = {"SUPERMAN.png", "dogecoin-300.png", "WINDOGE.jpg", "FISH5.png"};
    private Icon icons[] = {new ImageIcon(names[0]), new ImageIcon(names[1]),
            new ImageIcon(names[2]), new ImageIcon(names[3])};

    public ComboBoxTest() {
        super("Testing JComboBox");
        Container c = getContentPane();
        c.setLayout(new BorderLayout());
        images = new JComboBox(names);
        images.setMaximumRowCount(3);
        images.addItemListener(
                new ItemListener() {
                    public void itemStateChanged(ItemEvent e) {
                        label.setIcon(icons[images.getSelectedIndex()]);
                    }
                }
        );
        c.add("North", images);
        label = new JLabel(icons[0]);
        c.add("Center", label);
        setSize(350, 300);
        show();
    }
}

public class LABEXER50806 {
    public static void main(String args[])
    {
        ComboBoxTest app = new ComboBoxTest();
        app.addWindowListener(new WindowAdapter() {
                                  public void windowClosing(WindowEvent e)
                                  {
                                      System.exit(0);
                                  }
                              }
        );
    }
}

