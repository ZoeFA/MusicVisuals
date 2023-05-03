package c21333116;

import java.util.ArrayList;

import processing.core.PApplet;

import processing.core.PVector;

public class YASC
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

			ship = new Ship(v.width / 2, v.height / 2, 80, 6, v);
			ship1 = new Ship(100, 100, 80, 6, v);
			ship2 = new Ship(200, 200, 80, 6, v); // Initialize ship2
			ship3 = new Ship(300, 300, 80, 6, v); // Initialize ship3
			ship4 = new Ship(400, 400, 80, 6, v); // Initialize ship4
			ship5 = new Ship(500, 500, 80, 6, v); // Initialize ship5
			v.colorMode(v.HSB);
	
			//v.println();
			v.println();
	}




	public ArrayList<Bullet> bullets = new ArrayList<Bullet>();

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
		

		v.fill(255);
		v.text("Bullets: " + bullets.size(), 50, 50);

	}
}
