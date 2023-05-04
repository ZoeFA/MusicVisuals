package c21333116;

import javax.swing.border.StrokeBorder;

import ie.tudublin.Visual;
import ie.tudublin.VisualException;
import processing.core.PApplet;

public class myHeart {


    //calling ourvisual class
    OurVisual v;

	public myHeart(OurVisual v)
	{
			this.v = v;
			
	}


    float radius = 500;

    float smoothedBoxSize = 0;

    float rot = 0;

    float angle = 0;
    float heartSize = 700;




    public void render()
    {
        // v.applyColorMode();
        
        v.background(0);
        v.calculateAverageAmplitude();
        
        v.calculateFrequencyBands();
            
        int numColumns = v.width / 20;
        for (int i = 0; i < numColumns; i++) {
            v.stroke(0);
            if (i % 2 == 0) {
                v.fill(255, 102, 0); // orange color for even columns
            } else {
                v.fill(255, 0, 255); // pink color for odd columns
            }
            v.rect(i * 20, 0, 20, v.height); // draw the column
        }
        

        float amplitude = v.getSmoothedAmplitude();
        float heartScale = 0.5f + amplitude * 2.0f;
        heartSize = 35 * heartScale;

        v.translate(v.width/2, v.height/2);
        

        v.beginShape();
        for (float a = 0; a < PApplet.TWO_PI; a += 0.01)
        {
            v.fill(255, 192, 203);
            v.strokeWeight(3);
            float x = 16 * PApplet.pow(PApplet.sin(a), 3);
            float y = -((13 * PApplet.cos(a)) - (5 * PApplet.cos(2*a)) - (2 * PApplet.cos(3*a)) - PApplet.cos(4*a));
            x *= heartSize;
            y *= heartSize;
            v.vertex(x, y);
        }
            v.endShape(PApplet.CLOSE);

            angle += v.getSmoothedAmplitude() * 0.5;
           
    }
    
}
   

   
