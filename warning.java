//unsaved data warning frame
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

class warning extends JFrame implements ActionListener
{
	warning(String s)
	{
		super(s);
		setLayout(new BorderLayout());
		JPanel jp1 = new JPanel();
		jp1.setLayout(null);
		JLabel jl1 = new JLabel("DO YOU WANT TO SAVE DATA BEFORE EXITING?");
		jp1.add(jl1);
		jl1.setBounds(60,30,300,30);
		
		JButton jb1 = new JButton("YES");
		JButton jb2 = new JButton("NO");
		JButton jb3 = new JButton("CANCEL");
		
		jp1.add(jb1);
		jp1.add(jb2);
		jp1.add(jb3);
		
		jb1.setBounds(80,100,75,20);
		jb2.setBounds(160,100,75,20);
		jb3.setBounds(240,100,80,20);
		
		jb1.addActionListener(this);
		jb2.addActionListener(this);
		jb3.addActionListener(this);
		
		
		
		add(jp1,BorderLayout.CENTER);
		
		
		
		
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		String msg = ae.getActionCommand();
		
		if(msg.equals("YES"))
		{
			pad.save();
			setVisible(false);
		}
		if(msg.equals("NO"))
		{
			pad.jt1.setText("");
			setVisible(false);
		}
		if(msg.equals("CANCEL"))
		{
			setVisible(false);
		}
	}
	public static void main(String args[])
	{
		warning f1 = new warning("");
	}
	
	
}