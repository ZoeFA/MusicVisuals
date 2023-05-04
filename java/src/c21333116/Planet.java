package c21333116;

import processing.core.PApplet;
import processing.opengl.*;
import ddf.minim.*;
import ddf.minim.analysis.FFT;  


public class Planet {

  OurVisual v;

	public Planet(OurVisual v)
	{
			this.v = v;
			
	}
   
    float angle = 0; // used for rotation of the planet
    float planetRadius = 150; // sets planets randius
    float ringRadius = 250; // sets rings radius
    float ringThickness = 15; // sets the rings thickness

    float smoothedAmplitude = 0; // used the smooth the amplitude

    //sets the processing window to fullscreen uses P3D to render 3D graphics

    v.fft = new FFT(player.bufferSize(), player.sampleRate()); // creates new instance of the fft variable

    //renders planet
    public void render() {


      v.smooth();
      // colorMode(HSB, 360, 100, 100);
      // fft = new FFT(PApplet.player.bufferSize(), player.sampleRate()); // creates new instance of the fft variable


      v.background(0); //sets background colour to  black
      v.translate(v.width / 2, v.height / 2); // centers the planet
  
      // slightly rotates the entire sketch
      v.rotateX(PApplet.radians(20));
      v.rotateY(PApplet.radians(30));
  
      // creates rotating animation for the planet and the ring
      v.rotateX(PApplet.radians(angle));
      v.rotateY(PApplet.radians(angle));

      // makes the planet pulsate according to the aamplitude of the song
      // v.fft.forward(v.ab); // analyses the frequencies on the song
      // v.fft.forward(player.mix); 
      float level = v.fft.getBand(200); //gets amplitude of a specific band
      float mappedLevel = PApplet.map(level, 0, 255, 1, (float) 25); // maps the amplitude to a range between 1 and 25

      smoothedAmplitude = PApplet.lerp(smoothedAmplitude, mappedLevel, 0.2f); // lerp is used to update the amplitude and make it smoother
      float planetSize = planetRadius * smoothedAmplitude; // planet size is calculated by

      // draws the planet by creating a sphere
      v.fill(30, 100, 100); // makes the planet orange
      v.sphere(planetSize); // draws the sphere with a radius value from the initialisation
  
      // draws the ring
      v.pushMatrix(); // saves the current transformation matrix
      v.rotateX(PApplet.PI/2); // rotates the ring around the X-axis
      v.fill(330, 100, 100); // makes the ring pink
      v.stroke(330, 100, 100); // makes the outline pink
      torus(ringRadius, ringThickness); // draws the ring with the radius and thickness values from initialisation
      v.popMatrix(); // restores the previous transformation matrix


  
      angle += 0.5; //increases angle by 5 to make the rotatinf animation smooth
    }
   
    // I used a torus function which draws a 3d shape resembling a donut to create the ring for the planet
    void torus(float r1, float r2) {
        int detail = 50; // amount of polygons sets level of detail
        float TWO_PI = 6.283185307179586476925286766559f; //
        for (int i = 0; i < detail; i++) {
            v.beginShape(PApplet.TRIANGLE_STRIP);
            for (int j = 0; j <= detail; j++) {
                for (int k = 0; k <= 1; k++) {
                    float s = (i + k) % detail + 0.5f;
                    float t = j % detail;

                    // cartesian coordinates for each vertext of the torus
                    float x = (r1 + r2 * PApplet.cos(s * TWO_PI / detail)) * PApplet.cos(t * TWO_PI / detail);
                    float y = (r1 + r2 * PApplet.cos(s * TWO_PI / detail)) * PApplet.sin(t * TWO_PI / detail);
                    float z = r2 * PApplet.sin(s * TWO_PI / detail);

                    // each vector is calulated for detail control like shading
                    float nx = x - r1 * PApplet.cos(t * TWO_PI / detail);
                    float ny = y - r1 * PApplet.sin(t * TWO_PI / detail);
                    float nz = z;

                    // sets the normal and vertex vector coordinates
                    v.normal(nx, ny, nz);
                    v.vertex(x, y, z);
                }
            }
            v.endShape();
        }
    }
  }
