package example;

import ie.tudublin.Visual;
import ie.tudublin.VisualException;

public class myHeart extends Visual {


    public void settings()
    {
        size(800, 800, P3D);
        println("CWD: " + System.getProperty("user.dir"));
        //fullScreen(P3D, SPAN);
    }

    public void keyPressed()
    {
        if (key == ' ')
        {
            getAudioPlayer().cue(0);
            getAudioPlayer().play();
           
        }
 
    }

    public void setup()
    {
        colorMode(HSB);
        noCursor();
       
        setFrameSize(256);

        startMinim();
        loadAudio("boysaliar.mp3");
        getAudioPlayer().play();
        //startListening();
       
    }

    float radius = 200;

    float smoothedBoxSize = 0;

    float rot = 0;

    float angle = 0;
    float heartSize = 200;

    public void draw()
    {
        calculateAverageAmplitude();
        try
        {
            calculateFFT();
        }
        catch(VisualException e)
        {
            e.printStackTrace();
        }
        calculateFrequencyBands();
       
        background(255);
        
        int numColumns = width / 20;
        for (int i = 0; i < numColumns; i++) {
            if (i % 2 == 0) {
                fill(255, 102, 0); // orange color for even columns
            } else {
                fill(255, 0, 255); // pink color for odd columns
            }
            rect(i * 20, 0, 20, height); // draw the column
        }
        

        float amplitude = getSmoothedAmplitude();
        float heartScale = 0.5f + amplitude * 0.5f;
        heartSize = 10 * heartScale;

        translate(width/2, height/2);
        
        beginShape();
        for (float a = 0; a < TWO_PI; a += 0.01)
        {
            fill(255, 192, 203);
            strokeWeight(3);
            float x = 16 * pow(sin(a), 3);
            float y = -((13 * cos(a)) - (5 * cos(2*a)) - (2 * cos(3*a)) - cos(4*a));
            x *= heartSize;
            y *= heartSize;
            vertex(x, y);
        }
            endShape(CLOSE);

            angle += getSmoothedAmplitude() * 0.01;
    }
    
}
   

   
