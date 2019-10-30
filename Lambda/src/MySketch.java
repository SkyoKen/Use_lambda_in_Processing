import java.util.ArrayList;

import processing.core.PApplet;

public class MySketch extends PApplet {

	public void settings() {
		ArrayList<String> list=new ArrayList<String>();
		for(int i=0;i<5;i++) list.add(String.valueOf((char)('a'+i)));
		list.forEach((i)->println(i));
	}
	
	public static void main(String[] passedArgs) {
		String[] appletArgs = new String[] { "MySketch" };
		PApplet.main(appletArgs);
    }
}
