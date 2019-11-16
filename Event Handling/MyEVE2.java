import java.applet.*;
import java.awt.*;
import java.awt.event.*;

/*
<html>
<applet code="MyEVE2.java" width=500 height=700>
</applet>
</html>
*/
public class MyEVE2 extends Applet implements ActionListener{
	Button b,k,p;
	TextField t;
	public void init(){
		 b=new Button("RED");
		 k=new Button("BLUE");
		 p=new Button("cyan");
		add(b);
		add(k);
		add(p);
		b.addActionListener(this);
		k.addActionListener(this);
		p.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e){
		if (e.getSource()==b){
		setBackground(Color.red);
							}
		if (e.getSource()==k){	
			setBackground(Color.blue);		
		}
		if (e.getSource()==p){	
			setBackground(Color.cyan);		
		}
}
}

//appletviewer MyEVE2.java command line arg