//
// Bounce.java
//


import processing.core.*;
import java.util.*;


public class Project2 extends PApplet
{
    public void settings()
    {
        size(800, 800);
    }

    public void setup()
    {
        balls = new ArrayList<Ball>();
        createBall();
    }

    public void createBall()
    {
        PVector position = new PVector(mouseX,mouseY);

        PVector velocity = PVector.random2D();
        velocity.setMag(random(100));

        float radius = random(20);
        int c = color(random(256), random(256), random(256));

        Ball ball = new Ball(this,
                             position,
                             velocity,
                             radius,
                             c);

        balls.add(ball);
    }

    public void draw()
    {
        background(255);

        for (Ball ball : balls)
            ball.display();
    }

    public void keyPressed()
    {
        for (int i=0; i<1; i++)
            createBall();
    }

    public static void main(String[] args)
    {
        PApplet.main("Project2");
    }

    private ArrayList<Ball> balls;
}
