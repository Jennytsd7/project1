import java.awt.*;
import javax.swing.*;
import javax.swing.border.LineBorder;
import javax.swing.text.JTextComponent;


/*
 * Author: Sourabh Siddharth
 * ID: 75
 */


public class Panel_75 extends JPanel implements PanelInterface{
	
	Panel_75(){
		JLabel jlabel = new JLabel("Sourabh Siddharth");
		jlabel.setFont(new Font("Verdana",Font.PLAIN,15));
		setBorder(new LineBorder(Color.yellow));
		setBackground(Color.LIGHT_GRAY);
		setVisible(true);
		add(jlabel);
	}

	@Override
	public void sayHi(boolean flag) {
		JLabel greeting  = new JLabel("Hi!!");
		greeting.setFont(new Font("Verdana",Font.BOLD,26));
		if(flag) {
			add(greeting);
		}else {
			remove(greeting);
		}
	}
}