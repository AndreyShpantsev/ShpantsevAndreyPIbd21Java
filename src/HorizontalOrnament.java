import java.awt.Color;
import java.awt.Graphics;

public class HorizontalOrnament implements IWheels {

	private int _startPosX;
	private int _startPosY;
	private Color ColorWheels;
	private Color ColorOrnament;

	public HorizontalOrnament(Color colorwheel, Color colorornament) {
		ColorWheels = colorwheel;
		ColorOrnament = colorornament;
	}

	public void SetPosition(int x, int y) {
		_startPosX = x;
		_startPosY = y;
	}

	public void DrawWheels(Graphics g, int countWheels) {
		int x = 0;
		g.setColor(ColorWheels);
		g.fillRect(_startPosX + 382, _startPosY + 35, 15, 20);
		g.fillRect(_startPosX + 382, _startPosY + 75, 15, 20);
		g.setColor(Color.BLACK);
        g.drawRect(_startPosX + 382, _startPosY + 35, 15, 20);
        g.drawRect(_startPosX + 382, _startPosY + 75, 15, 20);
        g.setColor(ColorOrnament);
        g.fillRect(_startPosX + 382, _startPosY + 39, 15, 4);
        g.fillRect(_startPosX + 382, _startPosY + 87, 15, 4);
        
		for (int i = 1; i < countWheels; i++) {
			g.setColor(ColorWheels);
			g.fillRect(_startPosX + 240 + x, _startPosY + 35, 20, 20);
			g.fillRect(_startPosX + 240 + x, _startPosY + 75, 20, 20);
			g.setColor(Color.BLACK);
            g.drawRect(_startPosX + 240 + x, _startPosY + 35, 20, 20);
            g.drawRect(_startPosX + 240 + x, _startPosY + 75, 20, 20);
            g.setColor(ColorOrnament);
            g.fillRect(_startPosX + 240 + x, _startPosY + 39, 20, 4);
            g.fillRect(_startPosX + 240 + x, _startPosY + 47, 20, 4);
            g.fillRect(_startPosX + 240 + x, _startPosY + 79, 20, 4);
            g.fillRect(_startPosX + 240 + x, _startPosY + 87, 20, 4);
            x+=22;
		}
	}

	public void Draw(Graphics g, WheelsNum temp) {
		int countWheels = 0;
		switch (temp) {
		case wheels2:
			countWheels = 2;
			break;
		case wheels3:
			countWheels = 3;
			break;
		case wheels4:
			countWheels = 4;
			break;
		}
		DrawWheels(g, countWheels);
	}
}