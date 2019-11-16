import java.applet.*;
import java.awt.*;
import java.awt.event.*;
/*
<html>
<applet code="MyEVE3.java" width=500 height=700>
</applet>
</html>
*/
public class MyEVE3 extends Applet implements Runnable{
	int x=50,y=50;
	Thread t;
	public void init(){
		t=new Thread(this);
		t.start();
	}
public void paint(Graphics r){
	r.fillOval(x,y,50,50);
}

public void run(){
	try{
	while(true){
		x++;
		y++;
		t.sleep(10);
		repaint();
	}
}
	catch(Exception e){}
}
}
//appletviewer MyEVE3.java command line arg