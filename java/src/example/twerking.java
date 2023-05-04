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


        int centerX = v.width / 2;

        int centerY = v.height / 2;

        float circleSize = 150;

        float spacing = 70;

      

        while (circleSize < v.width) {//background circles/ellipses

            int x = centerX;

            int y = centerY;

       

            float aspectRatio = (float) (0.2 * (circleSize / 100.0)); // calculate aspect ratio based on circle size

            v.ellipse(centerX, centerY, circleSize, circleSize * aspectRatio); // use dynamic aspect ratio

      

            circleSize += 90;

            spacing += 80; // increase the distance between circles

        }


 

        //boy

        v.calculateAverageAmplitude();

            

            v.calculateFrequencyBands();

          
            

        

            v.fill(255, 165, 0); // Orange fill color

            v.ellipse(centerX, 200, 70, 70);
            

           

            v.fill(255);

            v.rect(centerX - 50, 235, 100, 90);

      

            v.fill(255);

            v.stroke(255, 165, 0);

            v.strokeWeight(28);

           

            v.fill(255);
            
           
            //legs
            v.line(900, 550, 900, 700);

            v.fill(255);

            v.line(1000, 550, 1000, 700);
            //line(379, 450, 379, 500);

            

            //line(434, 350, 434, 390);

      
            //asscheecks

            float ellipseSize = 50 + v.getSmoothedAmplitude() * 200;

            float ellipseOffset = 400 + v.getSmoothedAmplitude() * 200;

            v.fill(255);

            v.ellipse(centerX - 45, ellipseOffset, ellipseSize, ellipseSize);

      

            v.ellipse(centerX + 30, ellipseOffset, ellipseSize, ellipseSize);
        
    }

}
