import java.awt.Color;
import java.awt.Graphics;

public class UsualWheels {

	private int _startPosX;
	private int _startPosY;
	private int _pictureWidth;
	private int _pictureHeight;
	private Color ColorWheels;
	private WheelsNum temp;
	public static boolean WLife;

	public UsualWheels(Color colorwheel, WheelsNum t, boolean life) {
		ColorWheels = colorwheel;
		temp = t;
		WLife = life;
	}

	public void SetPosition(int x, int y, int width, int height) {
		_startPosX = x;
		_startPosY = y;
		_pictureWidth = width;
		_pictureHeight = height;
	}

	public void DrawWheels(Graphics g, int countWheels) {
		if (WLife) {
			int x = 0;
			g.setColor(ColorWheels);
			g.fillRect(_startPosX + 382, _startPosY + 35, 15, 20);
			g.fillRect(_startPosX + 382, _startPosY + 75, 15, 20);
			g.setColor(Color.BLACK);
            g.drawRect(_startPosX + 382, _startPosY + 35, 15, 20);
            g.drawRect(_startPosX + 382, _startPosY + 75, 15, 20);
            
			for (int i = 1; i < countWheels; i++) {
				g.setColor(ColorWheels);
				g.fillRect(_startPosX + 240 + x, _startPosY + 35, 20, 20);
				g.fillRect(_startPosX + 240 + x, _startPosY + 75, 20, 20);
				g.setColor(Color.BLACK);
                g.drawRect(_startPosX + 240 + x, _startPosY + 35, 20, 20);
                g.drawRect(_startPosX + 240 + x, _startPosY + 75, 20, 20);
                x+=22;
			}
		}
	}

	public void Draw(Graphics g) {
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