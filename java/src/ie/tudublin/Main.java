package ie.tudublin;

import javax.swing.JFrame;

import c21333116.Confetti;
import c21333116.CubeVisual;
import c21333116.YASC;
import c21333116.CubeVisual1;
import c21333116.Heart;
import c21333116.Loops;
import c21333116.OurVisual;
import example.MyVisual;
import example.myHeart;
import example.secondHeart;
import example.circle;
import example.twerking;

public class Main
{	

	public void cube2()
	{
		String[] a = {"MAIN"};
        processing.core.PApplet.runSketch( a, new CubeVisual());		
	}

	public void startUI()
	{
		String[] a = {"MAIN"};
        processing.core.PApplet.runSketch( a, new MyVisual());		
	}
	

	public void boysaliar()
	{
		String[] a = {"MAIN"};
        processing.core.PApplet.runSketch( a, new OurVisual());		
	}

	
	// public void heart()
	// {
	// 	String[] a = {"MAIN"};
  //       processing.core.PApplet.runSketch( a, new Heart());
	// }

	// public void twerking()
	// {
	// 	String[] a = {"MAIN"};
  //       processing.core.PApplet.runSketch( a, new twerking());		
	// }

	// public void yasc()
	// {
	// 	String[] a = {"MAIN"};
  //       processing.core.PApplet.runSketch( a, new YASC());		
	// }


	public static void main(String[] args) throws InterruptedException
	{
		Main main = new Main();

		main.boysaliar();


		// //confetti JFrame code
		// JFrame frame = new JFrame("Confetti");
		// frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// Confetti confetti = new Confetti(800, 600);
		// frame.getContentPane().add(confetti);
		// frame.pack();
		// frame.setVisible(true);
		// //confetti.run();

		//yasc();
		//main.endtext();
	}
	

	}
