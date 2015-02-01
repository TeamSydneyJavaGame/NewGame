import java.awt.Graphics2D;
import java.awt.Image;

import javax.swing.ImageIcon;

public class City extends Elements {


	public City(int x, int y) {
		super(x, y);
	}

	public void update() {
		 		
		
	}
	 public void draw(Graphics2D g2d) {
			g2d.drawImage(getPoint(), 550, 480, null);
		
		}

	public Image getPoint() {
		
		ImageIcon ic = new ImageIcon(
				"city.png");
		return ic.getImage();
	}
		
}