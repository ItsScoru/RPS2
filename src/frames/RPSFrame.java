package frames;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

import panels.GamePanel;
import panels.SidebarPanel;

public class RPSFrame extends JFrame {

    private static final long serialVersionUID = -7628215125405256424L;

    ImageIcon frameIcon = new ImageIcon("src\\resources\\frameIcon.png");

    private SidebarPanel sidebar = new SidebarPanel();
    private GamePanel game = new GamePanel();

    public RPSFrame() {

        this.setTitle("RPS 2.0"); // stands for Rock Paper Scissors
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setSize(800, 600);
        this.setIconImage(frameIcon.getImage());
        this.getContentPane().setBackground(new Color(0x121212));
        this.setLayout(new BorderLayout());
        this.add(sidebar, BorderLayout.WEST);
        this.add(game);

        game.getPlayerPanel().getRock().addActionListener(e -> {

            int cpuMove = game.generateCpuMove();

            game.remove(game.getPlayerPanel());
            game.add(game.getRematchPanel(), BorderLayout.SOUTH);
            game.getRematchPanel().setVisible(true);

            if (cpuMove == 1) {
                game.getRematchPanel().getResult().setText("IT'S A TIE!");
            } else if (cpuMove == 2) {
                game.getRematchPanel().getResult().setText("YOU LOSE!");
                sidebar.setLoseCount(sidebar.getLoseCount() + 1);
            } else if (cpuMove == 3) {
                game.getRematchPanel().getResult().setText("YOU WIN!");
                sidebar.setWinCount(sidebar.getWinCount() + 1);
            }

        });

        game.getPlayerPanel().getPaper().addActionListener(e -> {

            int cpuMove = game.generateCpuMove();

            game.remove(game.getPlayerPanel());
            game.add(game.getRematchPanel(), BorderLayout.SOUTH);
            game.getRematchPanel().setVisible(true);

            if (cpuMove == 1) {
                game.getRematchPanel().getResult().setText("IT'S A TIE!");
            } else if (cpuMove == 2) {
                game.getRematchPanel().getResult().setText("YOU LOSE!");
                sidebar.setLoseCount(sidebar.getLoseCount() + 1);
            } else if (cpuMove == 3) {
                game.getRematchPanel().getResult().setText("YOU WIN!");
                sidebar.setWinCount(sidebar.getWinCount() + 1);
            }

        });

        game.getPlayerPanel().getScissors().addActionListener(e -> {

            int cpuMove = game.generateCpuMove();

            game.remove(game.getPlayerPanel());
            game.add(game.getRematchPanel(), BorderLayout.SOUTH);
            game.getRematchPanel().setVisible(true);

            if (cpuMove == 1) {
                game.getRematchPanel().getResult().setText("IT'S A TIE!");
            } else if (cpuMove == 2) {
                game.getRematchPanel().getResult().setText("YOU LOSE!");
                sidebar.setLoseCount(sidebar.getLoseCount() + 1);
            } else if (cpuMove == 3) {
                game.getRematchPanel().getResult().setText("YOU WIN!");
                sidebar.setWinCount(sidebar.getWinCount() + 1);
            }

        });

        game.getRematchPanel().getRematch().addActionListener(e -> {

            game.getRematchPanel().setVisible(false);
            game.remove(game.getRematchPanel());
            game.add(game.getPlayerPanel(), BorderLayout.SOUTH);
            game.getCpuPanel().getMove().setText("THE COMPUTER IS GENERATING A MOVE");
            game.getCpuPanel().getMove().setIcon(null);

        });

        this.setVisible(true);

    }

}