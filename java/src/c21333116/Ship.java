package c21333116;

import processing.core.PApplet;
import processing.core.PVector;

public class Ship {
    private PVector pos;
    private PVector forward;
    private PApplet p;

    public Ship(float x, float y, float size, int c, PApplet p)
    {
        pos = new PVector(x, y);
        forward = new PVector(0, -1);
        this.size = size;
        this.halfSize = size / 2;
        this.c = c;       
        this.p = p;  
    }


    public PVector getPos() {
        return pos;
    }
    public void setPos(PVector pos) {
        this.pos = pos;
    }
    public float getRot() {
        return rot;
    }
    public void setRot(float rot) {
        this.rot = rot;
    }
    public int getC() {
        return c;
    }
    public void setC(int c) {
        this.c = c;
    }
    public float getSize() {
        return size;
    }
    public void setSize(float size) {
        this.size = size;
    }
    private float rot;
    private int c;
    private float size;
    private float halfSize;

    public void move()
    {
        forward.x = PApplet.sin(rot);
        forward.y = - PApplet.cos(rot);

        OurVisual ourVisual = (OurVisual) p;
        YASC yasc = ourVisual.yasc;
        
        
        if (ourVisual.keys[PApplet.LEFT])
        {
            rot -= 0.1f;
        }

        if (ourVisual.keys[PApplet.RIGHT])
        {
            rot += 0.1f;
        }

        if (ourVisual.keys[PApplet.UP])
        {
            pos.x += forward.x;
            pos.y += forward.y;
        }

        if (ourVisual.keys[PApplet.DOWN])
        {
            pos.x -= forward.x;
            pos.y -= forward.y;
        }
        if (ourVisual.keys[' '])
        {
            PVector inFront = PVector.add(pos,
                PVector.mult(forward, 30)
                );  
            
            Bullet b = new Bullet(inFront.x, inFront.y, rot, c, p);

            yasc.bullets.add(b);
        }
    }

    public void render() {
        p.pushMatrix();
        p.translate(pos.x, pos.y);
        p.rotate(rot);
        p.stroke(c, 255, 255);
        p.fill(c, 255, 255);
        float r = halfSize * 0.5f;
        float x = 0;
        float y = -r * 2.5f;
        p.beginShape();
        p.vertex(x, y + r);
        p.bezierVertex(x + r, y - r, x + r * 2, y + r, x, y + r * 2);
        p.bezierVertex(x - r * 2, y + r, x - r, y - r, x, y + r);
        p.endShape();
        p.popMatrix();
    }
    
    
    
}






