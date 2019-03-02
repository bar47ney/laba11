package pop;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class bal 
{
	public static void main(String[]args)
	{
		DegreeField s = new DegreeField(10);
		DegreeField v = new DegreeField(10);
		DegreeField t = new DegreeField(10);
		
		JLabel sLabel = new JLabel("Расстояние");
		JLabel vLabel = new JLabel("Скорость");    //private static поля//вствалять стринг
		JLabel tLabel = new JLabel("Время прохождения");
		
		WhatT a = new WhatT(s,v,t);
		JFrame myWindow = new JFrame("TempConv");
		
		myWindow.setSize(450,100);
		myWindow.setLayout(new FlowLayout());
		myWindow.add(sLabel);
		myWindow.add(s);
		myWindow.add(vLabel);
		myWindow.add(v);
		myWindow.add(tLabel);
		myWindow.add(t);
		
		JButton btn =new JButton("Посчитать");
		myWindow.add(btn);
		btn.addActionListener((e)->a.sizeT());
		
		myWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myWindow.setVisible(true);
	}
	
	public static class DegreeField extends JTextField
	{
		public DegreeField(int columns)
		{
			super(columns);
		}
		
		public double getDegrees()
		{
			return Double.parseDouble(getText());
		}
		
		public void SetDegreed(double degrees)
		{
			this.setText(Double.toString(degrees));
		}
		
	}
	
	
	public static class WhatT
	{
		private DegreeField s;
		private DegreeField v;
		private DegreeField t;
		
		public WhatT(DegreeField s,DegreeField v,DegreeField t)
		{
			//super();
			this.s=s;
			this.v=v;
			this.t=t;
		}
		
		public void sizeT()
		{
			t.SetDegreed(s.getDegrees()/v.getDegrees());  //класс с перменными и класс с логикой //geter and seter(public)
		}
		
		
		
	}
}
