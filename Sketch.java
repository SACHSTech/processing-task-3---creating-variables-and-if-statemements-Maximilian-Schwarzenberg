import processing.core.PApplet;

public class Sketch extends PApplet {

  float randx = random(-250, 400);
  float randy = random(-250, 400);

  
  /*
  int randx = 100; // 100 for original
  int randy = 50; // 50 for original
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

    // Outputs randx and randy
    System.out.println("");
    System.out.println("randx: " + randx);
    System.out.println("randy: " + randy);
    System.out.println("");
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
    // Sky colour
    if (randy == 50) { // On ground
      background(135, 206, 235); // Dark blue
    }
    else if (randy < 50 && randy > -250) { // In sky
      background(0, 0, 204); // Blue
    }
    else if (randy > 50 && randy < 400) { // Under ground
      background(210, 255, 173); // Light green
    }
    else {
      background(132, 37, 147); // Purple
    }
    
    // Rectangle for grass
    if (randy == 50) { // On ground
      fill(86, 125, 70); // Green
      rect(0, 300, 400, 100);
    }
    else if (randy < 50 && randy > -250) { // In sky
      // render nothing
    }
    else if (randy > 50 && randy < 400) { // Under ground
      fill(160, 82, 45); // Brown
      rect(0, 300, 400, 100);
    }
    else {
      // renders nothing
    }

    // Circle for sun
    if (randx == 100) { // Middle
      fill(255, 233, 0); //Yellow
      ellipse(50, 50, 50, 50);
    }
    else if (randx < 100 && randx > 0) { // Left
      fill(255, 233, 0); //Yellow
      ellipse(50, 50, (randx*50)/50, (randx*50)/50);
    }
    else if (randx > 100 && randx < 400) { // Right
      fill(255, 233, 0); //Yellow
      ellipse(50, 50, (randx/50)*50, (randx/50)*50);
    }
    else {
      // renders nothing
    }
    
    // Base square for house
    fill(255, 248, 220); // White
    rect(randx, randy+50, 200, 200);

    // Triangle for roof
    fill(170, 1, 20); // Red
    triangle(randx, randy+50, randx+200, randy+50, randx+100, randy);

    // Rectangle for door
    fill(196, 164, 132); // Light brown
    rect(randx+100, randy+150, 50, 100);
  }
  
}