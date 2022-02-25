import javax.swing.*;
import java.awt.*;

public class MyJPanel extends JPanel{
    MyJPanel newPanel;

    public MyJPanel()
    {
        //GlobalList.list.add(new Operation.Create(MyJPanel.class));
        this.setBackground(Color.GREEN);
        GlobalList.list.add(new Operation.CreatePanel(this));
        this.newPanel = this;
    }

    public void add(MyJButton button) {
        super.add(button);
        GlobalList.list.add(new Operation.AddButtonToPanel(this, button));
    }
}
