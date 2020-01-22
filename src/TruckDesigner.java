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
	private JButton btnNewButtonUp;;
	private JButton btnCreateTruck;
	private PanelTruck panelMain;
	private ITransport transport;
	private IWheels wheels;
	private JButton btnCreateCatamaran;

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

		panelMain = new PanelTruck(transport, wheels);
		panelMain.setBounds(0, 0, 882, 603);
		frame.getContentPane().add(panelMain);
		panelMain.setLayout(null);

		btnCreateTruck = new JButton("\u0421\u043E\u0437\u0434\u0430\u0442\u044C \u0433\u0440\u0443\u0437\u043E\u0432\u0438\u043A");
		btnCreateTruck.setFont(new Font("Comic Sans MS", Font.ITALIC, 12));
		btnCreateTruck.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				transport = new Truck(10, 20, Color.orange, wheels = new HorizontalOrnament(Color.white, Color.BLUE));
				panelMain.setTruck(transport);
				transport.SetPosition(100, 100, frame.getWidth(), frame.getHeight());
				panelMain.repaint();
			}
		});
		btnCreateTruck.setBounds(10, 13, 146, 33);
		panelMain.add(btnCreateTruck);

		btnNewButtonRight = new JButton("");
		btnNewButtonRight.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\4.png"));
		btnNewButtonRight.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (transport != null && wheels != transport) {
					transport.MoveTransport(Direction.Right);
					wheels.SetPosition(transport.getPosX(), transport.getPosY());
					panelMain.repaint();
				}
			}
		});

		btnCreateCatamaran = new JButton(
				"\u0421\u043E\u0437\u0434\u0430\u0442\u044C \u0441\u0430\u043C\u043E\u0441\u0432\u0430\u043B");
		btnCreateCatamaran.setFont(new Font("Comic Sans MS", Font.ITALIC, 12));
		btnCreateCatamaran.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				transport = new Tipper(10, 20, Color.darkGray, Color.yellow, Color.darkGray, true, true, wheels = new VerticalOrnament(Color.WHITE, Color.black ));
				panelMain.setTruck(transport);
				transport.SetPosition(100, 100, frame.getWidth(), frame.getHeight());
				panelMain.repaint();
			}
		});
		btnCreateCatamaran.setBounds(166, 13, 146, 33);
		panelMain.add(btnCreateCatamaran);
		btnNewButtonRight.setFont(new Font("Tahoma", Font.PLAIN, 7));
		btnNewButtonRight.setBounds(833, 551, 39, 39);
		panelMain.add(btnNewButtonRight);

		btnNewButtonDown = new JButton("");
		btnNewButtonDown.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\3.png"));
		btnNewButtonDown.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (transport != null && wheels != transport) {
					transport.MoveTransport(Direction.Down);
					wheels.SetPosition(transport.getPosX(), transport.getPosY());
					panelMain.repaint();
				}
			}
		});
		btnNewButtonDown.setFont(new Font("Calibri", Font.BOLD | Font.ITALIC, 12));
		btnNewButtonDown.setBounds(780, 551, 39, 39);
		panelMain.add(btnNewButtonDown);

		btnNewButtonLeft = new JButton("");
		btnNewButtonLeft.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\2.png"));
		btnNewButtonLeft.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (transport != null && wheels != transport) {
					transport.MoveTransport(Direction.Left);
					wheels.SetPosition(transport.getPosX(), transport.getPosY());
					panelMain.repaint();
				}
			}
		});
		btnNewButtonLeft.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 12));
		btnNewButtonLeft.setBounds(729, 551, 39, 39);
		panelMain.add(btnNewButtonLeft);

		btnNewButtonUp = new JButton("");
		btnNewButtonUp.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\1.png"));
		btnNewButtonUp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (transport != null && wheels != transport) {
					transport.MoveTransport(Direction.Up);
					wheels.SetPosition(transport.getPosX(), transport.getPosY());
					panelMain.repaint();
				}
			}
		});
		btnNewButtonUp.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 12));
		btnNewButtonUp.setBounds(780, 499, 39, 39);
		panelMain.add(btnNewButtonUp);
	}
}