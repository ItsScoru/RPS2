package panels;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

import buttons.RematchButton;

public class RematchPanel extends JPanel {

    private static final long serialVersionUID = -7628215125405256424L;

    RematchButton rematch = new RematchButton();
    JLabel result = new JLabel();

    public RematchPanel() {

        this.setLayout(null);
        this.setBackground(new Color(0x101010));
        this.setPreferredSize(new Dimension(1, 311));

        result.setFont(new Font("Hack", Font.BOLD, 25));
        result.setHorizontalAlignment(JLabel.CENTER);
        result.setHorizontalTextPosition(JLabel.CENTER);
        result.setVerticalAlignment(JLabel.CENTER);
        result.setBounds(145, 90, 300, 50);
        this.add(result);

        rematch.setBounds(210, 220, 170, 50);
        this.add(rematch);

    }

    public RematchButton getRematch() {
        return rematch;
    }

    public JLabel getResult() {
        return result;
    }

}
