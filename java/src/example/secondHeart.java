package example;

import ie.tudublin.*;

public class secondHeart extends Visual {

  public void settings() {
    size(900, 900);
  }

  public void setup() {
    surface.setLocation(987, 70);
    strokeCap(CORNER);
    noLoop();
  }

  public void keyPressed()
  {
    if(key == ' '){
        redraw();
    }
  }

  public void draw()
   {
      float x;
      float angleVar = 60;
      float sW = 4;
        background(0);
        translate(width/2, height/2);

        for (int angle = 0; angle <= 360; angle += angleVar) {
        x = random(250, 300);
        pushMatrix();
        rotate(radians(angle));
        stroke(222, 0, 0);
        strokeWeight(sW);
        line(x, 0, x+sW, 0);
        popMatrix();
        }
  }

}
