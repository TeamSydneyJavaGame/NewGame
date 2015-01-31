import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class KeyAdapt extends KeyAdapter {
	TeamSub ts;

	public KeyAdapt(TeamSub teamSub) {
		ts = teamSub;
	}

	public void keyPressed(KeyEvent e) {
		ts.keyPressed(e);
	}

	public void keyReleased(KeyEvent e) {
		ts.keyReleased(e);
	}
}

