package kaiv;

import javax.swing.*;
import java.awt.*;

public class test2 extends JFrame{
    private JPanel mainPage = new JPanel();
    private JButton createBlockbtn = new JButton();
    private JButton createDeadlockbtn = new JButton();
    private JButton editBlockbtn = new JButton();
    private JPanel sidebar = new JPanel();


    public test2 () {
        this.setTitle("KAIV Dashboard");
        this.setSize((960+6), (600+29));
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.setBackground(new Color(255, 255, 255));

        createUIComponents();
        this.add(mainPage);
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
        mainPage.setSize(960, 600);
        mainPage.setBackground(new Color(255,255,255));

        sidebar.setPreferredSize(new Dimension(250, 600-15));
        sidebar.setBackground(new Color(255,125,125));

        int btnHeight = 120;
        int btnWidth = 190;
//        createBlockbtn.setMaximumSize(new Dimension(btnWidth, btnHeight));
//        createDeadlockbtn.setMaximumSize(new Dimension(btnWidth, btnHeight));
//        editBlockbtn.setMaximumSize(new Dimension(btnWidth, btnHeight));

        mainPage.setLayout(new GridLayout(1, 4));
        ((GridLayout)mainPage.getLayout()).setHgap(0);

        mainPage.add(sidebar);
//        mainPage.add(createBlockbtn);
//        mainPage.add(createDeadlockbtn);
//        mainPage.add(editBlockbtn);

        btnPanel(createBlockbtn, btnWidth, btnHeight);
        btnPanel(createDeadlockbtn, btnWidth, btnHeight);
        btnPanel(editBlockbtn, btnWidth, btnHeight);
    }

    private void btnPanel (JButton btn, int btnWidth, int btnHeight) {
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        panel.setMaximumSize(new Dimension(btnWidth, btnHeight));
        panel.add(btn, BorderLayout.CENTER);
        mainPage.add(panel);
    }
}
