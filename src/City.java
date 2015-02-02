import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Rectangle;
import java.util.ArrayList;

import javax.swing.ImageIcon;

public class City extends Elements {


	public City(int x, int y) {
		super(x, y);
	}

	public void update() {
		checkForCollisions();

		
	}
	 public void draw(Graphics2D g2d) {
			g2d.drawImage(getPoint(), 550, 480, null);
			
		
		}

	public Image getPoint() {
		
		ImageIcon ic = new ImageIcon(
				"city.png");
		return ic.getImage();
	}
	

	
	public void checkForCollisions() {
		ArrayList<Target> targets = GameFrame.getTargetsList();
		
		for (int i = 0; i < targets.size(); i++) {
			Target currentTarget = targets.get(i);
			if (getBounds().intersects(currentTarget.getBounds())) {
				// BOOM
				GameFrame.removeTarget(currentTarget);
				System.out.println("BOOOOOM!");
				
			}
		}

	}
	
	public Rectangle getBounds() {
		return new Rectangle(550, 480, getPoint().getWidth(null),
				getPoint().getHeight(null));
	}
		
}