import java.awt.*;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.BorderFactory;
public class Panel_83 extends JPanel implements Panelinterface{
   
     public Panel_83(){

    
     JLabel jl = new JLabel("Bhavana");
     Border bdr = BorderFactory.createLineBorder(Color.BLUE); 
      jl.setBorder(bdr);
	  this.setLayout(new GridBagLayout());
      jl.setBounds(10,50,190,60);
	   jl.setForeground(Color.BLUE);
        this.setBackground(Color.WHITE);
      this.add(jl);	
    }
	 public void sayHi(boolean flag) {
     if(flag){
       jl.setText(myName+" Hi");
     }
     else {
       jl.setText(myName);
     }
   }
   
}
