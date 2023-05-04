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
       
        v.background(0);
        //calculating amplitude
        v.calculateAverageAmplitude();
        //calculating frequency
        v.calculateFrequencyBands();
           
            //calculating the colums to fill the screen
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
        //calculating scale of the heart baes on the heart scale
        float heartScale = 0.5f + amplitude * 2.0f;
        //calculating size of the heart shape
        heartSize = 35 * heartScale;
        // moves to the center of the screen
        v.translate(v.width/2, v.height/2);
       

        v.beginShape();
        //loop that defines edges of the heart
        for (float a = 0; a < PApplet.TWO_PI; a += 0.01)
        {
          //light pink color of heart
            v.fill(255, 192, 203);
            v.strokeWeight(3);
            //formula that generates left side of the heart
            float x = 16 * PApplet.pow(PApplet.sin(a), 3);
            ///calculates the y coordinate of the heart
            float y = -((13 * PApplet.cos(a)) - (5 * PApplet.cos(2*a)) - (2 * PApplet.cos(3*a)) - PApplet.cos(4*a));
            x *= heartSize;
            y *= heartSize;
            v.vertex(x, y);
        }
            v.endShape(PApplet.CLOSE);

            angle += v.getSmoothedAmplitude() * 0.5;
           
    }
    
}
   

   
