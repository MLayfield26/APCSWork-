
import processing.core.*;

public class ProcessingProject extends PApplet{
    public void settings(){
        size(800, 800);
    }

    public void setup(){
    }

    public void draw(){
        background(0);
        println("processing is fun!");
    }

    public static void main(String[] args)
    {
        PApplet.main("ProcessingProject");
    }
}
