package example;

import ie.tudublin.Visual;
import ie.tudublin.VisualException;

public class twerking extends Visual{
    
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
  
  
        ellipse(400,200,70,70);
        float ellipse1Size = 20 + getSmoothedAmplitude() * 150;
        float ellipse1Offset = 320 + getSmoothedAmplitude() * 50;
        ellipse(370, ellipse1Offset, ellipse1Size, ellipse1Size);
    
        // Calculate the size and position of ellipse 2 based on the amplitude of the audio
        float ellipse2Size = 20 + getSmoothedAmplitude() * 150;
        float ellipse2Offset = 320 + getSmoothedAmplitude() * 50;
        ellipse(430, ellipse2Offset, ellipse2Size, ellipse2Size);
    
        fill(255, 165, 0); // Orange fill color
       
        ellipse(400, 200, 70, 70);
        
    
        rect(385, 235, 30, 60);
        fill(0);
        stroke(2);
    
        line(370, 350, 370, 390);
        strokeWeight(3);
        fill(0);
    
        line(379, 350, 379, 390);
        strokeWeight(3);
        fill(0);
    
        line(425, 350, 425, 390);
        strokeWeight(3);
        fill(0);
    
        line(434, 350, 434, 390);
        strokeWeight(3);
        fill(0);
  
  
        
    }

}
