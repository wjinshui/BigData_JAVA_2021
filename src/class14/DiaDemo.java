package class14;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class DiaDemo extends JFrame
{
	public DiaDemo()
	{
		super("²¦ºÅÆ÷");
		setLayout(new BorderLayout());
		
		JTextField txt = new JTextField();
		add(txt, BorderLayout.NORTH);
		
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(5, 3));
		for (int i = 0; i < 15; i++)
		{
			JButton btn = new JButton("" + i);
			panel.add(btn);
		}
		add(panel, BorderLayout.CENTER);
		
		setSize(500, 400);		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String[] args)
	{
		new DiaDemo();

	}

}
