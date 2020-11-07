import java.awt.BorderLayout;
import java.awt.Graphics;

import javax.swing.JPanel;

public class CResultContainer extends JPanel {

	private String message;
	
	CResultContainer(String message){
		this.message = message;
		System.out.println("message :" + message);
	}
	
	public void paintComponent (Graphics g) {
		g.drawString(message, this.getWidth()/4, this.getHeight()/2);
	}
	
}
