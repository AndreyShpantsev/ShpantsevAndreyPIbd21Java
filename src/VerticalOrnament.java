import java.awt.Color;
import java.awt.Graphics;

public class VerticalOrnament implements IWheels {

	private int _startPosX;
	private int _startPosY;
	private Color ColorWheels;
	private Color ColorOrnament;

	public VerticalOrnament(Color colorwheel, Color colorornament) {
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
        g.fillRect(_startPosX + 385, _startPosY + 35, 3, 20);
        g.fillRect(_startPosX + 391, _startPosY + 35, 3, 20);
        g.fillRect(_startPosX + 385, _startPosY + 75, 3, 20);
        g.fillRect(_startPosX + 391, _startPosY + 75, 3, 20);
        
		for (int i = 1; i < countWheels; i++) {
			g.setColor(ColorWheels);
			g.fillRect(_startPosX + 240 + x, _startPosY + 35, 20, 20);
			g.fillRect(_startPosX + 240 + x, _startPosY + 75, 20, 20);
			g.setColor(Color.BLACK);
            g.drawRect(_startPosX + 240 + x, _startPosY + 35, 20, 20);
            g.drawRect(_startPosX + 240 + x, _startPosY + 75, 20, 20);
            g.setColor(ColorOrnament);
            g.fillRect(_startPosX + 244 + x, _startPosY + 35, 4, 20);
            g.fillRect(_startPosX + 252 + x, _startPosY + 35, 4, 20);
            g.fillRect(_startPosX + 244 + x, _startPosY + 75, 4, 20);
            g.fillRect(_startPosX + 252 + x, _startPosY + 75, 4, 20);
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