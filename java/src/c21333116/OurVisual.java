package c21333116;
import ddf.minim.AudioPlayer;
import ddf.minim.Minim;
import ie.tudublin.Visual;
import ie.tudublin.VisualException;
import processing.core.PApplet;

public class OurVisual extends Visual{

  YASC yasc;
  Loops loop;
  CubeVisual1 cube;
  Heart h;

  AudioPlayer ap;
  Minim minim;

  int mode = 0;

  public void settings(){

    size(1024, 1000);
    //fullScreen();

  }

  public void setup(){

    //startMinim();
    minim = new Minim(this);
    // Call loadAudio to load an audio file to process 
    ap = minim.loadFile("boysaliar.mp3");
    ap.play();
    
    //ab = ap.mix;
    colorMode(HSB);

    //y = height / 2;
    //smoothedY = y;

    
    loop = new Loops(this);
    cube = new CubeVisual1(this);
    h = new Heart(this);
    yasc = new YASC(this);
  }


  public void keyPressed() {
		if (key >= '1' && key <= '9') {
			mode = key - '1';
		}
		if (keyCode == ' ') {
            if (ap.isPlaying()) {
                ap.pause();
            } else {
                ap.rewind();
                ap.play();
            }
        }
	}


  // public void keyPressed()
  //   {
  //       if (key == ' ') //bind to spacebar
  //       {
  //           getAudioPlayer().cue(0);
  //           getAudioPlayer().play();

  //           cube.draw();
  //       }
  //   }



  public void draw(){
    background(0);

    switch (mode) {

      case 1:

      background(0);

      yasc.render();
      break;
    }

  }
  




}