import java.awt.Color;
import java.awt.Graphics;

public class Tipper {
	static boolean Life;
	static int _startPosX;
	static int _startPosY;
	private int _pictureWidth;
	private int _pictureHeight;
	private int carWidth = 100;
	private int carHeight = 60;
	public int MaxSpeed;
	public float Weight;
	public Color MainColor;
	public Color DopColor;
	public Color ColorOfContent;
	public boolean TipperCase;
	public boolean CaseIsEmpty;
	

	public Tipper(int maxspeed, int weight, Color maincolor, Color dopcolor, Color colorOfContent, boolean tipperCase,
			boolean caseIsEmpty, boolean life) {
		MaxSpeed = maxspeed;
		Weight = weight;
		MainColor = maincolor;
		DopColor = dopcolor;
		ColorOfContent = colorOfContent;
		TipperCase = tipperCase;
		CaseIsEmpty = caseIsEmpty;
		Life = life;
	}

	public void SetPosition(int x, int y, int width, int height) {
		_startPosX = x;
		_startPosY = y;
		_pictureWidth = width;
		_pictureHeight = height;
	}

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

	public void DrawTipper(Graphics g) {
		if (Life) {
			g.setColor(MainColor);
			g.fillRect(_startPosX + 220, _startPosY + 55, 150, 20);
	        g.drawRect(_startPosX + 220, _startPosY + 55, 150, 20);
	        g.fillRect(_startPosX + 370, _startPosY + 50, 10, 30);
	        g.drawRect(_startPosX + 370, _startPosY + 50, 10, 30);
	        g.fillRect(_startPosX + 380, _startPosY + 43, 20, 44);
	        g.setColor(Color.black); 
	        g.drawRect(_startPosX + 380, _startPosY + 43, 20, 44);
	        g.setColor(MainColor);
	        g.fillRect(_startPosX + 400, _startPosY + 53, 15, 24);
	        g.setColor(Color.black); 
	        g.drawRect(_startPosX + 400, _startPosY + 53, 15, 24);
	        if (TipperCase)
	        {
	        	 g.setColor(MainColor);
	            g.fillRect(_startPosX + 220, _startPosY + 40, 150, 50);
	            g.drawRect(_startPosX + 220, _startPosY + 40, 150, 50);
	            g.setColor(ColorOfContent);
	            g.drawLine(_startPosX + 220, _startPosY + 40, _startPosX + 240, _startPosY + 50);
	            g.drawLine(_startPosX + 220, _startPosY + 90, _startPosX + 240, _startPosY + 80);
	            g.drawLine(_startPosX + 350, _startPosY + 50, _startPosX + 370, _startPosY + 40);
	            g.drawLine(_startPosX + 350, _startPosY + 80, _startPosX + 370, _startPosY + 90);
	            if (CaseIsEmpty)
	            {
	            	g.drawRect(_startPosX + 220, _startPosY + 40, 150, 50);
	                g.drawRect(_startPosX + 240, _startPosY + 50, 110, 30);
	            }
	            else
	            {
	            	g.setColor(ColorOfContent);
	                g.fillRect(_startPosX + 240, _startPosY + 50, 110, 30);
	                g.drawRect(_startPosX + 220, _startPosY + 40, 150, 50);
	                g.setColor(MainColor);
	                g.drawRect(_startPosX + 240, _startPosY + 50, 110, 30);
	            }
	        }	      
		}
	}
}