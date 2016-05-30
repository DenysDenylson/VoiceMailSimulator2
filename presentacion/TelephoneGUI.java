
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.layout.FormSpecs;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextArea;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class TelephoneGUI extends JFrame implements UserInterface{
	
	public Connection c;

	private JPanel contentPane;
	private JTextField txtMensaje;
	private JTextArea textAreaMensajes;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					TelephoneGUI frame = new TelephoneGUI();
//					frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	/**
	 * Create the frame.
	 */
	public TelephoneGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 456);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		textAreaMensajes = new JTextArea();
		textAreaMensajes.setText("Mensajes");
		
		txtMensaje = new JTextField();
		txtMensaje.setColumns(10);
		
		JButton botonUno = new JButton("1");
		botonUno.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String mensaje = txtMensaje.getText();
				mensaje += "1";
				txtMensaje.setText(mensaje);
				
//				String mensaje = "";
//		        mensaje = txtMensaje.getText().toString();
//
//				if(mensaje != ""){
//					if (mensaje.equalsIgnoreCase("H"))
//			            c.hangup();
//					else if (mensaje.equalsIgnoreCase("Q"))
//			            setVisible(false);
//			        else if (mensaje.length() == 1 && "1234567890#".indexOf(mensaje) >= 0)
//			            c.dial(mensaje);
//			        else
//			            c.record(mensaje);
//				}
//				
//				txtMensaje.setText("");
			}
		});
		
		JButton botonDos = new JButton("2");
		botonDos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String mensaje = txtMensaje.getText();
				mensaje += "2";
				txtMensaje.setText(mensaje);
			}
		});
		
		JButton botonTres = new JButton("3");
		botonTres.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String mensaje = txtMensaje.getText();
				mensaje += "3";
				txtMensaje.setText(mensaje);
			}
		});
		
		JButton botonCuatro = new JButton("4");
		botonCuatro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String mensaje = txtMensaje.getText();
				mensaje += "4";
				txtMensaje.setText(mensaje);
			}
		});
		
		JButton botonCinco = new JButton("5");
		botonCinco.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String mensaje = txtMensaje.getText();
				mensaje += "5";
				txtMensaje.setText(mensaje);
			}
		});
		
		JButton botonSeis = new JButton("6");
		botonSeis.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String mensaje = txtMensaje.getText();
				mensaje += "6";
				txtMensaje.setText(mensaje);
			}
		});
		
		JButton botonSiete = new JButton("7");
		botonSiete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String mensaje = txtMensaje.getText();
				mensaje += "7";
				txtMensaje.setText(mensaje);
			}
		});
		
		JButton botonOcho = new JButton("8");
		botonOcho.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String mensaje = txtMensaje.getText();
				mensaje += "8";
				txtMensaje.setText(mensaje);
			}
		});
		
		JButton botonNueve = new JButton("9");
		botonNueve.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String mensaje = txtMensaje.getText();
				mensaje += "9";
				txtMensaje.setText(mensaje);
			}
		});
		
		JButton botonCero = new JButton("0");
		botonCero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String mensaje = txtMensaje.getText();
				mensaje += "0";
				txtMensaje.setText(mensaje);
			}
		});
		
		JButton botonH = new JButton("H");
		botonH.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String mensaje = "";
		        mensaje = txtMensaje.getText().toString();

				if(mensaje != ""){
					if (mensaje.equalsIgnoreCase("H"))
			            c.hangup();
					else if (mensaje.equalsIgnoreCase("Q"))
			            setVisible(false);
			        else if (mensaje.length() == 1 && "1234567890#".indexOf(mensaje) >= 0)
			            c.dial(mensaje);
			        else
			            c.record(mensaje);
				}
				
				txtMensaje.setText("");
			}
		});
		
		JButton botonNumeral = new JButton("#");
		botonNumeral.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String mensaje = "";
		        mensaje = txtMensaje.getText().toString();

				if(mensaje != ""){
					if (mensaje.equalsIgnoreCase("H"))
			            c.hangup();
					else if (mensaje.equalsIgnoreCase("Q"))
			            setVisible(false);
			        else if (mensaje.length() == 1 && "1234567890#".indexOf(mensaje) >= 0)
			            c.dial(mensaje);
			        else
			            c.record(mensaje);
				}
				
				txtMensaje.setText("");
			}
		});
		
		
		
		
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
							.addComponent(textAreaMensajes, GroupLayout.DEFAULT_SIZE, 404, Short.MAX_VALUE)
							.addContainerGap())
						.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(botonUno)
									.addGap(6)
									.addComponent(botonDos)
									.addGap(6)
									.addComponent(botonTres, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(botonCuatro)
									.addGap(6)
									.addComponent(botonCinco)
									.addGap(6)
									.addComponent(botonSeis, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(botonSiete)
									.addGap(6)
									.addComponent(botonOcho)
									.addGap(6)
									.addComponent(botonNueve, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(botonH)
									.addGap(6)
									.addComponent(botonCero)
									.addGap(6)
									.addComponent(botonNumeral)))
							.addGap(136))
						.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
							.addComponent(txtMensaje, GroupLayout.DEFAULT_SIZE, 404, Short.MAX_VALUE)
							.addContainerGap())))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(35)
					.addComponent(textAreaMensajes, GroupLayout.PREFERRED_SIZE, 103, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(botonUno)
						.addComponent(botonDos)
						.addComponent(botonTres))
					.addGap(6)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(botonCuatro)
						.addComponent(botonCinco)
						.addComponent(botonSeis))
					.addGap(6)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(botonSiete)
						.addComponent(botonOcho)
						.addComponent(botonNueve))
					.addGap(6)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(botonH)
						.addComponent(botonCero)
						.addComponent(botonNumeral))
					.addGap(23)
					.addComponent(txtMensaje, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(98))
		);
		contentPane.setLayout(gl_contentPane);
	}

	@Override
	public void speak(String output) {
		textAreaMensajes.setText(output);
	}

	@Override
	public void run(Connection ca) {
		setVisible(true);
		this.c = ca;
	}
}
