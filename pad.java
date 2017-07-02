/*PAD++
@AmanThakur
*/

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

class pad extends JFrame implements ActionListener,WindowListener
{
	JTextArea jt1;
	color c1 = new color("COLOR");
	pad(String s)
	{
		super(s);
		//OVERALL LAYOUT
		setLayout(new BorderLayout());
		
		//TOOLKIT
		Toolkit tk = getToolkit();
		
		//ICON IMAGE
		Image i1 = tk.getImage("icon.png");
		setIconImage(i1);
		
		//J TEXT AREA
		 jt1 = new JTextArea();
		
		//J SCROLL PANE
		int h = ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED;
		int v = ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED;
		
		JScrollPane jsp = new JScrollPane(jt1,v,h);
		add(jsp,BorderLayout.CENTER);	
		
		//J MENU BAR
		JMenuBar mb = new JMenuBar();
		setJMenuBar(mb);
		
		//First J MENU 
		
		JMenu m1 = new JMenu("File");
		mb.add(m1);
		
		JMenuItem mi1_1 = new JMenuItem("NEW");
		JMenuItem mi1_2 = new JMenuItem("OPEN");
		JMenuItem mi1_3 = new JMenuItem("SAVE");
		JMenuItem mi1_4 = new JMenuItem("SAVE AS");
		
		m1.add(mi1_1);
		m1.add(mi1_2);
		m1.add(mi1_3);
		m1.add(mi1_4);
		
		//Second JMenu
		 JMenu m2 = new JMenu("Edit");
		 mb.add(m2);
		 
		 JMenuItem mi2_1 = new JMenuItem("CUT");
		 JMenuItem mi2_2 = new JMenuItem("COPY");
		 JMenuItem mi2_3 = new JMenuItem("PASTE");
		 m2.add(mi2_1);
		 m2.add(mi2_2);
		 m2.add(mi2_3);
		 
		 //THIRD JMenu
		 JMenu m3= new JMenu("Format");
		 mb.add(m3);
		 
		 JMenuItem mi3_1 = new JMenuItem("COLOR");
		 JMenuItem mi3_2 = new JMenuItem("SET BACKGROUND");
		 JMenuItem mi3_3 = new JMenuItem("SET FOREGROUND");
		 m3.add(mi3_1);
		 m3.add(mi3_2);
		 m3.add(mi3_3);
		
		
		
		//REGISTERED WINDOW LISTENER
		addWindowListener(this);
		//REGISTERED ACTION LISTENER
		mi1_1.addActionListener(this);
		mi1_2.addActionListener(this);
		mi1_3.addActionListener(this);
		mi1_4.addActionListener(this);
		mi2_1.addActionListener(this);
		mi2_2.addActionListener(this);
		mi2_3.addActionListener(this);
		mi3_1.addActionListener(this);
		mi3_2.addActionListener(this);
		mi3_3.addActionListener(this);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
		
		public void actionPerformed(ActionEvent ae)
		{
			if(ae.getActionCommand()=="NEW")
			{
				jt1.setText("");
			}
			if(ae.getActionCommand()=="OPEN")
			{
				open();
			}
			if(ae.getActionCommand()=="CUT")
			{
					jt1.cut();
			}
			if(ae.getActionCommand()=="COPY")
			{
				jt1.copy();
			}
			if(ae.getActionCommand()=="PASTE")
			{
				jt1.paste();
			}
			if(ae.getActionCommand()=="SAVE")
			{
				save();
			}
			if(ae.getActionCommand()=="COLOR")
			{
				color c1 = new color("COLOR");
					c1.setVisible(true);
					c1.setSize(600,600);
			}
			if(ae.getActionCommand()=="CANCEL")
			{
				System.out.println("cancel working");
			}
			
			
			
			else 
			{
				System.out.println("SORRY");
			}
		}
		
		public void windowClosed(WindowEvent we)
		{
			System.out.println("CLOSED");
		}
		
		public void windowClosing(WindowEvent we)
		{
			System.out.println("CLOSING");
		}
		
		public void windowIconified(WindowEvent we)
		{
			
		}
		
		public void windowDeiconified(WindowEvent we)
		{
			
		}
		
		public void windowActivated(WindowEvent we)
		{
			
		}
		
		public void windowDeactivated(WindowEvent we)
		{
			
		}
		
		public void windowOpened(WindowEvent we)
		{
			
		}
		
		void open()
		{
			try
			{
			JFrame f1 = new JFrame();
			FileDialog fd = new FileDialog(f1,"OPEN");
			fd.setVisible(true);
			fd.setSize(300,300);
			
			String path = fd.getDirectory()+fd.getFile();
			FileReader fr = new FileReader(path);
			
			int i;
			String s = "";
			while((i=fr.read())!=-1)
				{
					s=s+(char)i;
				}
			jt1.setText(s);
			fr.close();
			
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
			
		
		}	
	
	void save()
	{
		try
		{
		JFrame f1 = new JFrame();
		
		FileDialog fd = new FileDialog(f1,"SAVE",FileDialog.SAVE);
		fd.setVisible(true);
		fd.setSize(300,300);
		String path = fd.getDirectory()+fd.getFile();
		
		FileWriter fw = new FileWriter(path);
		
		
		String data = jt1.getText();
		fw.write(data);
		fw.close();
		
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String args[])
	{
		pad f1 = new pad("PAD++");
		f1.setVisible(true);
		f1.setSize(800,800);
		f1.setLocation(100,100);
	}
} 
