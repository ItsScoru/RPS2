package panels;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JPanel;

import buttons.PaperButton;
import buttons.RockButton;
import buttons.ScissorsButton;

public class PlayerPanel extends JPanel {

    private static final long serialVersionUID = -7628215125405256424L;

    private RockButton rock = new RockButton();

    private PaperButton paper = new PaperButton();

    private ScissorsButton scissors = new ScissorsButton();

    public PlayerPanel() {

        this.setLayout(new GridLayout(0, 3));
        this.setBackground(new Color(0x101010));
        this.setVisible(true);
        this.setPreferredSize(new Dimension(1, 311));

        this.add(rock);
        this.add(paper);
        this.add(scissors);

    }

    public RockButton getRock() {
        return rock;
    }

    public PaperButton getPaper() {
        return paper;
    }

    public ScissorsButton getScissors() {
        return scissors;
    }

}
