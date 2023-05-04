package example;
//import processing.core.*;
import ddf.minim.AudioBuffer;
import c21333116.OurVisual;
//import ie.tudublin.*;
import ie.tudublin.Visual;
import processing.core.PApplet;

public class Heart {
  AudioBuffer ab;
  WaveForm wf;
  AudioBandsVisual abv;
  float[] lerpedBuffer;

  float x1, y1, x2, y2;
	float x1dir, x2dir, y1dir, y2dir;
	float c = 0;



  OurVisual v;


	public Heart(OurVisual v)
	{
			this.v = v;
			
	}

  // public void settings(){

  //   size(1024, 500);
    
  // }

  // public void setup(){
  //   colorMode(HSB);
  //   noCursor();
    
  //   setFrameSize(256);

  //   startMinim();
  //   loadAudio("boysaliar.mp3");
  //   getAudioPlayer().play();

  
  //   //wf = new WaveForm(this);
  //   //abv = new AudioBandsVisual(this);
  //   lerpedBuffer = new float[width];

  //   //fft = new FFT(width, 44100);

  //   colorMode(HSB);
	// 	background(0);

  //   /*
	// 	x1 = random(0, width);
	// 	x2 = random(0, width);
	// 	y1 = random(0, height);
	// 	y2 = random(0, height);

	// 	float range = 5;

	// 	x1dir = random(-range, range);
	// 	x2dir = random(-range, range);
	// 	y1dir = random(-range, range);
	// 	y2dir = random(-range, range);

	// 	smooth();
  //   */
  // }

  // public void keyPressed()
  // {
  //     if (key == ' ')
  //     {
  //         getAudioPlayer().cue(0);
  //         getAudioPlayer().play();
  //     }
  // }

  public void draw(){
    //background(0);

    
    v.translate(v.width/2, v.height/2);
    v.pushMatrix();
    v.popMatrix();
    //noFill();
    //stroke(255);
    v.fill(0);
    v.beginShape();
    for (float a = 0; a < v.TWO_PI; a+= 0.01){
      float r = 10;
      float x = r * 16 * v.pow(v.sin(a), 3);
      float y = -r * (13 * v.cos(a) - 5 * v.cos(2 * a) - 2 * v.cos(3 * a) - v.cos(4 * a));
      v.vertex(x, y);
    }
    v.endShape();    
    
    


    
    v.strokeWeight(2);
    //stroke(map(getSmoothedAmplitude(), 0, 1, 0, 255), 255, 255);
		v.stroke(c, 175, 255);
		c = (c + 1f) % 30;
		v.line(x1, y1, x2, y2);

    

		x1 += x1dir;
		x2 += x2dir;
		y1 += y1dir;
		y2 += y2dir;
		
		if (x1 < 0 || x1 > v.width)
		{
			x1dir = - x1dir;
		}
		if (y1 < 0 || y1 > v.height)
		{
			y1dir = - y1dir;
		}

		if (x2 < 0 || x2 > v.width)
		{
			x2dir = - x2dir;
		}
		if (y2 < 0 || y2 > v.height)
		{
			y2dir = - y2dir;
		}

    
  }
  
  public void render(){

    float halfH = v.height / 2;
    //float average = 0;
    //float sum = 0;
    //off += 1;
    
    for(int i = 0 ; i < ab.size() ; i ++)
      {
          //float c = map(ab.get(i), -1, 1, 0, 255);
          float c = v.map(i, 0, ab.size(), 0, 255);
          v.stroke(c, 255, 255);
          //stroke(map(getSmoothedAmplitude(), 0, 1, 0, 255), 255, 255);
          float f = lerpedBuffer[i] * halfH * 4.0f;
          v.line(halfH + f, i, halfH - f, i);                    
      }
    }  
}
