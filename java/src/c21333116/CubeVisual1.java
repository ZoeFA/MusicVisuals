package c21333116;

import ie.tudublin.Visual;

public class CubeVisual1 extends Visual
{

    String textToMove = "Boy's A Liar";
    int yPos = 0;
    int xPos = 0;

    OurVisual v;


	public CubeVisual1(OurVisual v)
	{
			this.v = v;
			
	}


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
        
    }

    float smoothedBoxSize = 0;

    public void draw()
    {
        calculateAverageAmplitude();
        background(0);
        noFill();
        lights();
        stroke(map(getSmoothedAmplitude(), 0, 1, 0, 45), 175, 255);
        camera(0, 0, 0, 0, 0, -1, 0, 1, 0);
        translate(0, 0, -250);
               
        float boxSize = 50 + (getAmplitude() * 300);//map(average, 0, 1, 100, 400); 
        smoothedBoxSize = lerp(smoothedBoxSize, boxSize, 0.5f);        
        
        rotateY(angle);
        rotateX(angle);
        strokeWeight(1);//
            
        beginShape();//r changes size of heart
            for (float a = 0; a < TWO_PI; a+= 0.01){
            float r = 1;
            float x = r * 16 * pow(sin(a), 3);
            float y = -r * (13 * cos(a) - 5 * cos(2 * a) - 2 * cos(3 * a) - cos(4 * a));
            vertex(x, y);
            }
        endShape();
        
        
        
        strokeWeight(5);
        
        box(smoothedBoxSize);
        angle += 0.01f;

        textAlign(CENTER, CENTER);
        textSize(32);
        text(textToMove, xPos, yPos);
        if (yPos > height){
            yPos = 0;
        }
        else if (xPos > width){
            xPos = 0;
        }


    }

    float angle = 0;

} 