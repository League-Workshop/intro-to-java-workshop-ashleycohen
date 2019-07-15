PImage rainbow;
  PImage unicorn;
void setup(){
  rainbow = loadImage("RainbowCloud.jpg");
  size(1000,600);
  rainbow.resize(1000,600);
  
  unicorn = loadImage("unicorn.png");
  unicorn.resize(480,400);
}

void draw(){
  background(rainbow);
  if(mousePressed){
    image(unicorn,400,100);
  }
  else{
    image(unicorn,mouseX,mouseY);
  }
}
