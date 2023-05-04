package ie.tudublin;

import javax.swing.JFrame;

import c21333116.Confetti;
// import c21333116.YASC;
// import c21333116.CubeVisual1;
// import c21333116.Heart;
// import c21333116.Loops;
import c21333116.OurVisual;
import c21333116.myHeart;
import example.CubeVisual;
import example.MyVisual;
import example.twerking;
import c21333116.*;
public class Main
{	


	public void boysaliar()
	{
		String[] a = {"MAIN"};
        processing.core.PApplet.runSketch( a, new OurVisual());		
	}


	public static void main(String[] args) throws InterruptedException
	{
		Main main = new Main();

		main.boysaliar();
		//main.myheart();
		// main.twerk();

		//confetti JFrame code
		JFrame frame = new JFrame("Confetti");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Confetti confetti = new Confetti(800, 600);
		frame.getContentPane().add(confetti);
		frame.pack();
		frame.setVisible(true);
		confetti.run();

		
	}
	

	}
