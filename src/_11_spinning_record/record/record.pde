PImage pictureOfRecord;  

int speed = 10;
  
void setup(){

   size(600,600);
   pictureOfRecord= loadImage("record.jpeg");
   
    pictureOfRecord.resize(600,600);
    
    //minim = new Minim(this);  
    //song = minim.loadFile("awesomeTrack.mp3", 512);
  
}

void draw(){

  if(mousePressed){
  rotateImage(pictureOfRecord,speed);
   image(pictureOfRecord,0, 0);  

  }
  
   speed = speed + 1;
}

 void rotateImage(PImage image, int amountToRotate) {
   
        translate(width/2, height/2);
        rotate(amountToRotate*TWO_PI/360);
        translate(-image.width/2, -image.height/2); 
    }
