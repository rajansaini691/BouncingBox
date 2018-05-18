import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;

public class BoxComp extends GameDriverV3 {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8742595708209992406L;
	
	public BoxComp() {
		this.addKeyListener(b1);
	}
	
	Box b1 = new Box(100, 100, 100, 100);
	Rectangle background = new Rectangle(0, 0, 800, 600);
	
	@Override
	public void draw(Graphics2D win) {
		//Display background
		win.setColor(Color.BLACK);
		win.fill(background);
		
		b1.moveAndDraw(win);
	}
	
}
