import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ui extends JFrame{

    private JFrame item;

    public ui(){

        super("This is the title bar");
        setLayout(new FlowLayout());

        item = new JLabel("This is a sentence");
        item1.setToolTipText("This is gonna hover");
        add(item);

    }
}