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


	public static void main(String[] args) throws InterruptedException
	{
		Main main = new Main();

		main.boysaliar();
		//main.myheart();


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
