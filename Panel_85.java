/*
 @author Shivam Verma
 @Panel 85
 */

import javax.swing.*;
import java.awt.*;

public class Panel_85 extends JPanel {

	public Panel_85() {
		initPanel();
    }
    
	private void initPanel() {
        JLabel label = new JLabel("Shivam Verma");
        this.setBackground(Color.LIGHT_GRAY);	
        this.add(label);
    }
}