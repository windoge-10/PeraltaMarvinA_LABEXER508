import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class ListTest extends JFrame {
    private JList colorList;
    private Container c;
    private String colorNames[] = {
            "Black", "Cyan", "Dark Gray", "Gray", "Green", "Light Gray",
            "Magenta", "Orange", "Pink", "Red", "White", "Yellow"};
    private Color colors[] = {
            Color.black, Color.cyan, Color.darkGray, Color.gray, Color.green,
            Color.lightGray, Color.magenta, Color.orange, Color.pink, Color.red,
            Color.white, Color.yellow};
public ListTest() {
        super("List Test");
        c = getContentPane();
        c.setLayout(new FlowLayout());
        colorList = new JList(colorNames);
        colorList.setVisibleRowCount(5);
        colorList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        c.add(new JScrollPane(colorList));
        colorList.addListSelectionListener (
        new ListSelectionListener() {
public void valueChanged(ListSelectionEvent e)
        {
        c.setBackground(colors[colorList.getSelectedIndex()]);
        }
        }
        );
        setSize(350, 150);
        show();
        }
        }

public class LABEXER50807 {
    public static void main(String args[])
    {
        ListTest app = new ListTest();
        app.addWindowListener(new WindowAdapter() {
                                  public void windowClosing(WindowEvent e)
                                  {
                                      System.exit(0);
                                  }
                              }
        );
    }
}