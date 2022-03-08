import processing.core.PApplet;

public class Sketch extends PApplet {

  
  float housex = random(0, 200);
  float housey = random(50, 200);

  float sunx = random(25,375);

  int hour = hour();
  int min = minute();
  int sec = second();
  
  /*
  int randx = 100; // 100 for original
  int randy = 200; // 50 for original
  */
  
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(400, 400);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    // Renders background later on

    // Outputs housex and housey
    System.out.println("");
    System.out.println("housex: " + housex);
    System.out.println("housey: " + housey);
    System.out.println("");
    System.out.println("hours: " + hour);
    System.out.println("minutes: " + min);
    System.out.println("seconds: " + sec);
    System.out.println("");
    System.out.println("sunx: " + sunx);
    System.out.println("");
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
    // Sky colour
    if (hour >= 7 && hour <= 19) { // Day
      background(135, 206, 235); // Blue
    }
    else if (hour >= 21 && hour <= 24 || hour >= 0 && hour <= 5) { // Night
      background(0, 0, 139); // Dark blue
    }
    else {
      background(255, 153, 51); // Orange
    }

    // Circle for sun
    if (hour >= 7 && hour <= 19) { // Day
      fill(255, 233, 0); // Yellow
      ellipse(sunx, 100, 100, 100);
    }
    else if (hour >= 21 && hour <= 24 || hour >= 0 && hour <= 5) { // Night
      fill(255, 255, 255); // White
      ellipse(sunx, 100, 100, 100);
    }
    else {
      fill(255, 215, 0); // Orange
      ellipse(sunx, 100, 100, 100);
    }
    
    // Rectangle for grass
    fill(86, 125, 70); // Green
    rect(0, 300, 400, 100);
    
    // Base square for house
    fill(255, 248, 220); // White
    rect(housex, housey+50, 200, 200);

    // Triangle for roof
    fill(170, 1, 20); // Red
    triangle(housex, housey+50, housex+200, housey+50, housex+100, housey);

    // Rectangle for door
    fill(196, 164, 132); // Light brown
    rect(housex+100, housey+150, 50, 100);

    // Clock (hour, minutes, seconds)
    text(+hour, 1, 10);
    text(+min, 21, 10);
    text(+sec, 41, 10);
  }
  
}