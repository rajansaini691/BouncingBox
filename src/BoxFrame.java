import javax.swing.JFrame;

public class BoxFrame {
	
	
	public static void main(String[] args) {
		JFrame j1 = new JFrame();
		j1.setTitle("Bouncing Box");
		j1.setDefaultCloseOperation(j1.EXIT_ON_CLOSE);
		j1.setSize(800, 600);
		j1.setLocationRelativeTo(null);
		
		j1.add(new BoxComp());
		
		j1.setVisible(true);
	}
}
