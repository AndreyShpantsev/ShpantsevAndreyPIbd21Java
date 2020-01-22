import java.awt.Graphics;

public interface IWheels {
	public void SetPosition(int x, int y);

	public void DrawWheels(Graphics g, int countSail);

	public void Draw(Graphics g, WheelsNum temp);
}
