int red = 0, green = 0, blue = 0;
boolean isdrawmodeon = false;
int thickness = 5;
String brushshape = "CIRCULAR";

void setup() {
  size(1920, 1080);
  background(255);
}

void draw() {
  red = constrain(red, 0, 255);
  green = constrain(green, 0, 255);
  blue = constrain(blue, 0, 255);
  thickness = constrain(thickness, 1, 500);

  stroke(red, green, blue);
  fill(red, green, blue);
  rect(1820, 0, 100, 100);

  if (mousePressed && isdrawmodeon) {
    if (brushshape.equals("CIRCULAR")) {
      circle(mouseX, mouseY, thickness);
    } else if (brushshape.equals("RHOMBUS")) {
      beginShape();
      vertex(mouseX, mouseY - thickness / 2);
      vertex(mouseX - thickness / 2, mouseY);
      vertex(mouseX, mouseY + thickness / 2);
      vertex(mouseX + thickness / 2, mouseY);
      endShape(CLOSE);
    } else if (brushshape.equals("RECTANGLE")) {
      rect(mouseX - thickness / 2, mouseY - thickness / 2, thickness, thickness);
    }
  }

  if (keyPressed) {
    if (keyCode == SHIFT) {
      background(255);
    }
    if (key == 'r') {
      red += 3;
    } else if (key == 'g') {
      green += 3;
    } else if (key == 'b') {
      blue += 3;
    } else if (key == 'R') {
      red -= 3;
    } else if (key == 'G') {
      green -= 3;
    } else if (key == 'B') {
      blue -= 3;
    } else if (key == 'Q' || key == 'q') {
      thickness -= 2;
    } else if (key == 'E' || key == 'e') {
      thickness += 2;
    } else if (key == '1') {
      brushshape = "CIRCULAR";
    } else if (key == '2') {
      brushshape = "RHOMBUS";
    } else if (key == '3') {
      brushshape = "RECTANGLE";
    }
  }
}

void keyPressed() {
  if (key == ' ') {
    isdrawmodeon = !isdrawmodeon;
  }
}
