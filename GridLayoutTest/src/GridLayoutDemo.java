import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * 
 * @author tkanchanawanchai6403
 *
 */
public class GridLayoutDemo extends JFrame {
	JTextField text = new JTextField();
	JLabel [] label = new  JLabel [10]; 
	/**
	 * 
	 */
	public GridLayoutDemo() {
		JPanel panel = new JPanel(new GridLayout(5,2));
		for(int i=0; i<label.length; i++) {
			label[i] = new JLabel("Text"+i);
			panel.add(label[i]);
		}
		add(panel);
		setVisible(true);
		pack();
	}
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new GridLayoutDemo();
	}

}
