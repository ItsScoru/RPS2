package panels;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class CPUPanel extends JPanel {

    private static final long serialVersionUID = -7628215125405256424L;

    private JLabel move = new JLabel();

    public CPUPanel() {

        this.setLayout(null);
        this.setBackground(new Color(0x121212));
        this.setVisible(true);
        this.setPreferredSize(new Dimension(1, 250));

        JLabel instructions = new JLabel();
        instructions.setText("CHOOSE A MOVE AND BEAT THE COMPUTER");
        instructions.setFont(new Font("Hack", Font.BOLD, 25));
        instructions.setVisible(true);
        instructions.setBounds(13, 10, 600, 50);

        move.setText("THE COMPUTER IS GENERATING A MOVE");
        move.setFont(new Font("Hack", Font.BOLD, 25));
        move.setVisible(true);
        move.setBounds(30, 120, 600, 50);

        this.add(instructions);
        this.add(move);

    }

    public JLabel getMove() {
        return move;
    }

}
