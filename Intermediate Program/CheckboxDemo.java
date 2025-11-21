import java.awt.*;
import java.awt.event.*;

public class CheckboxDemo extends Frame implements ItemListener, ActionListener {

    Checkbox cb1, cb2, cb3;
    Label selectedLabel;
    Button exitButton;

    public CheckboxDemo() {
        setTitle("AWT Checkbox Example");
        setSize(400, 300);
        setLayout(null);

        cb1 = new Checkbox("Java");
        cb2 = new Checkbox("Python");
        cb3 = new Checkbox("C++");

        cb1.setBounds(50, 50, 100, 30);
        cb2.setBounds(50, 80, 100, 30);
        cb3.setBounds(50, 110, 100, 30);

        add(cb1);
        add(cb2);
        add(cb3);

        selectedLabel = new Label("Selected Languages: ");
        selectedLabel.setBounds(50, 150, 300, 30);
        add(selectedLabel);

        exitButton = new Button("Exit");
        exitButton.setBounds(150, 200, 80, 30);
        add(exitButton);

        cb1.addItemListener(this);
        cb2.addItemListener(this);
        cb3.addItemListener(this);

        exitButton.addActionListener(this);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });

        setVisible(true);
    }

    public void itemStateChanged(ItemEvent e) {
        String selected = "";

        if (cb1.getState()) selected += "Java ";
        if (cb2.getState()) selected += "Python ";
        if (cb3.getState()) selected += "C++ ";

        selectedLabel.setText("Selected Languages: " + selected);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == exitButton) {
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        new CheckboxDemo();
    }
}

