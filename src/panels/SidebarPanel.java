package panels;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

import buttons.ExitButton;
import buttons.ResetButton;

public class SidebarPanel extends JPanel {

    private static final long serialVersionUID = -7628215125405256424L;

    private int winCount;
    private int loseCount;

    private JLabel win;
    private Image wResize = (new ImageIcon("src\\resources\\win.png")).getImage().getScaledInstance(50, 50,
            Image.SCALE_SMOOTH);
    private ImageIcon winIcon = new ImageIcon(wResize);

    private JLabel lose;
    private Image lResize = (new ImageIcon("src\\resources\\lose.png")).getImage().getScaledInstance(50, 50,
            Image.SCALE_SMOOTH);
    private ImageIcon loseIcon = new ImageIcon(lResize);

    private ResetButton reset;

    public SidebarPanel() {

        this.setPreferredSize(new Dimension(200, 1));
        this.setBorder(BorderFactory.createRaisedBevelBorder());
        this.setBackground(new Color(0x121212));
        this.setLayout(null);

        win = new JLabel();
        win.setIcon(winIcon);
        win.setFont(new Font("Hack", Font.BOLD, 25));
        win.setText("Won: 0");
        win.setBounds(10, 70, 200, 50);

        lose = new JLabel();
        lose.setIcon(loseIcon);
        lose.setFont(new Font("Hack", Font.BOLD, 25));
        lose.setText("Lost: 0");
        lose.setBounds(10, 200, 200, 50);

        reset = new ResetButton();
        reset.addActionListener(e -> {
            if (e.getSource() == reset) {
                this.setWinCount(0);
                this.setLoseCount(0);
            }
        });

        this.add(win);
        this.add(lose);
        this.add(reset);
        this.add(new ExitButton());
        this.setVisible(true);

    }

    public int getWinCount() {
        return winCount;
    }

    public void setWinCount(int winCount) {
        this.winCount = winCount;
        win.setText("Won: " + getWinCount());
    }

    public int getLoseCount() {
        return loseCount;
    }

    public void setLoseCount(int loseCount) {
        this.loseCount = loseCount;
        lose.setText("Lost: " + getLoseCount());
    }

}
