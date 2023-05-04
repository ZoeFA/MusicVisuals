package c21333116;
// import java.applet.*;
// import java.awt.*;
// import java.awt.event.*;
// import java.awt.font.*;
// import processing.awt.PSurfaceAWT.SmoothCanvas;
// import ie.tudublin.Visual;
import processing.core.PApplet;

///////////////////////////
////ZOE'S VISUAL KEY 2/////
///////////////////////////

public class CubeVisual1
{

    //variables, x and y position and the text
    String textToMove = "Boy's A Liar";
    int yPos = 0;
    int xPos = 0;


    float c = 0;//colour


    //calling ourvisual class
    OurVisual v;

	public CubeVisual1(OurVisual v)
	{
			this.v = v;
			
	}

    //bozsize variable;
    float smoothedBoxSize = 0;

    public void render()
    {

        //cube shape
        v.calculateAverageAmplitude();//
        // background(0);
        v.noFill();//empty
        v.lights();
        v.stroke(PApplet.map(v.getSmoothedAmplitude(), 0, 1, 0, 45), 175, 255);
        v.camera(0, 0, 0, 0, 0, -1, 0, 1, 0);
        v.translate(0, 0, -250);
               
        float boxSize = 50 + (v.getAmplitude() * 700);//cube will increase in size based on amplitude of song and multiplier
                            //map(average, 0, 1, 100, 400); 
        smoothedBoxSize = PApplet.lerp(smoothedBoxSize, boxSize, 0.5f);  
        //smooth the amplitude so its less jittery      
        
        //shapes and text will spin
        v.rotateY(angle);
        v.rotateX(angle);
        v.strokeWeight(1);//
            
        //heart shape is inside the cube
        v.beginShape();//r changes size of heart
            for (float a = 0; a < PApplet.TWO_PI; a+= 0.01){
            float r = 1;
            float x = r * 16 * PApplet.pow(PApplet.sin(a), 3);
            float y = -r * (13 * PApplet.cos(a) - 5 * PApplet.cos(2 * a) - 2 * PApplet.cos(3 * a) - PApplet.cos(4 * a));
            v.vertex(x, y);
            }
        v.endShape();
        
        
        v.strokeWeight(5);
        
        v.box(smoothedBoxSize);
        angle += 0.01f;
        //speed of angle spin

        v.textAlign(PApplet.CENTER, PApplet.CENTER);
        v.textSize(32);
        

        // v.graphics2D.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING,
        // RenderingHints.VALUE_TEXT_ANTIALIAS_GASP);

        v.text(textToMove, xPos, yPos);
        if (yPos > v.height){
            yPos = 0;
        }
        else if (xPos > v.width){
            xPos = 0;
        }

        


    }

    float angle = 0;

} 