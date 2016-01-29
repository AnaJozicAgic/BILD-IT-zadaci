package MiniProjekatCraps;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.Action;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.lang.invoke.SwitchPoint;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.JTextPane;
import javax.swing.SwingUtilities;
import javax.swing.AbstractAction;

public class CrapsInGui {

	private JFrame frame;
	private JTextField Kockica1;
	private JTextField Kockica2;
	private JTextField Point;
	private JTextField Suma;
	private JTextField Rezultat;
	private final Action action = new SwingAction();

	private final Action action_1 = new SwingAction_1();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CrapsInGui window = new CrapsInGui();
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
	public CrapsInGui() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {

		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(0, 128, 128));
		frame.getContentPane().setForeground(new Color(255, 255, 255));
		frame.setBounds(100, 100, 420, 499);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel Craps = new JLabel(" Craps");
		Craps.setHorizontalAlignment(SwingConstants.CENTER);
		Craps.setFont(new Font("Harlow Solid Italic", Font.PLAIN, 35));
		Craps.setForeground(new Color(255, 255, 255));
		Craps.setBounds(60, 42, 263, 40);
		frame.getContentPane().add(Craps);

		Kockica1 = new JTextField();
		Kockica1.setEditable(false);
		Kockica1.setFont(new Font("Harlow Solid Italic", Font.BOLD, 30));
		Kockica1.setHorizontalAlignment(SwingConstants.CENTER);
		Kockica1.setBounds(116, 131, 107, 45);
		frame.getContentPane().add(Kockica1);
		Kockica1.setColumns(10);

		Kockica2 = new JTextField();
		Kockica2.setEditable(false);
		Kockica2.setFont(new Font("Harlow Solid Italic", Font.BOLD, 30));
		Kockica2.setHorizontalAlignment(SwingConstants.CENTER);
		Kockica2.setBounds(233, 131, 114, 45);
		frame.getContentPane().add(Kockica2);
		Kockica2.setColumns(10);

		Point = new JTextField();
		Point.setEditable(false);
		Point.setFont(new Font("Harlow Solid Italic", Font.BOLD, 30));
		Point.setBounds(116, 187, 231, 37);
		frame.getContentPane().add(Point);
		Point.setColumns(10);

		Suma = new JTextField();
		Suma.setEditable(false);
		Suma.setFont(new Font("Harlow Solid Italic", Font.BOLD, 30));
		Suma.setBounds(116, 235, 231, 34);
		frame.getContentPane().add(Suma);
		Suma.setColumns(10);

		Rezultat = new JTextField();
		Rezultat.setEditable(false);
		Rezultat.setFont(new Font("Harlow Solid Italic", Font.BOLD, 25));
		Rezultat.setBounds(116, 280, 231, 40);
		frame.getContentPane().add(Rezultat);
		Rezultat.setColumns(10);

		JButton BaciKockice = new JButton("Baci Kockice");
		BaciKockice.setHorizontalAlignment(SwingConstants.LEADING);
		BaciKockice.setBackground(new Color(0, 128, 0));
		BaciKockice.setAction(action);
		BaciKockice.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				try {
					// First button option and action is dice toss
					int[] point = { 4, 5, 6, 8, 9, 10 };
					int kockica1 = 1 + (int) (Math.random() * 6);
					int kockica2 = 1 + (int) (Math.random() * 6);

					int suma = kockica1 + kockica2;

					Suma.setText(null);
					Rezultat.setText(null);
					Kockica1.setText(String.valueOf(kockica1));
					Kockica1.setEditable(false);

					Kockica2.setText(String.valueOf(kockica2));
					Kockica2.setEditable(false);

					Suma.setText(String.valueOf(suma));
					Suma.setEditable(false);
					Point.setText(null);
					Point.setEditable(false);
					Rezultat.setEditable(false);

					for (int i = 0; i < point.length; i++) {

						if (suma != point[i]) {
							if (suma == 7 || suma == 11) {

								Rezultat.setText(" Pobjeda ");
								break;

							} else if (suma == 2 || suma == 3 || suma == 12) {

								Rezultat.setText(" Poraz ");
								break;

							}

						}

						else {
							action.setEnabled(false);
							Suma.setText(String.valueOf(suma));
							Point.setText("Point je " + String.valueOf(suma));
							Rezultat.setText("Nastavite");
							action_1.setEnabled(true);

						}

					}

				} catch (Exception e2) {

				}

			}
		});
		BaciKockice.setBounds(37, 331, 124, 40);
		frame.getContentPane().add(BaciKockice);

		JLabel lblKockica = new JLabel("Kockica1");
		lblKockica.setBounds(116, 117, 77, 14);
		frame.getContentPane().add(lblKockica);

		JLabel lblKockica_1 = new JLabel("Kockica2");
		lblKockica_1.setBounds(233, 117, 77, 14);
		frame.getContentPane().add(lblKockica_1);

		JLabel lblPoint = new JLabel("Point:");
		lblPoint.setBounds(42, 204, 64, 14);
		frame.getContentPane().add(lblPoint);

		JLabel lblSuma = new JLabel("Suma:");
		lblSuma.setBounds(42, 249, 64, 14);
		frame.getContentPane().add(lblSuma);

		JLabel lblRezultat = new JLabel("Rezultat:");
		lblRezultat.setBounds(42, 293, 64, 14);
		frame.getContentPane().add(lblRezultat);

		JButton IzadjiIzIgre = new JButton("Izadji");
		IzadjiIzIgre.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//Exit button
				System.exit(1);
			}
		});
		IzadjiIzIgre.setHorizontalAlignment(SwingConstants.LEADING);
		IzadjiIzIgre.setBackground(new Color(178, 34, 34));
		IzadjiIzIgre.setBounds(276, 331, 71, 40);
		frame.getContentPane().add(IzadjiIzIgre);

		JButton Nastavi = new JButton("Nastavi");
		Nastavi.setBackground(new Color(255, 153, 0));
		Nastavi.setForeground(new Color(0, 0, 0));
		Nastavi.setAction(action_1);
		Nastavi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {

					// Second button option and action is dice toss, if at first
					
					// toss sum was a point value
					
					int[] point = { 4, 5, 6, 8, 9, 10 };

					for (int i = 0; i < point.length; i++) {
						if (Suma.getText().equals(String.valueOf(point[i]))) {
							Point.setText("Point je " + Suma.getText());

							int ko1 = 1 + (int) (Math.random() * 6);
							int ko2 = 1 + (int) (Math.random() * 6);

							Kockica1.setText(String.valueOf(ko1));
							Kockica2.setText(String.valueOf(ko2));
							int suma2 = ko1 + ko2;
							if (suma2 == Integer.valueOf(Suma.getText())) {

								Suma.setText(String.valueOf(suma2));
								Rezultat.setText(" Pobjeda ");
								action.setEnabled(true);
								action_1.setEnabled(false);
							} else {

								Suma.setText(String.valueOf(suma2));
								Rezultat.setText(" Poraz ");
								action_1.setEnabled(false);
								action.setEnabled(true);
							}

						}
					}
					action.setEnabled(true);
				} catch (Exception e2) {

				}

			}
		});
		Nastavi.setHorizontalAlignment(SwingConstants.LEADING);
		Nastavi.setBounds(171, 331, 95, 40);
		frame.getContentPane().add(Nastavi);

	}

	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "Baci kockice");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}

		public void actionPerformed(ActionEvent e) {
		}
	}

	private class SwingAction_1 extends AbstractAction {
		public SwingAction_1() {
			putValue(NAME, "Nastavi");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}

		public void actionPerformed(ActionEvent e) {
		}
	}
}
