package example;

import c21333116.OurVisual;
import ie.tudublin.Visual;
import ie.tudublin.VisualException;

public class twerking {
    
    OurVisual v;

    public twerking(OurVisual v)
    {
            this.v = v;
           
    }

    public void render()
    {
        v.calculateAverageAmplitude();
        v.calculateFrequencyBands();
       
       
        v.background(255,192,203);
        v.noFill();
        v.stroke(255,165,0);
        v.strokeWeight(10);

          //calculating the x coordinate of the center of the screen

        int centerX = v.width / 2;
          //calculating the y coordinate of the center of the screen

        int centerY = v.height / 2;

        float circleSize = 150;
        float spacing = 70;

     
        // loop that draws circles till it reaches the width of the page
        while (circleSize < v.width) {//background circles/ellipses

            int x = centerX;
            int y = centerY;
       
            //aspect ratio to make the ellipse look more like a circle
            float aspectRatio = (float) (0.2 * (circleSize / 100.0)); // calculate aspect ratio based on circle size

            v.ellipse(centerX, centerY, circleSize, circleSize * aspectRatio); // use dynamic aspect ratio

     

            circleSize += 90;
              // adds space between the pixels
            spacing += 80; // increase the distance between circles

        }

        //boy
          //calculating the amplitude
        v.calculateAverageAmplitude();

        //calculating the frequency bands
        v.calculateFrequencyBands();

        v.fill(255, 165, 0); // Orange fill color
        v.ellipse(centerX, 150, 70, 70);
        v.fill(255);
        v.rect(centerX - 50, 235, 100, 90);
        v.fill(255);
        v.stroke(255, 165, 0);
        v.strokeWeight(28);

        v.fill(255);         
        v.line(900, 450, 900, 550);
        v.fill(255);
        v.line(1000, 450, 1000, 550);
     
        //asscheecks     
        // ellipseSize:calculates the distance of the ellipses based on the amplit

        float ellipseSize = 50 + v.getSmoothedAmplitude() * 200;
        float ellipseOffset = 400 + v.getSmoothedAmplitude() * 200;
        v.fill(255);
        v.ellipse(centerX - 45, ellipseOffset, ellipseSize, ellipseSize);
        v.ellipse(centerX + 30, ellipseOffset, ellipseSize, ellipseSize);
       
    }

}
