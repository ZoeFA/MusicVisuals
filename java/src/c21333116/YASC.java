package c21333116;

import java.util.ArrayList;

import processing.core.PApplet;

import processing.core.PVector;


//////////////////////////////
////JOANNE'S VISUAL KEY 1/////
//////////////////////////////

public class YASC
{

	//declare ship variables
	Ship ship;
	Ship ship1;
	Ship ship2;
	Ship ship3;
	Ship ship4;
	Ship ship5;
	Ship ship6;
	Ship ship7;
	Ship ship8;
	Ship ship9;
	Ship ship10;
	Ship ship11;

	OurVisual v;


	public YASC(OurVisual v)
	{
			this.v = v;

			// ship = new Ship(v.width / 2, v.height / 2, 80, 6, v);
			//initialize ships

			//ships in a heart shape
			ship1 = new Ship(1150, 400, 80, 6, v);//right line start
			ship9 = new Ship(1050, 500, 80, 6, v);//right
			ship10 = new Ship(950, 600, 80, 6, v);//right
			ship11 = new Ship(875, 700, 80, 6, v);//right
			ship2 = new Ship(800, 400, 80, 6, v); //mid point
			ship3 = new Ship(600, 250, 80, 6, v);//left arc 
			ship4 = new Ship(400, 400, 80, 6, v); //left line start
			ship5 = new Ship(500, 500, 80, 6, v); //left
			ship = new Ship(600, 600, 80, 6, v);//left
			ship6 = new Ship(700, 700, 80, 6, v);//left
			ship7 = new Ship(800, 800, 80, 6, v);//left
			ship8 = new Ship(950, 250, 80, 6, v);//right arc
			v.colorMode(PApplet.HSB);
	
			//v.println();
			PApplet.println();
	}




	public ArrayList<Bullet> bullets = new ArrayList<Bullet>();

	//draws in the ships, allows them to move
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

		ship6.render();
		ship6.move();

		ship7.render();
		ship7.move();

		ship8.render();
		ship8.move();

		ship9.render();
		ship9.move();

		ship10.render();
		ship10.move();

		ship11.render();
		ship11.move();


		//create bullets
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
