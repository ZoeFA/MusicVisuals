package example;

import ie.tudublin.Visual;
import ie.tudublin.VisualException;

public class circle extends Visual {

    public void settings() {
        size(800, 800, P3D);
        println("CWD: " + System.getProperty("user.dir"));
    }

    public void keyPressed() {
        if (key == ' ') {
            getAudioPlayer().cue(0);
            getAudioPlayer().play();

        }
    }

    public void setup() {
        colorMode(HSB);
        noCursor();
        setFrameSize(256);

        startMinim();
        loadAudio("boysaliar.mp3");
        getAudioPlayer().play();
    }

    public void draw() {
        background(0);
        calculateAverageAmplitude();
        try {
            calculateFFT();
        } catch (VisualException e) {
            e.printStackTrace();
        }
        calculateFrequencyBands();

        // background(255);

        int xPos = 50;
        int yPos = 50;
        int circleSize = 20;
        int spacing = 30;

        while (yPos < height) {
            fill(255, 0, 0);
            noStroke();
            ellipse(xPos, yPos, circleSize, circleSize);

            yPos += spacing;
            circleSize += 10;

            if (yPos > height) {
                yPos = 50;
                xPos += spacing;
                circleSize = 20;
            }
        }
    }
}
