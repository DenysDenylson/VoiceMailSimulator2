import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.FormSpecs;
import com.jgoodies.forms.layout.RowSpec;

public class Menu extends JFrame {

	private JPanel contentPane;
	private JTextField txtDisplay;
	private JTextField txtMessage;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu frame = new Menu();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Menu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new FormLayout(new ColumnSpec[] {
				FormSpecs.LABEL_COMPONENT_GAP_COLSPEC,
				ColumnSpec.decode("39px"),
				ColumnSpec.decode("346px"),
				ColumnSpec.decode("39px"),},
			new RowSpec[] {
				FormSpecs.LINE_GAP_ROWSPEC,
				RowSpec.decode("20px"),
				RowSpec.decode("211px"),
				RowSpec.decode("20px"),}));
		
		txtDisplay = new JTextField();
		contentPane.add(txtDisplay, "3, 2, fill, top");
		txtDisplay.setColumns(10);
		
		txtMessage = new JTextField();
		contentPane.add(txtMessage, "2, 4, 3, 1, fill, top");
		txtMessage.setColumns(10);
	}

}
