import javax.swing.*;
import java.awt.*;
class gui {
    public static void main(String args[]) {
        int textBoxSize = 10;
        //Creating the Frame
        JFrame frame = new JFrame("Pong");
        // Ends program when "X" is selected
        // Not essential to program
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);

        //Creating the MenuBar and adding components
        JMenuBar mb = new JMenuBar();
        JMenu m1 = new JMenu("FILE");
        JMenu m2 = new JMenu("Help");
        JMenu m3 = new JMenu("Win");
        mb.add(m1);
        mb.add(m2);
        mb.add(m3);
        JMenuItem m1_1 = new JMenuItem("Open");
        JMenuItem m1_2 = new JMenuItem("Save as");
        m1.add(m1_1);
        m1.add(m1_1);
        JMenuItem m3_1 = new JMenuItem("Lol u thought");
        m3.add(m3_1);

        //Creating the panel at bottom and adding components
        JPanel panel = new JPanel(); // the panel is not visible in output
        JLabel label = new JLabel("Enter Text");
        JTextField tf = new JTextField(textBoxSize); // Text box is 10 characters long
        JButton biggerButton = new JButton("Bigger");
        JButton smallerButton = new JButton("Smaller");
        panel.add(label); // Components Added using Flow Layout
        panel.add(tf);
        //panel.add(biggerButton);
        biggerButton.setBounds(10, 0, 100, 50);
        tf.add(biggerButton);
        panel.add(smallerButton);

        // Text Area at the Center
        JTextArea ta = new JTextArea();

        //Adding Components to the frame.
        frame.getContentPane().add(BorderLayout.SOUTH, panel);
        frame.getContentPane().add(BorderLayout.NORTH, mb);
        frame.getContentPane().add(BorderLayout.CENTER, ta);
        frame.setVisible(true);
        while(true){
            if (textBoxSize < 20) {
                textBoxSize += 1;
                System.out.println(textBoxSize);
                tf.setColumns(textBoxSize);
            }
        }
    }
}