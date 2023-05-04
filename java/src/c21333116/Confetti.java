package c21333116;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JPanel;


////////////////////////////
////JOANNE'S END VISUAL/////
////////////////////////////

public class Confetti extends JPanel {
    private static final long serialVersionUID = 1L;
//array of confetti
    private ArrayList<ConfettiShape> shapes = new ArrayList<>();
    private int width;
    private int height;
    private Random rand = new Random();
    private int xText1 = 0;
    private int xText2 = 0;
    private int xText3 = 0;
    private int xText4 = 0;

//constructor for confetti object
    public Confetti(int width, int height) {
        this.width = width;
        this.height = height;
        this.setBackground(Color.BLACK);
        this.setPreferredSize(new java.awt.Dimension(width, height));
        this.setDoubleBuffered(true);
    }

    //adds a conffeti shape to the shapes arraylist
    public void addShape() {
        ConfettiShape shape = new ConfettiShape(rand.nextInt(width), 0, rand.nextInt(10) + 5, rand.nextInt(10) + 5, new Color(rand.nextInt(256), rand.nextInt(256), rand.nextInt(256)));
        shapes.add(shape);
    }

    //updates the position of the shpaes and the text
    public void update() {

        //move the confettiShape objects down the screen
        //removes them if they are out of bounds
        for (int i = 0; i < shapes.size(); i++) {
            ConfettiShape shape = shapes.get(i);
            shape.update();
            if (shape.getY() > height) {
                shapes.remove(i);
            }
        }

        //move text across the screen
        xText1 += 5;
        if (xText1 > width) {
            xText1 = 0;
        }
        xText2 += 5;
        if (xText2 > width) {
            xText2 = 0;
        }
        xText3 += 5;
        if (xText3 > width) {
            xText3 = 0;
        }
        xText4 += 5;
        if (xText4 > width) {
            xText4 = 0;
        }
    }

    //draw the confetti and text onto the screen
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.WHITE);
        g.setFont(new Font("Arial", Font.BOLD, 72));
        g.drawString("Boy's A Liar", xText1, height / 4);
        g.drawString("FT. Ice Spice", xText2, 370);
        g.drawString("Pink Pantress", xText3, height / 2 );
        g.drawString("        By:", xText4, 230);
        for (ConfettiShape shape : shapes) {
            shape.draw(g);
        }
    }

    //main method to run the program
    public void run() throws InterruptedException {
        while (true) {
            addShape();
            update();
            repaint();
            Thread.sleep(10);
        }
    }

    //start
    public static void main(String[] args) throws InterruptedException {
        JFrame frame = new JFrame("Confetti");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Confetti confetti = new Confetti(800, 600);
        frame.getContentPane().add(confetti);
        frame.pack();
        frame.setVisible(true);
        confetti.run();
    }

    //nested conffeti class
    private class ConfettiShape {
        private int x;
        private int y;
        private int width;
        private int height;
        private Color color;

        public ConfettiShape(int x, int y, int width, int height, Color color) {
            this.x = x;
            this.y = y;
            this.width = width;
            this.height = height;
            this.color = color;
        }

        public void update() {
            y += rand.nextInt(5) + 0.3;
        }

        public void draw(Graphics g) {
            g.setColor(color);
            g.fillRect(x, y, width, height);
        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }
    }
}

