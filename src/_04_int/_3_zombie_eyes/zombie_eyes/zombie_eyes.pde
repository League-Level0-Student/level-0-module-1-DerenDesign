
void setup() {
  PImage face = loadImage("zombie.jpeg");
  size(500, 500);
  face.resize(500,500);
  image(face, 0, 0);
}
void draw() {
  fill(255-mouseY, 0, 0*mouseX);
 ellipse(90, 175, 50, 50);
  fill(0+mouseX, 255, 0+mouseY);
  ellipse(210, 160, 90, 65);
  fill (0 , 0, 0);
  ellipse(90, 175, 25, 25);
  ellipse (210,160, 45, 32);

}
