import java.awt.Color;
import java.awt.Graphics;

public class Truck extends Vehicle {
	private int carWidth = 100;
	private int carHeight = 60;
	private IWheels wheels;

	public Truck(int maxSpeed, int weight, Color mainColor, IWheels wheels) {
		MaxSpeed = maxSpeed;
		MainColor = mainColor;
		Weight = weight;
		this.wheels = wheels;
	}

	@Override
	public void MoveTransport(Direction direction) {
		float step = MaxSpeed * 100 / Weight;
		switch (direction) {
		case Right:
			if (_startPosX + step < _pictureWidth - 4 * carWidth) {
				_startPosX += step;
			}
			break;
		case Left:
			if (_startPosX - step > -2.5 * carWidth) {
				_startPosX -= step;
			}
			break;
		case Up:
			if (_startPosY - step > -0.7 * carHeight) {
				_startPosY -= step;
			}
			break;
		case Down:
			if (_startPosY + step < _pictureHeight - 1.8 * carHeight) {
				_startPosY += step;
			}
			break;
		}
	}

	public int getPosX() {
		return _startPosX;
	}

	public int getPosY() {
		return _startPosY;
	}

	public void DrawTruck(Graphics g) {
		
		wheels.SetPosition(getPosX(), getPosY());
		wheels.Draw(g,WheelsNum.wheels3);
		g.setColor(MainColor);
		g.fillRect(_startPosX + 220, _startPosY + 55, 150, 20);
		g.setColor(Color.black);
        g.drawRect(_startPosX + 220, _startPosY + 55, 150, 20);
        g.setColor(MainColor);
        g.fillRect(_startPosX + 370, _startPosY + 50, 10, 30);
        g.setColor(Color.black);
        g.drawRect(_startPosX + 370, _startPosY + 50, 10, 30);
        g.setColor(MainColor);
        g.fillRect(_startPosX + 380, _startPosY + 43, 20, 44);
        g.setColor(Color.black); 
        g.drawRect(_startPosX + 380, _startPosY + 43, 20, 44);
        g.setColor(MainColor);
        g.fillRect(_startPosX + 400, _startPosY + 53, 15, 24);
        g.setColor(Color.black); 
        g.drawRect(_startPosX + 400, _startPosY + 53, 15, 24);
		
	}
}