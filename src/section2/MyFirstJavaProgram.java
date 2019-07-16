package section2;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	
	public static void main(String[] args) {

		Robot ash = new Robot ();

ash.setSpeed(90);
ash.sparkle();
ash.setPenColor(Color.magenta);
ash.setPenWidth(10);
ash.penDown();
ash.move(100);
ash.turn(90);
ash.move(100);
ash.turn(90);
ash.move(100);
ash.turn(90);
ash.move(100);
	}
}
