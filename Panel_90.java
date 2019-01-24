import java.awt.*;

import javax.swing.*;

/**
 * Panel_90 creation
 * 
 * @author Xiangwei Zheng
 * @version 1.0
 */

public class Panel_90 extends JPanel implements PanelInterface{
	
	 private JLabel hiLabel;
         private JLabel nameLabel;
	
	//constructor
	public Panel_90() {
		
		this.setLayout(new GridBagLayout());
                this.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
                JLabel nameLabel = new JLabel("Xiangwei Zheng");
                nameLabel.setFont(new Font("Arial", Font.BOLD,20));
                this.add(nameLabel);
                this.setBackground(Color.cyan);
                this.setVisible(true);
		
		
	}
	
	
}
