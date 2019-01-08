import javax.swing.JFrame;

public class ucsc{
    public static void main(String[] args) {
        ui uiObject = new ui();
        uiObject.setDefaultCloseOpereation(JFrame.EXIT_ON_CLOSE);
        uiObject.setSize(275,180);
        uiObject.setVisible(true);
    }
}