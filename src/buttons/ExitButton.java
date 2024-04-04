package buttons;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;

public class ExitButton extends JButton {

    private static final long serialVersionUID = -7628215125405256424L;

    public ExitButton() {

        this.setText("EXIT");
        this.setFocusable(false);
        this.setFont(new Font("Hack", Font.BOLD, 25));
        this.addActionListener(e -> System.exit(0));
        this.setEnabled(true);
        this.setVisible(true);
        this.setBounds(25, 470, 150, 50);
        this.setBackground(new Color(0x121212));
        this.setBorderPainted(false);

    }

}
