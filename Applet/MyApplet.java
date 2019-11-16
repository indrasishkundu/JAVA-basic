import java.applet.*;
import java.awt.*;
/*
<html>
<applet code="MyApplet.java" width=500 height=700>
</applet>
</html>
*/
public class MyApplet extends Applet{
public void paint(Graphics r){
	r.drawLine(20,30,70,100);
	r.drawRect(50,50,75,75);
	r.drawOval(50,50,100,100);
}
}
//appletviewer MyApplet.java command line arg