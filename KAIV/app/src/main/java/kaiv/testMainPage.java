package kaiv;

import javax.swing.*;
import java.awt.*;

public class testMainPage extends JFrame{
    private JPanel mainPage = new JPanel();
    private JButton createBlockbtn = new JButton();
    private JButton createDeadlockbtn = new JButton();
    private JButton editBlockbtn = new JButton();
    private JPanel sidebar = new JPanel();
    private JPanel emptyPanel = new JPanel();


    public testMainPage () {
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
        mainPage.setLayout(new GridBagLayout());
        GridBagConstraints constraints = new GridBagConstraints();

        sidebar.setPreferredSize(new Dimension(250, 600-15));
        sidebar.setBackground(new Color(255,125,125));

        constraints.gridx = 0;
        constraints.gridy = 0;
        constraints.gridwidth = 1;
        constraints.gridheight = 6;
        constraints.fill = GridBagConstraints.BOTH; // Fill both horizontally and vertically
        constraints.weightx = 1.0; // Make the sidebar take up available horizontal space
        constraints.weighty = 1.0; // Make the sidebar take up available vertical space
        mainPage.add(sidebar, constraints);

        int btnHeight = 120;
        int btnWidth = 190;

        // Create Block Button
        constraints.gridx = 1;
        constraints.gridy = 5;
        constraints.gridwidth = 1;
        constraints.gridheight = 1;
        constraints.fill = GridBagConstraints.NONE;
        constraints.weightx = 0.0;
        constraints.weighty = 0.0; // Reset weighty for buttons
        constraints.anchor = GridBagConstraints.CENTER;
        createBlockbtn.setPreferredSize(new Dimension(btnWidth, btnHeight));
        mainPage.add(createBlockbtn, constraints);
//        mainPage.add(btnPanel(createBlockbtn, btnWidth, btnHeight), constraints);



        constraints.gridx = 1;
        constraints.gridy = 1;
        createBlockbtn.setPreferredSize(new Dimension(btnWidth, btnHeight));
        createBlockbtn.setBackground(new Color(125, 200, 25));
        mainPage.add(createBlockbtn, constraints);

        constraints.gridx = 3;
        constraints.gridy = 3;
        emptyPanel.setPreferredSize(new Dimension(btnWidth, btnHeight));
        emptyPanel.setBackground(new Color(200, 125, 50));
        mainPage.add(emptyPanel);

        // Create Deadlock Button
        constraints.gridx = 2;
        constraints.gridy = 4;
        createDeadlockbtn.setPreferredSize(new Dimension(btnWidth, btnHeight));
        createDeadlockbtn.setBackground(new Color(125, 12, 200));
        mainPage.add(createDeadlockbtn, constraints);

        // Edit Block Button
        constraints.gridx = 3;
        constraints.gridy = 2;
        editBlockbtn.setPreferredSize(new Dimension(btnWidth, btnHeight));
        editBlockbtn.setBackground(new Color(35, 100, 200));
        mainPage.add(editBlockbtn, constraints);


    }

    private JPanel btnPanel (JButton btn, int btnWidth, int btnHeight) {
        JPanel panel = new JPanel();
//        panel.setLayout(new BorderLayout());
        panel.setLayout(new FlowLayout());
//        panel.setMaximumSize(new Dimension(btnWidth, btnHeight));
        btn.setPreferredSize(new Dimension(btnWidth, btnHeight));
        panel.add(btn, BorderLayout.CENTER);

        return panel;
    }
}
