import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class CResultContainer extends JPanel {

	private String message;
	
	CResultContainer(String message){
		this.message = message;
		
		JLabel label = new JLabel(this.message,SwingConstants.CENTER);
		label.setFont(new Font("Verdana", Font.PLAIN, 15));
		CWinResult winResult = new CWinResult();
		winResult.setContentPane(label);
	}
	
	public void setMessage(String message) {
		this.message = message;
	}
	
}
