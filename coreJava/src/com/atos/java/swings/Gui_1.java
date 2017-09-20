package com.atos.java.swings;

import java.awt.*;

public class Gui_1 {
   
	public static void main(String[] args) {
		
		Color c1=new Color(100,255,89);
		Frame f=new Frame("My Frame");
		
		f.setSize(300,400);
		f.setVisible(true);
		Panel p=new Panel();
		Label l=new Label("User Name :");
		p.add(l);
		TextField tf=new TextField(25);
		//tf.setSize(width, height);
		p.add(tf);
		Label l1=new Label("Password :");
		p.add(l1);
		TextField tf1=new TextField(25);
		tf1.setEchoChar('*');
		p.add(tf1);
		Button b=new Button("Login");
		p.setBackground(c1);
		p.add(b);
		
		Choice c=new Choice();
		c.add("Red");
		c.add("Yellow");
		c.add("rgb");
		p.add(c);
		
		List lst=new List(1,true);
		lst.add("India");
		lst.add("Pakistan");
		lst.add("China");
		p.add(lst);
		
		f.add(p);
		
	}
}
