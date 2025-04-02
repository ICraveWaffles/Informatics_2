

float x_mcu = 500;
float y_mcu = 500;
float r_mcu = 200;
float w_mcu = PI;

float x_brown = 500;
float y_brown = 100;

float a_moh = 200;
float w_moh = TWO_PI / 10;
float k_moh = 0.02;

float bg_color = 0;
float bg_sat = 0;

float desfase;
float rotación;


float past_brown_x;
float past_brown_y;


PImage bacteria; 

PFont ComicSans;
PFont Futura;
PFont Goth;



void setup(){
  size(1000,1000);
  frameRate(30);
  colorMode(HSB);
  noFill();
  bacteria = loadImage("lilbrown.png");
  imageMode(CENTER);
  
  ComicSans = createFont("ComicSans.ttf",150);
  Futura = createFont("Consolas.ttf",150);
  Goth = createFont("Dearest.ttf",150);
  textAlign(CENTER);
  
  
  
 
}

void draw(){
  
  noFill();
  bg_color += 0.05;
  bg_sat += 0.02;
  desfase += 10.01;
  
  background(255*sin(bg_color),127*cos(bg_sat),200);
  
  
  
  for (float i = 0; i < 120; i++){
    circle(450  * sin(radians(i*2.3333333333+desfase) )+ width/2, 200 * cos(radians(i*2.333333333+desfase)) + height/2, 400);
  }
  for (float i = 0; i < 90; i++){
    circle(450 * sin(radians(i*3+desfase+180) )+ width/2, 200 * cos(radians(i*3+desfase)) + height/2, 200);
  }
  for (float i = 0; i < 90; i++){
    circle(300 * sin(radians(i*2+desfase) )+ width/2, 450 * cos(radians(i*2+desfase*2)) + height/2, 50);
  }
   for (float i = 0; i < 180 ; i++){
    circle(300 * sin(radians(i+desfase*2) )+ width/2, 300 * cos(radians(i+desfase)) + height/2, 50);
  }
  
  fill(0,255,128);
  
  textFont(Goth);
  text("ASD", x_brown +0.2*a_moh*sin (w_moh*frameCount/2),y_brown+150);
  textFont(ComicSans);
  text("FMO", x_brown,y_brown+300);
  
  fill((desfase/2) % 255 + 2,255,128);
  textFont(Futura);
  text("VIE", x_brown,y_brown+450);
  
  
  x_brown += random(-15, 15);
  y_brown += random(-5, 5);
  imageMode(CENTER);
  rotate(radians(random(-1,1)));
  image(bacteria, x_brown, y_brown);
  
  
  
  
}
