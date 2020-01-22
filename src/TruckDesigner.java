import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class TruckDesigner {
	private JFrame frame;
	private JButton btnNewButtonRight;
	private JButton btnNewButtonDown;
	private JButton btnNewButtonLeft;
	private JButton btnNewButtonUp;
	private JButton btnCreate;
	private JPanel panelMain;
	private UsualWheels wheels = new UsualWheels(Color.white, WheelsNum.wheels3, false);
	private Tipper tip = new Tipper(10, 20, Color.gray, Color.black, Color.green, true, true, false);
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TruckDesigner window = new TruckDesigner();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TruckDesigner() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 900, 650);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setResizable(false);

		panelMain = new PanelTruck(tip, wheels);
		panelMain.setBounds(0, 0, 882, 603);
		frame.getContentPane().add(panelMain);
		panelMain.setLayout(null);

		btnCreate = new JButton("Cоздать");
		btnCreate.setFont(new Font("Comic Sans MS", Font.ITALIC, 12));
		btnCreate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UsualWheels.WLife = true;
				Tipper.Life = true;
				tip.SetPosition(-100, 20, frame.getWidth(), frame.getHeight());
				wheels.SetPosition(-100, 20, frame.getWidth(), frame.getHeight());
				panelMain.repaint();
			}
		});
		btnCreate.setBounds(12, 13, 102, 33);
		panelMain.add(btnCreate);

		btnNewButtonRight = new JButton("");
		btnNewButtonRight.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\\u0432\u043F\u0440\u0430\u0432\u043E.png"));
		btnNewButtonRight.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				tip.MoveTransport(Direction.Right);
				wheels.SetPosition(tip._startPosX, tip._startPosY, frame.getWidth(), frame.getHeight());
				panelMain.repaint();
			}
		});
		btnNewButtonRight.setFont(new Font("Tahoma", Font.PLAIN, 7));
		btnNewButtonRight.setBounds(831, 551, 39, 39);
		panelMain.add(btnNewButtonRight);

		btnNewButtonDown = new JButton("");
		btnNewButtonDown.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\\u0432\u043D\u0438\u0437.png"));
		btnNewButtonDown.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tip.MoveTransport(Direction.Down);
				wheels.SetPosition(tip._startPosX, tip._startPosY, frame.getWidth(), frame.getHeight());
				panelMain.repaint();
			}
		});
		btnNewButtonDown.setFont(new Font("Tahoma", Font.PLAIN, 7));
		btnNewButtonDown.setBounds(780, 551, 39, 39);
		panelMain.add(btnNewButtonDown);

		btnNewButtonLeft = new JButton("");
		btnNewButtonLeft.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\\u0432\u043B\u0435\u0432\u043E.png"));
		btnNewButtonLeft.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tip.MoveTransport(Direction.Left);
				wheels.SetPosition(tip._startPosX, tip._startPosY, frame.getWidth(), frame.getHeight());
				panelMain.repaint();
			}
		});
		btnNewButtonLeft.setFont(new Font("Tahoma", Font.PLAIN, 7));
		btnNewButtonLeft.setBounds(729, 551, 39, 39);
		panelMain.add(btnNewButtonLeft);

		btnNewButtonUp = new JButton("");
		btnNewButtonUp.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\\u0432\u0432\u0435\u0440\u0445.png"));
		btnNewButtonUp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tip.MoveTransport(Direction.Up);
				wheels.SetPosition(tip._startPosX, tip._startPosY, frame.getWidth(), frame.getHeight());
				panelMain.repaint();
			}
		});
		btnNewButtonUp.setFont(new Font("Tahoma", Font.PLAIN, 7));
		btnNewButtonUp.setBounds(780, 499, 39, 39);
		panelMain.add(btnNewButtonUp);
	}
}