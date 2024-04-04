package panels;

import java.awt.Image;
import java.util.Random;
import java.awt.BorderLayout;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class GamePanel extends JPanel{
	
	private static final long serialVersionUID = -7628215125405256424L;

    private Image rock = (new ImageIcon("src\\resources\\rock.png")).getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH);
    private ImageIcon rockIcon = new ImageIcon(rock);

    private Image paper = (new ImageIcon("src\\resources\\paper.png")).getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH);
    private ImageIcon paperIcon = new ImageIcon(paper);

    private Image scissors = (new ImageIcon("src\\resources\\win.png")).getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH);
    private ImageIcon scissorsIcon = new ImageIcon(scissors);

    private CPUPanel cpuPanel = new CPUPanel();
    private PlayerPanel playerPanel = new PlayerPanel();
    private RematchPanel rematchPanel = new RematchPanel();

    public GamePanel() {

        this.setLayout(new BorderLayout());

        playerPanel.getRock().setIcon(rockIcon);
        playerPanel.getPaper().setIcon(paperIcon);
        playerPanel.getScissors().setIcon(scissorsIcon);

        this.add(cpuPanel, BorderLayout.NORTH);
        this.add(playerPanel, BorderLayout.SOUTH);

    }

    public CPUPanel getCpuPanel() {
        return cpuPanel;
    }

    public PlayerPanel getPlayerPanel() {
        return playerPanel;
    }

    public RematchPanel getRematchPanel() {
        return rematchPanel;
    }

    public int generateCpuMove() {
        Random rdm = new Random();
        int i = rdm.nextInt(3) + 1;

        switch (i) {
            case 1:
                cpuPanel.getMove().setText("THE COMPUTER CHOSE ROCK!");
                cpuPanel.getMove().setIcon(rockIcon);
                break;
            case 2:
                cpuPanel.getMove().setText("THE COMPUTER CHOSE PAPER!");
                cpuPanel.getMove().setIcon(paperIcon);
                break;
            case 3:
                cpuPanel.getMove().setText("THE COMPUTER CHOSE SCISSORS!");
                cpuPanel.getMove().setIcon(scissorsIcon);
                break;
        }

        return i;
    }

}
