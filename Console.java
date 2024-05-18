package inheritance;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Console extends JFrame {
	protected JCheckBox[] direction= new JCheckBox[4];
	protected String[] names= {"up","right","left","down"};
	Bear b = new Bear(5,4,1);
	Fish f = new Fish(5,7,1);
	GameRenderer renderer = new ConsoleGameRenderer();
	Container c = getContentPane();
	public Console() {
		setTitle("Game");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		c.setLayout(new FlowLayout(FlowLayout.LEFT,3,4));
		MyItemListener listener = new MyItemListener();
        for (int i = 0; i < direction.length; i++) {
            direction[i] = new JCheckBox(names[i]);
            c.add(direction[i]);
            direction[i].addItemListener(listener);
        }
		
		setSize(500,500);
		setVisible(true);
	}
	
	class MyItemListener implements ItemListener{
		@Override
		public void itemStateChanged(ItemEvent e) {
			if (e.getStateChange() == ItemEvent.SELECTED) {
                String select = ((JCheckBox) e.getItem()).getText();
                b.move(select);
                b.limit();
                //f.move(null);
                f.limit();
                renderer.Starter(b, f);
                renderer.UpdateGamePane(b, f);
                ((ConsoleGameRenderer) renderer).m.paintComponent(getGraphics());
                ((ConsoleGameRenderer) renderer).m.repaint();
            }
			
		}
	}
	public static void main(String[] args) {
	   new Console();
	}
}
