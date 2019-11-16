import java.applet.*;
import java.awt.*;
import java.awt.event.*;

/*
<html>
<applet code="MyEVE.java" width=500 height=700>
</applet>
</html>
*/
public class MyEVE extends Applet implements ActionListener{
	Button b,k;
	TextField t;
	public void init(){
		 b=new Button("tap");
		 k=new Button("Clear");
		add(b);
		add(k);
		 t=new TextField(20);
		add(t);
		b.addActionListener(this);
		k.addActionListener(this);
		t.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e){
		if (e.getSource()==b){
			t.setText("button clicked");
							}
		if (e.getSource()==k){	
			t.setText("");			
		}
}
}

//appletviewer MyEVE.java command line arg