import javax.swing.JFrame;
import javax.swing.JPanel;

public class CWindowResult extends JFrame{

	private CResultContainer resultContainer;
	
	CWindowResult(){
		
		this.setTitle("Résultat");
		this.setSize(300,300);
		this.setLocationRelativeTo(null); //se placer au centre
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		resultContainer = new CResultContainer("");
		this.setContentPane(resultContainer);
	    this.setVisible(true);
	}
	
	public void setResultContainer(CResultContainer resultC) {
		this.resultContainer = resultC;
		this.setContentPane(this.resultContainer);
	}
	
}
