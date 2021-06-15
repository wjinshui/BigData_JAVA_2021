package class13;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;

public class JFrameDemo extends JFrame
{
	
	public JFrameDemo()
	{
		setTitle("这是一个JFrame");
		Container container = getContentPane();
		container.setLayout(new BorderLayout());
		container.setBackground(new Color(150, 250, 151));
		
		JButton btnNorth = new JButton("North");
		add(btnNorth, BorderLayout.NORTH);
		
		JButton btnSouth = new JButton("South");
		add(btnSouth, BorderLayout.SOUTH);
		
		JButton btnWest = new JButton("West");
		add(btnWest, BorderLayout.WEST);
		
		JButton btnEast = new JButton("East");
		add(btnEast, BorderLayout.EAST);
		
		JButton btnCenter = new JButton("Center");
		add(btnCenter, BorderLayout.CENTER);
		
		
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(300, 300);		
		setVisible(true);
		//changeColor(btn1);
	}
	
	void changeColor(JComponent component)
	{
		for (int i = 0; i <= 255; i++)
			for (int j = 0; j <= 255; j++)
				for(int k=0; k<=255; k++)
				{
					component.setBackground(new Color(i, j, k));
					try
					{
						Thread.sleep(1);
					} catch (InterruptedException e)
					{						
						e.printStackTrace();
					}
			}
	}


	public static void main(String[] args)
	{
		new JFrameDemo();

	}

}
