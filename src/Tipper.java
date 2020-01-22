import java.awt.Color;
import java.awt.Graphics;

public class Tipper extends Truck {
	public Color DopColor;
	public Color ColorOfContent;
	public boolean TipperCase;
	public boolean CaseIsEmpty;

	public Tipper(int maxSpeed, int weight, Color mainColor, Color dopcolor, Color colorOfContent, 
			boolean tipperCase, boolean caseIsEmpty, IWheels wheels) {
		super(maxSpeed, weight, mainColor, wheels);
		DopColor = dopcolor;
		ColorOfContent = colorOfContent;
		TipperCase = tipperCase;
		CaseIsEmpty = caseIsEmpty;
	}

	@Override
	public void DrawTruck(Graphics g) {
		super.DrawTruck(g);
		if (TipperCase)
        {
        	g.setColor(DopColor);
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
                g.setColor(DopColor);
                g.drawRect(_startPosX + 240, _startPosY + 50, 110, 30);
            }
        }	      
	}
}