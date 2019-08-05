import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class RadioButtonTest extends JFrame{
    private JTextField t;
    private Font plainFont, boldFont, italicFont, boldItalicFont;
    private JRadioButton plain, bold, italic, boldItalic;
    private ButtonGroup radioGroup;
    public RadioButtonTest()
    {
        super("RadioButton Test");
        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        t = new JTextField("Watch the font style change.", 25);
        c.add(t);
        plain = new JRadioButton("Plain", true);
        bold = new JRadioButton("Bold", false);
        italic = new JRadioButton("Italic", false);
        boldItalic = new JRadioButton("Bold/Italic", false);
        c.add(plain);
        c.add(bold);
        c.add(italic);
        c.add(boldItalic);
        RadioButtonHandler handler = new RadioButtonHandler();
        plain.addItemListener(handler);
        bold.addItemListener(handler);
        italic.addItemListener(handler);
        boldItalic.addItemListener(handler);
        radioGroup = new ButtonGroup();
        radioGroup.add(plain);
        radioGroup.add(bold);
        radioGroup.add(italic);
        radioGroup.add(boldItalic);
        plainFont = new Font("Verdana", Font.PLAIN, 14);
        boldFont = new Font("Verdana", Font.BOLD, 14);
        italicFont = new Font("Verdana", Font.ITALIC, 14);
        boldItalicFont = new Font("Verdana", Font.BOLD+Font.ITALIC, 14);
        t.setFont(plainFont);
        setSize(350, 100);
        show();
    }

    private class RadioButtonHandler implements ItemListener {
        public void itemStateChanged(ItemEvent e)
        {
            if (e.getSource() == plain)
                t.setFont(plainFont);
            else if (e.getSource() == bold)
                t.setFont(boldFont);
            else if (e.getSource() == italic)
                t.setFont(italicFont);
            else if (e.getSource() == boldItalic)
                t.setFont(boldItalicFont);
            t.repaint();
        }
    }
}

public class LABEXER50805 {
    public static void main(String args[])
    {
        RadioButtonTest app = new RadioButtonTest();
        app.addWindowListener(new WindowAdapter() {
                                  public void windowClosing(WindowEvent e)
                                  {
                                      System.exit(0);
                                  }
                              }
        );
    }
}