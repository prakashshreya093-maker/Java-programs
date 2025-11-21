import java.awt.*;
import java.awt.event.*;
public class LabelButtonDemo extends Frame implements ActionListener {
    Label messageLabel;
    Button clickButton, exitButton;
    public LabelButtonDemo() {
        setTitle("AWT Label and Button Example");
        setSize(400, 300);
        setLayout(null);
        messageLabel = new Label("Click a button");
        messageLabel.setBounds(50, 50, 300, 30);
        add(messageLabel);
        clickButton = new Button("Click Me");
        clickButton.setBounds(50, 100, 80, 30);
        add(clickButton);
        exitButton = new Button("Exit");
        exitButton.setBounds(150, 100, 80, 30);
        add(exitButton);
        clickButton.addActionListener(this);
        exitButton.addActionListener(this);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == clickButton) {
            messageLabel.setText("You clicked the Click Me button!");
        } else if (e.getSource() == exitButton) {
            System.exit(0);
        }
    }
    public static void main(String[] args) {
        new LabelButtonDemo();
    }
}

