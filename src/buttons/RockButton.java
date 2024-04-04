package buttons;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;

public class RockButton extends JButton {

    private static final long serialVersionUID = -7628215125405256424L;

    public RockButton() {

        this.setFocusable(false);
        this.setFont(new Font("Hack", Font.BOLD, 25));
        this.setEnabled(true);
        this.setVisible(true);
        this.setBackground(new Color(0x202020));
        this.setBorderPainted(false);

    }

}
