PImage pepperoni;
PImage olives;
void setup() {
  pepperoni = loadImage("pepperoni.png");
  olives = loadImage("olive.png");
  size(500,500);
  fill(#DEAE10);
  ellipse(250, 250, 250, 250);
  fill(#DE5F10);
  ellipse(250, 250, 150, 150);
  fill(#DED410);
  ellipse(250, 250, 100, 100);
  
}
void draw() {
  if (mousePressed) {
  image(pepperoni,250,200);
  image(olives,200,200);
  }

  
    
}
