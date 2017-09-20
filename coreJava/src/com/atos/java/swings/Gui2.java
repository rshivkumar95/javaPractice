package com.atos.java.swings;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.Date;

import javax.swing.*;

public class Gui2 extends JFrame implements WindowListener,ActionListener{

	Gui2()
	{
		setTitle("My Frame");
		setSize(300,400);
		setVisible(true);
		addWindowListener(this);
		JButton jb=new JButton("Login");
		//addComponent(jb);
		
	}
	public static void main(String[] args) {
		
		new Gui2();
		// TODO Auto-generated method stub
		
//		Color c1=new Color(100,255,89);
//		Frame f=new Frame("My Frame");
//		
//		f.setSize(300,400);
//		f.setVisible(true);
//		Panel p=new Panel();
//		Label l=new Label("User Name :");
//		p.add(l);
//		TextField tf=new TextField(25);
//		//tf.setSize(width, height);
//		p.add(tf);
//		Label l1=new Label("Password :");
//		p.add(l1);
//		TextField tf1=new TextField(25);
//		tf1.setEchoChar('*');
//		p.add(tf1);
//		Button b=new Button("Login");
//		p.setBackground(c1);
//		p.add(b);
//		
//		Choice c=new Choice();
//		c.add("Red");
//		c.add("Yellow");
//		c.add("rgb");
//		p.add(c);
//		
//		List lst=new List(1,true);
//		lst.add("India");
//		lst.add("Pakistan");
//		lst.add("China");
//		p.add(lst);
//		
//		f.add(p);
//		
//		Gui2 j=new Gui2();
//		
//		
//		f.addWindowListener(j);
//		
//		
	}
	
	public void windowClosing(WindowEvent e)
	{
		//dispose();
		System.exit(0);
	}

	@Override
	public void windowActivated(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosed(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeactivated(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowOpened(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
	public void actionPerformed(ActionEvent e)
	{
		System.out.println("The "+e.getActionCommand()+" Button"+" is Clicked at \n "+new Date(e.getWhen()));
	}

}

