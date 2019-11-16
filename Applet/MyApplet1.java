import java.applet.*;
import java.awt.*;
/*
<html>
<applet code="MyApplet1.java" width=500 height=700>
</applet>
</html>
*/
public class MyApplet1 extends Applet{
public void paint(Graphics r){
	
	r.drawArc(50,50,150,150,100,100);
	r.drawString("Hi Ik", 200,200);
}
}
//appletviewer MyApplet1.java command line arg