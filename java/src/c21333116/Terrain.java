package c21333116;
import processing.opengl.*;
import jogamp.opengl.glu.nurbs.Backend;
import processing.core.PApplet;

public class Terrain {

//creating a terrain generation program in java using a 2d grid and perlin noise

  OurVisual v;

	public Terrain(OurVisual v)
	{
			this.v = v;
			
	}

    int cols, rows;
    int scl = 20; // Scale of each cell. Determines 
    int w = 1500; // Width of the terrain
    int h = 1000; // Height of the terrain

    float infinity = 0; //used to control "infinity" effect.

    float[][] terrain; // 2d array representing the terrains heigh values at x,y
    
    //sets the width and heigh of the processing window and uses P3D to render 3D graphics
    
    
   

    //initialises the terrain grid
    public void setup() {
        
    }

    public void render() {

      v.background(0, 0, 255);
      cols = w / scl; // calculates number of columns by dividing width by scale
      rows = h / scl; // calculates number of rows by dividing height by scale
      terrain = new float[cols][rows]; // creates 2d grid using the col and row variables
      v.smooth();



        infinity -= 0.1; // decreases variable to create the "scrolling infinitely" effect in the noise function
        float yOffset = infinity;
        // this for loop goes through each cell in the 2D grid, calculates a heigh value for the terrain using perlins noise.
        for (int y = 0; y < rows; y++) {
            float xOffset = 0;
            for (int x = 0; x < cols; x++) {
                terrain[x][y] = PApplet.map(v.noise(xOffset, yOffset), 0, 1, -100, 100); // the noise function creates smooth and random patterns
                xOffset += 0.2; // increments to create smooth pattern
            } // end inner for loop
            yOffset += 0.2; 
        } //end for loop

        v.background(0); // sets background to black
        v.translate(v.width / 2, v.height / 2); //
        v.rotateX(PApplet.PI / 3); // tilts view so it looks like you are looking down on it
        v.translate(-w / 2, -h / 2);

        //I wanted to use a colour similar to colours used in synthwave. 
        //So I set the colour to the HSB equivalent of #831177 which is a nice purple.
        v.fill(308, 87, 51);

        // setting the outline colour to black
        v.stroke(0);

        //draws terrain on screen through a series of connected triangles
        for (int y = 0; y < rows - 1; y++) { // goes through each row of cells in the 2D grid
            v.beginShape(PApplet.TRIANGLE_STRIP); // draws shape using triangle strip mode ehich basically draws a mesh using a strip of triangles
            for (int x = 0; x < cols; x++) {  
                v.vertex(x * scl, y * scl, terrain[x][y]); // gcreates a vertex at current cell position 
                v.vertex(x * scl, (y + 1) * scl, terrain[x][y + 1]); // creates vertex at cell position underneath
            } // end inner for loop
            v.endShape(); // finishes drawing shape and moves onto next row
        } // end for loop
    }

}
