package H10;
import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class H10_1_2 extends Applet {

    TextField input;
    Label label;
    Button confirm;
    int result;
    int result2;

    public void init() {

        label = new Label("Voer getal in:");
        input = new TextField("",10);

        confirm = new Button("Ok");
        confirm.addActionListener(new Listener());

        add(label);
        add(input);
        add(confirm);
    }

    public void paint(Graphics g) {

        g.drawString("Laagste getal: " + result2,100,50);
        g.drawString("Hoogste getal:" + result,100,70);

    }

    class Listener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String output = input.getText();
            int getal = Integer.parseInt(output);
            if (getal > result) {
                result = getal;
                repaint();
            } else {
                if (result2 == 0) {
                    if (getal < result) {
                        result2 = getal;
                        repaint();
                    }
                } else {
                    if (getal < result2) {
                        result2 = getal;
                        repaint();
                    }
                }
            }
        }
    }
}