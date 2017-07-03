import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class color extends JFrame implements ActionListener
{
	JColorChooser jss;
	color(String s)
	{
		super(s);
		setLayout(new BorderLayout());
		JPanel jp1 = new JPanel();
		jp1.setLayout(null);
		
		JButton jb1 = new JButton("SET BG");
		jb1.setBounds(175,505,150,20);
		jp1.add(jb1);
		
		JButton jb2 = new JButton("SET FG");
		jb2.setBounds(330,505,150,20);
		jp1.add(jb2);
		
		JButton jb3 = new JButton("CANCEL");
		jb3.setBounds(252,530,150,20);
		jp1.add(jb3);
		
		jss = new JColorChooser();
		jss.setBounds(0,0,500,500);
		jp1.add(jss);
		add(jp1,BorderLayout.CENTER);
		
		jb1.addActionListener(this);
		jb2.addActionListener(this);
		jb3.addActionListener(this);
		
		
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		String msg = ae.getActionCommand();
		
		if(msg.equals("CANCEL"))
		{
			setVisible(false);
		}
		if(msg.equals("SET BG"))
		{
			pad.jt1.setBackground(jss.getColor());
		}	
		if(msg.equals("SET FG"))
		{
			pad.jt1.setForeground(jss.getColor());
		}	
	}
	
	public static void main(String args[])
	{
		color c1 = new color("COLOR");
		
	}
}