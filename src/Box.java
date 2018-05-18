import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

@SuppressWarnings("serial")
public class Box extends Rectangle implements KeyListener {
	
	//Initializing dx and dy (speeds)
	int dx = 0, dy = 0, speed = 2;
	
	//Initializing the background color
	Color c1 = new Color(0, 0, 0);
	
	//Initializing the box color
	int r = 255, g = 255, b = 255;
	
	//Initializing the direction booleans
	boolean isUp = false;
	boolean isDown = false;
	boolean isRight = false;
	boolean isLeft = false;
	
	//Main constructor, creating the initial position and size
	public Box(int xPos, int yPos, int width, int height) {
		
		this.setLocation(xPos, yPos);
		this.setSize(width, height);
		
	}
	
	//Controlling the box's movement
	public void moveAndDraw(Graphics2D win) {
		this.translate(dx, dy);
		win.setColor(c1);
		
		if(isUp && this.y > 0) {
			dy = 0 - speed;
			r = 255;
			g = 0;
			b = 255;
		} else if(isDown && this.y < 462) {
			dy = speed;
			r = 255;
			g = 0;
			b = 0;
		} else {
			dy = 0;
		}
		
		if(isLeft && this.x > 0) {
			dx = 0 - speed;
			r = 255;
			g = 255;
			b = 0;
		} else if(isRight && this.x < 683) {
			dx = speed;
			r = 0;
			g = 0;
			b = 255;
		} else {
			dx = 0;
		}
		
		if((!isLeft) && (!isRight) && (!isDown) && (!isUp)) {
			r = 255;
			g = 255;
			b = 255;
		}
		
		
		//Draw and set color
		win.setColor(new Color(r,g,b));
		win.fill(this);
		
	}

	//Dealing with key events
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		if(e.getKeyCode() == KeyEvent.VK_UP) {
			isUp = true;
		}
		
		if(e.getKeyCode() == KeyEvent.VK_DOWN) {
			isDown = true;
		}
		
		if(e.getKeyCode() == KeyEvent.VK_RIGHT) {
			isRight = true;
		}
		
		if(e.getKeyCode() == KeyEvent.VK_LEFT) {
			isLeft = true;
		}
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		if(e.getKeyCode() == KeyEvent.VK_UP) {
			isUp = false;
		}
		
		if(e.getKeyCode() == KeyEvent.VK_DOWN) {
			isDown = false;
		}
		
		if(e.getKeyCode() == KeyEvent.VK_RIGHT) {
			isRight = false;
		}
		
		if(e.getKeyCode() == KeyEvent.VK_LEFT) {
			isLeft = false;
		}
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
}
