package c21333116;

// import ie.tudublin.Visual;
import processing.core.PApplet;

public class CubeVisual1
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
        v.size(800, 800, PApplet.P3D);
        v.println("CWD: " + System.getProperty("user.dir"));
        //fullScreen(P3D, SPAN);
    }

    // public void keyPressed()
    // {
    //     if (key == ' ')
    //     {
    //         getAudioPlayer().cue(0);
    //         getAudioPlayer().play();
            
    //     }
    // }

    // public void setup()
    // {
    //     colorMode(HSB);
    //     noCursor();
        
    //     setFrameSize(256);

    //     startMinim();
    //     loadAudio("boysaliar.mp3");
        
    // }

    float smoothedBoxSize = 0;

    public void render()
    {
        v.calculateAverageAmplitude();
        // background(0);
        v.noFill();
        v.lights();
        v.stroke(v.map(v.getSmoothedAmplitude(), 0, 1, 0, 45), 175, 255);
        v.camera(0, 0, 0, 0, 0, -1, 0, 1, 0);
        v.translate(0, 0, -250);
               
        float boxSize = 50 + (v.getAmplitude() * 300);//map(average, 0, 1, 100, 400); 
        smoothedBoxSize = v.lerp(smoothedBoxSize, boxSize, 0.5f);        
        
        v.rotateY(angle);
        v.rotateX(angle);
        v.strokeWeight(1);//
            
        v.beginShape();//r changes size of heart
            for (float a = 0; a < v.TWO_PI; a+= 0.01){
            float r = 1;
            float x = r * 16 * v.pow(v.sin(a), 3);
            float y = -r * (13 * v.cos(a) - 5 * v.cos(2 * a) - 2 * v.cos(3 * a) - v.cos(4 * a));
            v.vertex(x, y);
            }
        v.endShape();
        
        
        
        v.strokeWeight(5);
        
        v.box(smoothedBoxSize);
        angle += 0.01f;

        v.textAlign(v.CENTER, v.CENTER);
        v.textSize(32);
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