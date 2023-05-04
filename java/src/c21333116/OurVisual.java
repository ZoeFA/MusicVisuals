package c21333116;
import ddf.minim.AudioBuffer;
import ddf.minim.AudioPlayer;
import ddf.minim.Minim;
import ddf.minim.analysis.FFT;
import example.twerking;
import ddf.minim.*;
import ie.tudublin.Visual;
import ie.tudublin.VisualException;
import processing.core.PApplet;
import java.awt.Frame;

public class OurVisual extends Visual{

  YASC yasc;
  CubeVisual1 cube;
  myHeart mh;
  twerking twerk;
  Terrain ter;
 

  AudioBuffer ab;
  FFT fft;
  
  // color bg;

  int mode = 1;
  
  boolean lastPressed = false;

  Frame myFrame = new Frame();

  public void settings(){

    // size(1024, 1000, P3D);
    fullScreen(P3D, SPAN);

  }

  // void applyColorMode(){

  // }

  public void setup(){

    // Call loadAudio to load an audio file to process 
    startMinim();
    loadAudio("boysaliar.mp3");
    
    
    myFrame.setExtendedState(Frame.MAXIMIZED_BOTH);
    myFrame.setUndecorated(true);
    


    // colorMode(RGB, 255, 100, 100);
    // colorMode(RGB);
    // color bg = color(0, 0, 0);
    
    yasc = new YASC(this);
    cube = new CubeVisual1(this);
    mh = new myHeart(this);
    twerk = new twerking(this);
    ter = new Terrain(this);
 


    try
      {
          calculateFFT();
      }
      catch(VisualException e)
      {
          e.printStackTrace();
      }
    
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
    // background(255);

    switch (mode) {

      case 1:
      background(0);
        partOne();
        break;

      case 2:
      background(0);
        partTwo();
        break; 

      case 3:
      background(0);
        partThree();
        break;

      case 4:
      background(255,192,203);
        partFour();
        break;
      
      case 5:
        partFive();
        break;

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

        case '5':
          mode = 5;

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

    

    yasc.render();
    }

  void partTwo(){

    
    cube.render();

  }

  void partThree(){

    
    mh.render();

  }

  void partFour(){

    // color(RGB);

    twerk.render();
  }

  void partFive(){
    background(50);
    ter.render();
   
  }
}