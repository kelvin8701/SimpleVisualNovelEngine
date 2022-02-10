import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class EngineMenu extends JFrame
{
    public static String filename;
    private JPanel panel;
    private static JTextField textField;
    private JLabel background;
    private JButton startEngineButton;
    private JButton exitEngineButton;
    private JButton testButton;
    private ImageIcon iconBg;


    EngineMenu()
    {
        this.setLocation(50,50);
        this.setSize(877, 473);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setResizable(false);


        panel = new JPanel();
        panel.setLayout(null);
        panel.setSize(877, 473);

        textField = new JTextField("Input File Name Here", 30);
        textField.setToolTipText("Only Accepts .txt!");
        textField.setBounds(425, 170 , 150, 30);



        iconBg = new ImageIcon("images//visualnovelmaker1.jpg");


        background = new JLabel();
        background.setIcon(iconBg);
        background.setBounds(0,0,877,473);
        background.setVisible(true);

        testButton = new JButton("Test File");
        testButton.setLayout(null);
        testButton.setBounds(575, 170, 150, 30);
        testButton.addActionListener(new ActionListener()
        {
            public void actionPerformed (ActionEvent e)
            {
                filename = textField.getText();
                System.out.println(filename);
            }
        });


        startEngineButton = new JButton("Start Engine");
        startEngineButton.setLayout(null);
        startEngineButton.setBounds(425, 325, 200, 50);
        startEngineButton.addActionListener(new ActionListener()
        {
            public void actionPerformed (ActionEvent e)
            {
                filename = textField.getText();

                    if(Game.isTrue(filename)){
                     new Game();
                }
            }
        });


        exitEngineButton = new JButton("Exit Engine");
        exitEngineButton.setLayout(null);
        exitEngineButton.setBounds(625, 325, 200, 50);
        exitEngineButton.setPreferredSize(new Dimension(200,50));
        exitEngineButton.addActionListener(new ActionListener()
        {
            public void actionPerformed (ActionEvent e)
            {
                System.exit(0);
            }
        });

        panel.add(textField);
        panel.add(startEngineButton);
        panel.add(exitEngineButton);
        panel.add(background);
        add(panel);
        setVisible(true);
    }
}