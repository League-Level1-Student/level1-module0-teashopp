int xpos = 0;
int ypos = 10;

int score = 0;

void setup(){
  
  size(1000,1000);
  xpos = (int)random(width);
  
}

void draw(){
 
  background(#0C5816);
  
  fill(#AA2011);
  stroke(#AA2011);
  ellipse(500, 900, 800, 800);
  
  fill(#FF8B2C);
  stroke(#FF8B2C);
  ellipse(500, 900, 700, 700);
  
  fill(#FFF52C);
  stroke(#FFF52C);
  ellipse(500, 900, 600, 600);
  
  fill(#3BD827);
  stroke(#3BD827);
  ellipse(500, 900, 500, 500);
  
  fill(#60AEED);
  stroke(#60AEED);
  ellipse(500, 900, 400, 400);
  
  fill(#CC60ED);
  stroke(#CC60ED);
  ellipse(500, 900, 300, 300);
  
  fill(#0C5816);
  stroke(#0C5816);
  ellipse(500, 900, 200, 200);
  
  
    fill(#0A1FFA);
    stroke(#0A1FFA);
    ellipse(xpos, ypos, 50, 50);
    ypos = ypos + 10;
    
   if (ypos >= 1000){
    ypos = 0; 
    xpos = (int)random(width);
   }
   
   rect(mouseX, 900, 100, 100);
   if (900 == ypos){
   checkCatch(xpos);
   }
   
   if (score >= 10){
    println("Your final score is " + score);
    exit();
   }
   
   fill(0, 0, 0);
    textSize(16);
    text("Score: " + score, 20, 20);
  
}

void checkCatch(int x){
         if (x > mouseX && x < mouseX+100)
            score++;
         else if (score > 0) 
            score--;
        println("Your score is now: " + score);
    }
  
