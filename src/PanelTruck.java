import java.awt.Graphics;
import javax.swing.JPanel;

import java.awt.Graphics;
import javax.swing.JPanel;

public class PanelTruck extends JPanel {
	private ITransport transport;
	private IWheels wheels;

	public PanelTruck(ITransport transport, IWheels wheels) {
		this.wheels = wheels;
		this.transport = transport;
	}

	void setTruck(ITransport transport) {
		this.transport = transport;
	}

	@Override
	public void paint(Graphics g) {
		super.paint(g);
		if (transport != null) {
			transport.DrawTruck(g);
		}
	}
}