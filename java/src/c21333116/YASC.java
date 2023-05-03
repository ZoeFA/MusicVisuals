package c21333116;

import java.util.ArrayList;

import processing.core.PApplet;

import processing.core.PVector;

public class YASC extends PApplet
{
	Ship ship;
	Ship ship1;
	Ship ship2;
	Ship ship3;
	Ship ship4;
	Ship ship5;
	
	OurVisual v;


	public YASC(OurVisual v)
	{
			this.v = v;
			
	}


	public boolean[] keys = new boolean[1024]; 

	public void keyPressed()
	{
		keys[keyCode] = true;
	}

	public void keyReleased()
	{
		keys[keyCode] = false;
	}

	// Generic
	public ArrayList<Bullet> bullets = new ArrayList<Bullet>();


	public void settings()
	{

		PVector a = new PVector(10, 10);
        PVector b = new PVector(20, 20);

        b = a;
        
        b.x = 30;
        b.y = 30;

        println(a);
		
	}



	public void setup() {
		ship = new Ship(width / 2, height / 2, 80, 6, this);
		ship1 = new Ship(100, 100, 80, 6, this);
		ship2 = new Ship(200, 200, 80, 6, this); // Initialize ship2
    ship3 = new Ship(300, 300, 80, 6, this); // Initialize ship3
		ship4 = new Ship(400, 400, 80, 6, this); // Initialize ship4
		ship5 = new Ship(500, 500, 80, 6, this); // Initialize ship5
		colorMode(HSB);

		println();
	}

	public void render(){
		
		ship.render();
		ship.move();

		ship1.render();
		ship1.move();
		ship2.render(); // Render ship2
		ship2.move(); // Move ship2

		ship3.render(); // Render ship3
		ship3.move(); // Move ship3
 
		ship4.render(); // Render ship4
    ship4.move(); // Move ship4

		ship5.render(); // Render ship5
    ship5.move(); // Move ship5

		for(int i = bullets.size() - 1 ; i >= 0 ; i --)
		{
			Bullet b = bullets.get(i);
			b.render();
			b.move();
		}
		

		fill(255);
		text("Bullets: " + bullets.size(), 50, 50);

	}
}
