import java.awt.Color;
import java.util.Random;
import javax.swing.*;
import java.awt.Font;
public class Programming6_1 extends Thread
{
	
	
	JPanel red,yellow,green;
	JFrame fr;
	JLabel l;
	JTextField show;
	public Programming6_1()
	{
		buildGUI();
	}
	public Programming6_1(String s)
	{
		super(s);
	}

	public void run()
	{
		try
		{
			while(true)
			{
				red.setBackground(Color.red);
				yellow.setBackground(Color.GRAY);
				green.setBackground(Color.GRAY);
				for(int i=3;i>0;i--)
				{
					String s=Integer.toString(i);
					show.setText(s+" - Stop - ");
					Thread.sleep(1000);
				}

				
				yellow.setBackground(Color.GRAY);
				green.setBackground(Color.GREEN);
				red.setBackground(Color.GRAY);
				for(int i=5;i>0;i--)
				{
					String s=Integer.toString(i);
					show.setText(s+" - Go - ");
					Thread.sleep(1000);
				}
				

				yellow.setBackground(Color.YELLOW);
				green.setBackground(Color.GRAY);
				red.setBackground(Color.GRAY);
				for(int i=2;i>0;i--)
				{
					String s=Integer.toString(i);
					show.setText(s+" - Get Slow - ");
					Thread.sleep(1000);
				}
			}
		}
		catch(InterruptedException e)
		{
			System.out.println(e);
		}
	}


	public void buildGUI()
	{
		fr=new JFrame("traffic lights");
		fr.setVisible(true);
		fr.setSize(400,800);
		fr.setLayout(null);
		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		red=new JPanel();
		red.setSize(30,30);
		red.setBounds(185,10,50,50);
		red.setBackground(Color.GRAY);
		
		fr.add(red);
		yellow=new JPanel();
		yellow.setSize(30,30);
		yellow.setBounds(185,120,50,50);
		yellow.setBackground(Color.GRAY);
		
		fr.add(yellow);
		green=new JPanel();
		green.setSize(30,30);
		green.setBounds(185,65,50,50);
		green.setBackground(Color.GRAY);
		
		fr.add(green);
		l=new JLabel("Time remaining");
		l.setBounds(185,140,100,100);
		fr.add(l);
		show=new JTextField(40);
		show.setEnabled(false);
		Font f=new Font("verdana",0,18);
		show.setFont(f);
		show.setBackground(Color.BLACK);
		show.setBounds(185,210,130,30);
		fr.add(show);
	}


	public static void main(String args[])
	{
		
		Programming6_1 signal=new Programming6_1();
		Thread task=new Thread(signal);
		
		task.start();
	}
}