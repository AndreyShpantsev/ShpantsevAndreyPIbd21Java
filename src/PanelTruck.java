import java.awt.Graphics;
import javax.swing.JPanel;

public class PanelTruck extends JPanel {
	private Tipper tip;
	private UsualWheels wheels;

	public PanelTruck(Tipper tip, UsualWheels wheels) {
		this.tip = tip;
		this.wheels = wheels;
	}

	@Override
	public void paint(Graphics g) {
		super.paint(g);
		wheels.Draw(g);
		tip.DrawTipper(g);		
	}
}