package c21333116;
import ddf.minim.AudioBuffer;
import ddf.minim.AudioPlayer;
import ddf.minim.Minim;
import ie.tudublin.Visual;
import ie.tudublin.VisualException;
import processing.core.PApplet;
import java.awt.Frame;

public class OurVisual extends Visual{

  YASC yasc;

  CubeVisual1 cube;

  AudioBuffer ab;
  

  int mode = 1;
  
  boolean lastPressed = false;

  Frame myFrame = new Frame();

  public void settings(){

    // size(1024, 1000, P3D);
    fullScreen(P3D);

  }

  public void setup(){

    // Call loadAudio to load an audio file to process 
    startMinim();
    loadAudio("boysaliar.mp3");
    
    
    myFrame.setExtendedState(Frame.MAXIMIZED_BOTH);
    myFrame.setUndecorated(true);
    
    colorMode(HSB);
    
    yasc = new YASC(this);
    cube = new CubeVisual1(this);
    
  }

  public boolean[] keys = new boolean[1024];

	public void keyPressed()
	{
		keys[keyCode] = true;

    if (key >= '0' && key <= '9') {
			mode = key - '0';
		}
    if (keyCode == ' ') {
      if (getAudioPlayer().isPlaying()) {
        //getAudioPlayer().pause();
      } else {
        getAudioPlayer().rewind();
        getAudioPlayer().play();
      }
    }

	}

	public void keyReleased()
	{
		keys[keyCode] = false;
	}


  @Override
  public void draw(){
    background(0);

    switch (mode) {

      case 1:
        partOne();
        break;

      case 2:
        partTwo();
        break; 

      // case 3:
      //   partThree();
      //   break;

      // case 4:
      //   partFour();
      //   break;
      
      default:
        break;
    }

    //keyPressingLogic();
  }


  void keyPressingLogic(){

    if(keyPressed){

      switch(key){

        case '1':
          mode = 1;
        
        case '2':
          mode = 2;

        case '3':
          mode = 3;

        case '4':
          mode = 4;

        default:
          break;
      }
      lastPressed = true;
    }
    else{
      lastPressed = false;
    }
  }

  void partOne(){

    // catch(VisualException e){

    //   e.printStackTrace();
    // }

    yasc.render();
    }

  void partTwo(){

    
    cube.render();

  }
}