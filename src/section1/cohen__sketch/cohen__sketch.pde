void setup (){
size(800,800);
background(190,256,256);
}

void draw(){
  if(mousePressed){
    fill(random(256),random(256),random(256));
  }
  else{
    fill(256,0,256);
  }
  triangle(40,40,760,40,360,760);
}
