import java.util.function.Function;

import processing.core.PApplet;

public class MySketch extends PApplet {

	public void settings() {
		Function<TestClass,String >test=TestClass::print;
		TestClass t=new TestClass();
		println(test.apply(t));
	}
	
	public static void main(String[] passedArgs) {
		String[] appletArgs = new String[] { "MySketch" };
		PApplet.main(appletArgs);
    }
	
	public class TestClass{
		public TestClass() {
			
		}
		public String print() {
			return "OK";
		}
	}
}
