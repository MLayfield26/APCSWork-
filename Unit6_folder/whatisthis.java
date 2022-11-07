//
// Bounce.java
//


import processing.core.*;
import java.util.*;
int cellSize = 10;

public class whatisthis extends PApplet
{
    public void settings()
    {
        size(800, 800);
    }

    public void setup()
    {
  public static String cells = new int[400/cellSize];

  cells[cells.length/2] = 1;
    }

  public void draw() {
    for (int i = 0; i < cells.length; i++) {

    if (cells[i] == 1) {
      fill(0);
    } else {
      fill(255);
    }
}
}

    public void keyPressed()
    {

    }

    public static void main(String[] args)
    {
        PApplet.main("whatisthis");
    }

  //  private ArrayList<Ball> balls;
}
