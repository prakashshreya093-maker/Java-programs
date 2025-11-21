import java.awt.*;
import java.awt.event.*;

public class ListScrollAWT extends Frame implements AdjustmentListener, ItemListener {

    List itemList;
    Scrollbar scrollbar;
    Label label1, label2;

    ListScrollAWT() {

        itemList = new List(5);
        itemList.add("Apple");
        itemList.add("Banana");
        itemList.add("Cherry");
        itemList.add("Mango");
        itemList.add("Orange");
        itemList.add("Papaya");
        itemList.add("Grapes");
        itemList.setBounds(50, 60, 120, 100);
        itemList.addItemListener(this);

        scrollbar = new Scrollbar(Scrollbar.VERTICAL, 0, 1, 0, 100);
        scrollbar.setBounds(200, 60, 20, 100);
        scrollbar.addAdjustmentListener(this);

        label1 = new Label("Selected: ");
        label1.setBounds(50, 180, 200, 30);

        label2 = new Label("Scroll Value: 0");
        label2.setBounds(50, 220, 200, 30);

        add(itemList);
        add(scrollbar);
        add(label1);
        add(label2);

        setSize(300, 300);
        setLayout(null);
        setVisible(true);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
    }

    public void itemStateChanged(ItemEvent e) {
        label1.setText("Selected: " + itemList.getSelectedItem());
    }

    public void adjustmentValueChanged(AdjustmentEvent e) {
        label2.setText("Scroll Value: " + scrollbar.getValue());
    }

    public static void main(String[] args) {
        new ListScrollAWT();
    }
}
